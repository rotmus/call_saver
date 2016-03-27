package com.example.rotmus.hook_calls;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class OutgoingCallInterceptor extends BroadcastReceiver {                            // 1

    @Override
    public void onReceive(Context context, Intent intent) {                                 // 2
        Log.d("Receiver", "onReceive");
        final String oldNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);          // 3
        this.setResultData("0123456789");                                                   // 4
        final String newNumber = this.getResultData();
        String msg = "Intercepted outgoing call. Old number " + oldNumber + ", new number " + newNumber;
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }

}