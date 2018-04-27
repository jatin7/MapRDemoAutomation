package com.mapr.jatin.automation.samples.clients.zk.httpserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZkHttpServerApplication {
//https://github.com/wanglf/prometheus-service-discovery
  public static void main(String[] args) {
    SpringApplication.run(ZkHttpServerApplication.class, args);
  }
}
