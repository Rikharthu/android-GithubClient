package com.example.uberv.githubclient.utils;

import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

public class AnalyticsUtils {

    public static void logOnCreatedEvent(FirebaseAnalytics firebaseAnalytics) {
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "1337");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "onCreated");
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "my-event");
        bundle.putString(FirebaseAnalytics.Param.CONTENT, "Opened MainActivity");
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
}
