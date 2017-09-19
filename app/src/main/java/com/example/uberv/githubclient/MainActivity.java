package com.example.uberv.githubclient;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.uberv.githubclient.data.DataManager;
import com.example.uberv.githubclient.data.api.GithubApiService;
import com.example.uberv.githubclient.data.api.response.RepositoryResponse;
import com.example.uberv.githubclient.data.database.GithubDatabase;
import com.example.uberv.githubclient.data.model.User;
import com.example.uberv.githubclient.di.components.DaggerGithubApplicationComponent;
import com.example.uberv.githubclient.di.components.GithubApplicationComponent;
import com.example.uberv.githubclient.di.modules.ApplicationModule;
import com.example.uberv.githubclient.utils.AnalyticsUtils;
import com.example.uberv.githubclient.utils.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.schedulers.Schedulers;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Inject
    GithubDatabase mGithubDatabase;
    @Inject
    GithubApiService mGithubApiService;
    @Inject
    DataManager mDataManager;

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.get(this).getGithubAppComponent().inject(this);

        //FIXME for debug
        GithubApiService apiService1 = App.get(this).getGithubAppComponent().getGithubApiService();
        GithubApiService apiService2 = App.get(this).getGithubAppComponent().getGithubApiService();
        GithubApiService apiService3 = App.get(this).getGithubAppComponent().getGithubApiService();

        GithubApplicationComponent newAppComponent = DaggerGithubApplicationComponent.builder()
                .applicationModule(new ApplicationModule(App.get(this)))
                .build();

        GithubApiService apiService4 = newAppComponent.getGithubApiService();
        GithubApiService apiService5 = newAppComponent.getGithubApiService();
        GithubApiService apiService6 = newAppComponent.getGithubApiService();
        //FIXME====

        mGithubApiService.getUser("Rikharthu")
                .subscribeOn(Schedulers.io())
                .subscribe(userResponse -> {
                    Timber.d(userResponse.toString());
                    User user = Utils.convertUserResponseToUser(userResponse);
                    mGithubDatabase.userDao().save(user);

                    User userFromDb = mGithubDatabase.userDao().loadByName("Rikharthu");
                    Timber.d("A");

                    fetchRepositoryForUser(user);
                }, Timber::e);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        AnalyticsUtils.logOnCreatedEvent(mFirebaseAnalytics);

        Timber.d("onCreate()");
    }

    private void fetchRepositoryForUser(User user) {
        mGithubApiService.getUsersRepositories(user.getLogin())
                .subscribeOn(Schedulers.io())
                .subscribe(this::onRepositoryFetched, Timber::e);
    }

    private void onRepositoryFetched(List<RepositoryResponse> repositoryResponses) {
        Timber.d("A");
//        mGithubDatabase.repositoryDay().save(Utils.);
        for (RepositoryResponse repoResponse : repositoryResponses) {
            mGithubDatabase.repositoryDay().save(Utils.convertRepositoryResponseToRepository(repoResponse));
        }
    }
}
