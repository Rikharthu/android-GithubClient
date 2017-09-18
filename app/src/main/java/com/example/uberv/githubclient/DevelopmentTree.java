package com.example.uberv.githubclient;

import timber.log.Timber;

public class DevelopmentTree extends Timber.DebugTree {
    @Override
    protected String createStackElementTag(StackTraceElement element) {
        return String.format("%s#%s:%d", element.getClassName(), element.getMethodName(), element.getLineNumber());
    }
}
