package com.example.uberv.githubclient.data;

import android.content.Context;

import com.example.uberv.githubclient.data.database.GithubDatabase;
import com.example.uberv.githubclient.data.preferences.SharedPrefsHelper;
import com.example.uberv.githubclient.di.annotations.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DataManager {

    private Context mContext;
    private GithubDatabase mGithubDatabase;
    private SharedPrefsHelper mSharedPrefsHelper;

    // TODO add comments from AdapterRepos from othersample
    @Inject
    public DataManager(@ApplicationContext Context context, GithubDatabase githubDatabase, SharedPrefsHelper sharedPrefsHelper) {
        mContext = context;
        mGithubDatabase = githubDatabase;
        mSharedPrefsHelper = sharedPrefsHelper;
    }

    public void saveAccessToken(String accessToken) {
        mSharedPrefsHelper.put(SharedPrefsHelper.PREF_KEY_ACCESS_TOKEN, accessToken);
    }

    public String getAccessToken() {
        return mSharedPrefsHelper.get(SharedPrefsHelper.PREF_KEY_ACCESS_TOKEN, null);
    }
}
