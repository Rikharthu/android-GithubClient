package com.example.uberv.githubclient.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(indices = {@Index("id"), @Index("login")})
public class User {

    @ColumnInfo(name = "id")
    @PrimaryKey
    private long mId;
    @ColumnInfo(name = "login")
    private String mLogin;
    @ColumnInfo(name = "url")
    private String mUrl;
    @ColumnInfo(name = "email")
    private String mEmail;

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public String getLogin() {
        return mLogin;
    }

    public void setLogin(String login) {
        mLogin = login;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }
}
