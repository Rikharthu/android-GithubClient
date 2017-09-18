package com.example.uberv.githubclient.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.example.uberv.githubclient.data.model.Repository;
import com.example.uberv.githubclient.data.model.User;

import javax.inject.Singleton;

@Singleton
@Database(entities = {User.class, Repository.class}, version = 2)
@TypeConverters({Converters.class})
public abstract class GithubDatabase extends RoomDatabase {
    public abstract UserDao userDao();

    public abstract RepositoryDao repositoryDay();
}
