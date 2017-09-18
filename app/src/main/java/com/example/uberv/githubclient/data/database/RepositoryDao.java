package com.example.uberv.githubclient.data.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.uberv.githubclient.data.model.Repository;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface RepositoryDao {
    @Insert(onConflict = REPLACE)
    void save(Repository repo);

    @Query("SELECT * FROM repository WHERE id = :repoId")
    Repository loadById(long repoId);
}
