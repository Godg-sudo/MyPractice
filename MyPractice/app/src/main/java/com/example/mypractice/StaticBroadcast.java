package com.example.mypractice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by 11861 on 2020/2/21.
 */

public class StaticBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        String data = intent.getStringExtra("data");
        Log.i("data",data);
    }
}
