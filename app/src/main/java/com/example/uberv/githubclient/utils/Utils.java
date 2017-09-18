package com.example.uberv.githubclient.utils;

import com.example.uberv.githubclient.data.api.response.RepositoryResponse;
import com.example.uberv.githubclient.data.api.response.UserResponse;
import com.example.uberv.githubclient.data.model.Repository;
import com.example.uberv.githubclient.data.model.User;

public abstract class Utils {
    public static User convertUserResponseToUser(UserResponse userResponse) {
        User user = new User();
        user.setEmail(userResponse.getEmail());
        user.setId(userResponse.getId());
        user.setLogin(userResponse.getLogin());
        user.setUrl(userResponse.getUrl());
        return user;
    }

    public static Repository convertRepositoryResponseToRepository(RepositoryResponse repoResponse) {
        Repository repo = new Repository();
        repo.setId(repoResponse.mId);
        repo.setName(repoResponse.name);
        repo.setUrl(repoResponse.url);
        repo.setDescription(repoResponse.description);
        repo.setCreatedAt(repoResponse.created_at);
        repo.setUpdatedAt(repoResponse.updated_at);
        repo.setOwner(convertUserResponseToUser(repoResponse.owner));
        return repo;
    }
}
