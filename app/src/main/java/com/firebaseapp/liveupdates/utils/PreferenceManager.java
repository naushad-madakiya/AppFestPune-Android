package com.firebaseapp.liveupdates.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;

public class PreferenceManager {
    private static final String USER_DISPLAY_NAME = "user_display_name";
    private static final String USER_EMAIL = "user_email";
    private static final String USER_PROFILE_URI = "user_profile_url";
    private final SharedPreferences sharedPreferences;

    public PreferenceManager(Context context) {
        sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    }

    public void setGoogleUserName(String userName) {
        sharedPreferences.edit().putString(USER_DISPLAY_NAME, userName).apply();
    }

    public String getUserDisplayName() {
        return sharedPreferences.getString(USER_DISPLAY_NAME, null);
    }

    public void setUserEmail(String userEmail) {
        sharedPreferences.edit().putString(USER_EMAIL, userEmail).apply();
    }

    public String getUserEmail() {
        return sharedPreferences.getString(USER_EMAIL, null);
    }

    public void setUserProfileUrl(Uri photoUrl) {
        sharedPreferences.edit().putString(USER_PROFILE_URI, photoUrl.toString()).apply();
    }
}
