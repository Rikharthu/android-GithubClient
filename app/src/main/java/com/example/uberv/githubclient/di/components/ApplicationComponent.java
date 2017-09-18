package com.example.uberv.githubclient.di.components;

import android.app.Application;
import android.content.Context;

import com.example.uberv.githubclient.App;
import com.example.uberv.githubclient.MainActivity;
import com.example.uberv.githubclient.data.DataManager;
import com.example.uberv.githubclient.data.database.GithubDatabase;
import com.example.uberv.githubclient.data.preferences.SharedPrefsHelper;
import com.example.uberv.githubclient.di.annotations.ApplicationContext;
import com.example.uberv.githubclient.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(App app);

    void inject(MainActivity mainActivity);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    GithubDatabase getGithubDatabase();
}
