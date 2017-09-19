package com.example.uberv.githubclient;

import android.app.Application;
import android.content.Context;

import com.example.uberv.githubclient.data.DataManager;
import com.example.uberv.githubclient.di.components.DaggerGithubApplicationComponent;
import com.example.uberv.githubclient.di.components.GithubApplicationComponent;
import com.example.uberv.githubclient.di.modules.ApplicationModule;

import javax.inject.Inject;

import timber.log.Timber;

public class App extends Application {

    @Inject
    DataManager mDataManager;
    GithubApplicationComponent mGithubApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new DevelopmentTree());
        mGithubApplicationComponent = DaggerGithubApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
//                .githubServiceModule(new GithubServiceModule())
//                .netModule(new NetModule())
                .build();

        mGithubApplicationComponent.inject(this);

        Timber.d("Initialized");
    }

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    public GithubApplicationComponent getGithubAppComponent() {
        return mGithubApplicationComponent;
    }
}
