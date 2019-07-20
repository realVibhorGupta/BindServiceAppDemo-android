package com.example.vibhor.bindserviceappdemo;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;

public class MyService extends Service {

    public final static  String TAG="My Service";
    //used for getting the handler from other class for sending messages
    public static Handler     mMyServiceHandler 			= null;
    //used for keep track on Android running status
    public static Boolean 		mIsServiceRunning 			= false;

    public MyService() {


    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }
}
