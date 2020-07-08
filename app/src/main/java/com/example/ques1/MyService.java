package com.example.ques1;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.EditText;

import java.util.Random;

public class MyService extends Service {
    public MyService() {
    }
    private final IBinder binder = new LocalBinder();


    public class LocalBinder extends Binder {
        MyService getService() {

            return MyService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent)
    {
        return binder;
    }

    /** method for clients */
    public boolean getNumber(String s) {
        int i = Integer.parseInt(s);
        if(i%2==0)

        { return true;}
        else
            return false;
    }

}

