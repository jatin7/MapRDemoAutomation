package com.mercury.activity;
/*
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.Toast;
import it.skarafaz.mercury.R;
*/

import com.mercury.ssh.SshEventSubscriber;

public class SettingsActivity  {
    private static final String ACTION_EXPORT_PUBLIC_KEY = "it.skarafaz.mercury.EXPORT_PUBLIC_KEY";
    private static final String ACTION_SEND_PUBLIC_KEY = "it.skarafaz.mercury.SEND_PUBLIC_KEY";
    private static final int PRC_WRITE_EXT_STORAGE = 101;

    private SshEventSubscriber sshEventSubscriber;


    protected void onCreate() {
        /*
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings);
        */
        //ßsshEventSubscriber = new SshEventSubscriber(this);

    }


    protected void onNewIntent(boolean action) {
/*        super.onNewIntent(intent);

        if (intent.getAction() != null) {
            switch (intent.getAction()) {
                case ACTION_EXPORT_PUBLIC_KEY:
                    exportPublicKey();
                    break;
                case ACTION_SEND_PUBLIC_KEY:
                    new SshCommandPubKey().start();
                    break;
            }
        }*/
    }


    protected void onStart() {
/*        super.onStart();

        EventBus.getDefault().register(sshEventSubscriber);*/
    }

    protected void onStop() {
/*        EventBus.getDefault().unregister(sshEventSubscriber);

        super.onStop();*/
    }


    public void onRequestPermissionsResult(int requestCode,  String permissions[],  int[] grantResults) {
     /*   if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            switch (requestCode) {
                case PRC_WRITE_EXT_STORAGE:
                    exportPublicKey();
                    break;
            }
        }*/
    }

    private void exportPublicKey() {
        /*
        new AsyncTask<Void, Void, ExportPublicKeyStatus>() {
            @Override
            protected void onPreExecute() {
                MercuryApplication.showProgressDialog(getSupportFragmentManager(), getString(R.string.exporting_public_key));
            }

            @Override
            protected ExportPublicKeyStatus doInBackground(Void... params) {
                return SshManager.getInstance().exportPublicKey();
            }

            @Override
            protected void onPostExecute(ExportPublicKeyStatus status) {
                MercuryApplication.dismissProgressDialog(getSupportFragmentManager());

                SettingsActivity activity = SettingsActivity.this;

                boolean toast = true;
                if (status == ExportPublicKeyStatus.PERMISSION) {
                    toast = !MercuryApplication.requestPermission(activity, PRC_WRITE_EXT_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE);
                }

                if (toast) {
                    Toast.makeText(activity, getString(status.message(), SshManager.getInstance().getPublicKeyExportedFile()), Toast.LENGTH_LONG).show();
                }
            }
        }.execute();
        */
    }

}
