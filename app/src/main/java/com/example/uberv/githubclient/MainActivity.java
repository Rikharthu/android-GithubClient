package com.example.uberv.githubclient;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.uberv.githubclient.data.api.GithubApiService;
import com.example.uberv.githubclient.data.api.response.RepositoryResponse;
import com.example.uberv.githubclient.data.database.GithubDatabase;
import com.example.uberv.githubclient.data.model.User;
import com.example.uberv.githubclient.utils.Utils;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.schedulers.Schedulers;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Inject
    GithubDatabase mGithubDatabase;
    @Inject
    GithubApiService mGithubApiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.get(this).getApplicationComponent().inject(this);

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
