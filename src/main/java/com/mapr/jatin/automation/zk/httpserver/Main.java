package com.mapr.jatin.automation.zk.httpserver;

import com.mapr.jatin.automation.zk.httpserver.util.ZooKeeperUtil;

public class Main {


    public static void main(String[] args) {
        String host="u32g";
        String user="mapr";
        String password="mapr";

        ZooKeeperUtil util = new ZooKeeperUtil();
        util.createConnection("maprdemo:5181", 10000);
        util.readData("/");
        util.releaseConnection();


    }
}
