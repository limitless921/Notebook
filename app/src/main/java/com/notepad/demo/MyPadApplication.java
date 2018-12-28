package com.notepad.demo;

import android.app.Application;



public class MyPadApplication extends Application {
    public static MyPadApplication mApp;

    @Override
    public void onCreate() {
        super.onCreate();

        mApp=this;
    }

}
