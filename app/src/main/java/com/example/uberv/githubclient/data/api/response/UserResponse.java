package com.example.uberv.githubclient.data.api.response;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class UserResponse {

    @SerializedName("login")
    private String mLogin;
    @SerializedName("id")
    private long mId;
    @SerializedName("avatar_url")
    private String mAvatarUrl;
    @SerializedName("gravatar_id")
    private String mGravatarId;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("html_url")
    private String mHtmlUrl;
    @SerializedName("followers_url")
    private String mFollowersUrl;
    @SerializedName("following_url")
    private String mFollowingUrl;
    @SerializedName("gists_url")
    private String mGistsUrl;
    @SerializedName("starred_url")
    private String mStarredUrl;
    @SerializedName("subscriptions_url")
    private String mSubscribtionsUrl;
    @SerializedName("organizations_url")
    private String mOrganizationsUrl;
    @SerializedName("repos_url")
    private String mReposUrl;
    @SerializedName("events_url")
    private String mEventsUrl;
    @SerializedName("received_events_url")
    private String mReceivedEventsUrl;
    @SerializedName("type")
    private String mType;
    @SerializedName("name")
    private String mName;
    @SerializedName("blog")
    private String mBlog;
    @SerializedName("location")
    private String mLocation;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("public_repos")
    private int mPublicRepos;
    @SerializedName("public_gists")
    private int mPublicGists;
    @SerializedName("followers")
    private int mFollowers;
    @SerializedName("following")
    private int mFollowing;
    @SerializedName("created_at")
    private Date mCreatedAt;
    @SerializedName("updated_at")
    private Date mUpdatedAt;

    public String getLogin() {
        return mLogin;
    }

    public void setLogin(String login) {
        mLogin = login;
    }

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public String getAvatarUrl() {
        return mAvatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        mAvatarUrl = avatarUrl;
    }

    public String getGravatarId() {
        return mGravatarId;
    }

    public void setGravatarId(String gravatarId) {
        mGravatarId = gravatarId;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        mHtmlUrl = htmlUrl;
    }

    public String getFollowersUrl() {
        return mFollowersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        mFollowersUrl = followersUrl;
    }

    public String getFollowingUrl() {
        return mFollowingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        mFollowingUrl = followingUrl;
    }

    public String getGistsUrl() {
        return mGistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        mGistsUrl = gistsUrl;
    }

    public String getStarredUrl() {
        return mStarredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        mStarredUrl = starredUrl;
    }

    public String getSubscribtionsUrl() {
        return mSubscribtionsUrl;
    }

    public void setSubscribtionsUrl(String subscribtionsUrl) {
        mSubscribtionsUrl = subscribtionsUrl;
    }

    public String getOrganizationsUrl() {
        return mOrganizationsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        mOrganizationsUrl = organizationsUrl;
    }

    public String getReposUrl() {
        return mReposUrl;
    }

    public void setReposUrl(String reposUrl) {
        mReposUrl = reposUrl;
    }

    public String getEventsUrl() {
        return mEventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        mEventsUrl = eventsUrl;
    }

    public String getReceivedEventsUrl() {
        return mReceivedEventsUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        mReceivedEventsUrl = receivedEventsUrl;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getBlog() {
        return mBlog;
    }

    public void setBlog(String blog) {
        mBlog = blog;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public int getPublicRepos() {
        return mPublicRepos;
    }

    public void setPublicRepos(int publicRepos) {
        mPublicRepos = publicRepos;
    }

    public int getPublicGists() {
        return mPublicGists;
    }

    public void setPublicGists(int publicGists) {
        mPublicGists = publicGists;
    }

    public int getFollowers() {
        return mFollowers;
    }

    public void setFollowers(int followers) {
        mFollowers = followers;
    }

    public int getFollowing() {
        return mFollowing;
    }

    public void setFollowing(int following) {
        mFollowing = following;
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
