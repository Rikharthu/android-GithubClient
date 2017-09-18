package com.example.uberv.githubclient.data.api.response;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class RepositoryResponse {
    @SerializedName("id")
    public long mId;
    @SerializedName("name")
    public String name;
    @SerializedName("full_name")
    public String full_name;
    @SerializedName("owner")
    public UserResponse owner;
    @SerializedName("html_url")
    public String html_url;
    @SerializedName("description")
    public String description;
    @SerializedName("url")
    public String url;
    @SerializedName("created_at")
    public Date created_at;
    @SerializedName("updated_at")
    public Date updated_at;
    @SerializedName("pushed_at")
    public Date pushed_at;
    @SerializedName("git_url")
    public String git_url;
    @SerializedName("ssh_url")
    public String ssh_url;
    @SerializedName("clone_url")
    public String clone_url;
    @SerializedName("svn_url")
    public String svn_url;
    @SerializedName("homepage")
    public String homepage;
    @SerializedName("stargazers_count")
    public int stargazers_count;
    @SerializedName("watchers_count")
    public int watchers_count;
    @SerializedName("language")
    public String language;
    @SerializedName("has_issues")
    public boolean has_issues;
    @SerializedName("has_downloads")
    public boolean has_downloads;
    @SerializedName("has_wiki")
    public boolean has_wiki;
    @SerializedName("has_pages")
    public boolean has_pages;
    @SerializedName("forks_count")
    public int forks_count;
    @SerializedName("open_issues_count")
    public int open_issues_count;
    @SerializedName("forks")
    public int forks;
    @SerializedName("open_issues")
    public int open_issues;
    @SerializedName("watchers")
    public int watchers;
    @SerializedName("default_branch")
    public String default_branch;
}
