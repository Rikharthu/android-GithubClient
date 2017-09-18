package com.example.uberv.githubclient.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(foreignKeys = @ForeignKey(entity = User.class,
        parentColumns = "id",
        childColumns = "owner_id"),
indices = {@Index("id"),@Index("owner_id")})
public class Repository {

    @PrimaryKey
    @ColumnInfo(name = "id")
    private long mId;
    @ColumnInfo(name = "name")
    private String mName;
    @ColumnInfo(name = "url")
    private String mUrl;
    @ColumnInfo(name = "description")
    private String mDescription;
    @ColumnInfo(name = "created_at")
    private Date mCreatedAt;
    @ColumnInfo(name = "updated_at")
    private Date mUpdatedAt;

    @ColumnInfo(name = "owner_id")
    public long mOwnerId;

    @Ignore
    private User mOwner;

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public User getOwner() {
        return mOwner;
    }

    public void setOwner(User owner) {
        mOwner = owner;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Date getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        mCreatedAt = createdAt;
    }

    public Date getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        mUpdatedAt = updatedAt;
    }
}
