package com.example.mypractice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by 11861 on 2020/2/20.
 */

public class LocalService extends Service {
    private final IBinder mBinder = new LocalBinder();

    @Override
    public void onCreate(){
        Log.i("LocalService","onCreate");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int started){
        Log.i("LocalService", "onStartCommand start id" + started);
        return super.onStartCommand(intent, flags, started);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i("LocalService", "onDestroy");
    }

    @Override
    public IBinder onBind(Intent intent){
        Log.i("LocalService", "downMusic");
        return mBinder;
    }

    public void downMusic(){
        Log.i("LocalService", "downMusic");
    }

    public class LocalBinder extends Binder{
        //返回当前的Service对象
        LocalService getService(){
            return LocalService.this;
        }
    }
}
