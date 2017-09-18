package com.example.uberv.githubclient;

import android.app.Application;
import android.content.Context;

import com.example.uberv.githubclient.data.DataManager;
import com.example.uberv.githubclient.di.components.ApplicationComponent;
import com.example.uberv.githubclient.di.components.DaggerApplicationComponent;
import com.example.uberv.githubclient.di.modules.ApplicationModule;

import javax.inject.Inject;

import timber.log.Timber;

public class App extends Application {

    @Inject
    DataManager mDataManager;
    ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new DevelopmentTree());

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        mApplicationComponent.inject(this);

        Timber.d("Initialized");
    }

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
