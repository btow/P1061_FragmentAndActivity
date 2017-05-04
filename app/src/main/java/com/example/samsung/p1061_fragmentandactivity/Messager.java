package com.example.samsung.p1061_fragmentandactivity;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by samsung on 03.05.2017.
 */

public class Messager {

    private static final String LOG_TAG = "myLogs";

    public static void sendToAllRecipients(final Context context, final String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        Log.d(LOG_TAG, message);
    }

    public static void sendToOnlyLog(final String message) {
        Log.d(LOG_TAG, message);
    }
}
