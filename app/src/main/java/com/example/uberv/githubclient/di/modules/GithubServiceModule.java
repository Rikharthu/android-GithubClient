package com.example.uberv.githubclient.di.modules;

import com.example.uberv.githubclient.data.api.GithubApiService;
import com.example.uberv.githubclient.di.annotations.GithubApplicationScope;
import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = NetModule.class) // depends on NetModule
public class GithubServiceModule {


    @Provides
    @GithubApplicationScope
    GithubApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(GithubApiService.class);
    }

    @Provides
    @GithubApplicationScope
    Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl("https://api.github.com")
                .client(okHttpClient)
                .build();
    }
}
