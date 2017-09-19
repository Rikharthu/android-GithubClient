package com.example.uberv.githubclient.di.modules;

import android.content.Context;

import com.example.uberv.githubclient.di.annotations.ApplicationContext;
import com.example.uberv.githubclient.di.annotations.GithubApplicationScope;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import timber.log.Timber;

@Module(includes = ApplicationModule.class)
public class NetModule {

    @Provides
    @GithubApplicationScope
    HttpLoggingInterceptor provideLoggingInterceptor() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Timber.tag("OkHttp").d(message);
            }
        });
//        logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
        return logging;
    }

    @Provides
    @GithubApplicationScope
    Gson provideGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        return gsonBuilder.create();
    }

    @Provides
    @GithubApplicationScope
    public Cache cache(File cachefile) {
        return new Cache(cachefile, 10 * 1024 * 1024); // 10MB
    }

    @Provides
    @GithubApplicationScope
    public File cacheFile(@ApplicationContext Context context) {
        File cachefile = new File(context.getCacheDir(), "okhttp_cache");
        cachefile.mkdirs();
        return cachefile;
    }

    @Provides
    @GithubApplicationScope
    OkHttpClient provideOkhttpClient(Cache cache, HttpLoggingInterceptor loggingInterceptor) {
        return new OkHttpClient.Builder()
                .cache(cache)
                .addInterceptor(loggingInterceptor)
                .build();
    }
}
