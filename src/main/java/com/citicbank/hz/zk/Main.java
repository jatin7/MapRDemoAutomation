package com.citicbank.hz.zk;

import com.citicbank.hz.zk.util.ZooKeeperUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
