package com.mercury;

/*
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.view.ViewConfiguration;
import org.greenrobot.eventbus.EventBus;

*/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MercuryApplication {
    private static final String S_HAS_PERMANENT_MENU_KEY = "sHasPermanentMenuKey";
    private static final Logger logger = LoggerFactory.getLogger(MercuryApplication.class);
    //private static Context context;

    /*public static Context getContext() {
        return context;
    }*/

    public static void main( String[] args ) {

        System.out.println("Starting Application!");

    }

    public void onCreate() {
      /*  super.onCreate();

        context = this;

        EventBus.builder().addIndex(new EventBusIndex()).build();

        // hack for devices with hw options button
        try {
            ViewConfiguration config = ViewConfiguration.get(this);
            Field menuKeyField = ViewConfiguration.class.getDeclaredField(S_HAS_PERMANENT_MENU_KEY);
            if (menuKeyField != null) {
                menuKeyField.setAccessible(true);
                menuKeyField.setBoolean(config, false);
            }
        } catch (Exception e) {
            logger.error(e.getMessage().replace("\n", " "));
        }*/
    }

    public static void showProgressDialog(String content) {
/*        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(ProgressDialogFragment.newInstance(content), ProgressDialogFragment.TAG);
        transaction.commitAllowingStateLoss();*/
    }

    public static void dismissProgressDialog() {
/*        FragmentTransaction transaction = manager.beginTransaction();
        Fragment fragment = manager.findFragmentByTag(ProgressDialogFragment.TAG);
        if (fragment != null) {
            transaction.remove(fragment);
        }
        transaction.commitAllowingStateLoss();*/
    }

    public static boolean hasPermission(String permission) {
        //return ContextCompat.checkSelfPermission(context, permission) == PackageManager.PERMISSION_GRANTED;
        return true;
    }

    public static boolean requestPermission(int requestCode, String permission) {
/*        boolean requested = false;
        if (!ActivityCompat.shouldShowRequestPermissionRationale(activity, permission)) {
            ActivityCompat.requestPermissions(activity, new String[]{permission}, requestCode);
            requested = true;
        }
        return requested;*/
        return true;
    }

    public static boolean isExternalStorageReadable() {
/*        String state = Environment.getExternalStorageState();
        return Environment.MEDIA_MOUNTED.equals(state) || Environment.MEDIA_MOUNTED_READ_ONLY.equals(state);*/
        return true;
    }

    public static boolean isExternalStorageWritable() {
/*        String state = Environment.getExternalStorageState();
        return Environment.MEDIA_MOUNTED.equals(state);*/
        return true;
    }
}
