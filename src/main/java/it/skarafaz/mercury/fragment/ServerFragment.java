package it.skarafaz.mercury.fragment;
/*
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import it.skarafaz.mercury.R;
*/

import it.skarafaz.mercury.model.config.Server;

public class ServerFragment  {
    public static final String SERVER_ARG = "SERVER_ARG";
    private Server server;

    public static Server newInstance(Server server) {
        ServerFragment fragment = new ServerFragment();
        //Bundle args = new Bundle();
        //args.putSerializable(SERVER_ARG, server);
        //fragment.setArguments(args);
        return server;
    }


    public void onCreate() {
        //super.onCreate(savedInstanceState);
        //server = getArguments() != null ? (Server) getArguments().getSerializable(SERVER_ARG) : null;
    }


    public void onCreateView() {
        //return inflater.inflate(R.layout.fragment_server, container, false);
    }


    public void onActivityCreated() {
        //super.onActivityCreated(savedInstanceState);
        //setListAdapter(new CommandListAdapter(getActivity(), server.getCommands()));
    }
}
