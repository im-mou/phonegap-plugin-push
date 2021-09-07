package com.adobe.phonegap.push;

import android.content.Intent;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;

import org.json.JSONException;

import java.io.IOException;

public class PushInstanceIDListenerService extends FirebaseMessagingService implements PushConstants {
    public static final String LOG_TAG = "Push_InsIdService";
}
