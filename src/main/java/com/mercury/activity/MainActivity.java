package com.mercury.activity;

/*
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import it.skarafaz.mercury.R;
*/

import com.mercury.manager.ConfigManager;
import com.mercury.adapter.ServerPagerAdapter;
import com.mercury.ssh.SshEventSubscriber;
import org.greenrobot.eventbus.EventBus;

public class MainActivity extends MercuryActivity {
    //private static final int PRC_WRITE_EXT_STORAGE = 101;
    //private static final int RC_START_APP_INFO = 201;

    private ServerPagerAdapter serverPagerAdapter;
    private SshEventSubscriber sshEventSubscriber;
    private boolean busy = false;


    protected void onCreate() {

        serverPagerAdapter = new ServerPagerAdapter();
        loadConfigFiles();

 /*       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        serverPagerAdapter = new ServerPagerAdapter(getSupportFragmentManager());
        serverPager.setAdapter(serverPagerAdapter);

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAppInfo();
            }
        });

        sshEventSubscriber = new SshEventSubscriber(this);

        loadConfigFiles();*/
    }


    protected void onStart() {
        //super.onStart();
        EventBus.getDefault().register(sshEventSubscriber);
    }


    protected void onStop() {
        //EventBus.getDefault().unregister(sshEventSubscriber);
        //super.onStop();
    }


    public boolean onCreateOptionsMenu() {
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public boolean onOptionsItemSelected() {
/*        switch (item.getItemId()) {
            case R.id.action_reload:
                loadConfigFiles();
                return true;
            case R.id.action_help:
                startActivity(new Intent(this, HelpActivity.class));
                return true;
            case R.id.action_settings:
                startActivity(new Intent(this, SettingsActivity.class));
                return true;
            case R.id.action_log:
                startActivity(new Intent(this, LogActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }*/
        return true;
    }


    public void onRequestPermissionsResult(int requestCode,  int[] grantResults) {
/*        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            switch (requestCode) {
                case PRC_WRITE_EXT_STORAGE:
                    loadConfigFiles();
                    break;
            }
        }*/
    }

    protected void onActivityResult(int requestCode, int resultCode) {
/*        switch (requestCode) {
            case RC_START_APP_INFO:
                loadConfigFiles();
                break;
        }*/
    }

    private void loadConfigFiles() {
        ConfigManager.getInstance().loadConfigFiles();

     /*   if (!busy) {
            new AsyncTask<Void, Void, LoadConfigFilesStatus>() {
                @Override
                protected void onPreExecute() {
                    busy = true;
                    progressBar.setVisibility(View.VISIBLE);
                    emptyLayout.setVisibility(View.INVISIBLE);
                    serverPager.setVisibility(View.INVISIBLE);
                }

                @Override
                protected LoadConfigFilesStatus doInBackground(Void... params) {
                    return ConfigManager.getInstance().loadConfigFiles();
                }

                @Override
                protected void onPostExecute(LoadConfigFilesStatus status) {
                    progressBar.setVisibility(View.INVISIBLE);
                    if (ConfigManager.getInstance().getServers().size() > 0) {
                        serverPagerAdapter.updateServers(ConfigManager.getInstance().getServers());
                        serverPager.setVisibility(View.VISIBLE);
                        if (status == LoadConfigFilesStatus.ERROR) {
                            Toast.makeText(MainActivity.this, getString(status.message()), Toast.LENGTH_LONG).show();
                        }
                    } else {
                        emptyMessage.setText(getString(status.message(), ConfigManager.getInstance().getConfigDir()));
                        emptyLayout.setVisibility(View.VISIBLE);
                        if (status == LoadConfigFilesStatus.PERMISSION) {
                            settingsButton.setVisibility(View.VISIBLE);
                            MercuryApplication.requestPermission(MainActivity.this, PRC_WRITE_EXT_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE);
                        } else {
                            settingsButton.setVisibility(View.GONE);
                        }
                    }
                    busy = false;
                }
            }.execute();
        }*/
        ConfigManager.getInstance().loadConfigFiles();
        serverPagerAdapter.updateServers(ConfigManager.getInstance().getServers());
    }

    private void startAppInfo() {
  /*      Intent intent = new Intent();
        intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        intent.setData(Uri.parse(String.format("package:%s", getPackageName())));
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        intent.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
        startActivityForResult(intent, RC_START_APP_INFO);*/
    }
}
