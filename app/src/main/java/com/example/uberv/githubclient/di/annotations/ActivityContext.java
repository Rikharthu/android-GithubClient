package com.example.uberv.githubclient.di.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * A qualifier for {@link android.content.Context} of an Activity.<br/>
 * <i>Qualifiers are used to distinguish between objects of the same type but with
 * different instances. Is an alternative for {@link javax.inject.Named} annotation,
 * which also is a {@link Qualifier}</i>
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityContext {
}
