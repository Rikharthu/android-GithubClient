package com.example.uberv.githubclient.di.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;


//TODO more info about scopes

/**
 * Scope is used to specify the scope in which a dependency object persists
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}