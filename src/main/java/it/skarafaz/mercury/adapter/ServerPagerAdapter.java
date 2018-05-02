package it.skarafaz.mercury.adapter;

/*
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
*/

import it.skarafaz.mercury.model.config.Server;

import java.util.ArrayList;
import java.util.List;

public class ServerPagerAdapter  {
    private List<Server> servers;

    public ServerPagerAdapter() {
        servers = new ArrayList<>();
    }


    public int getCount() {
        return servers.size();
    }

    public Server getItem(int i) {
        return servers.get(i);
    }


    public String getPageTitle(int position) {
        return servers.get(position).getName();
    }


    public int getItemPosition(Object object) {
        //TODO: Get real postion of index
        return 0;
    }

    public void updateServers(List<Server> servers) {
        this.servers.clear();
        this.servers.addAll(servers);
        //notifyDataSetChanged();
    }
}
