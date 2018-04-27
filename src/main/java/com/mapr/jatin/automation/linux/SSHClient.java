package com.mapr.jatin.automation.linux;

import com.jcraft.jsch.*;

import java.io.IOException;
import java.io.InputStream;
import com.mapr.jatin.automation.api.Client;

public class SSHClient  implements Client {
    private JSch client;
    Session session;
    private String result;

    public SSHClient() {
        client = new JSch();
    }

    public void openSession(String hostname, String uname, String pwd) throws JSchException {
        this.openSession(hostname, 22, uname, pwd);
    }

    public void openSession(String hostname, int port, String uname, String pwd) throws JSchException {
        session = client.getSession(uname, hostname, port);
        session.setPassword(pwd);
        session.setConfig("StrictHostKeyChecking", "no");
        System.out.println("Connecting to ..." + hostname);
        session.connect();
    }

    public void execute(Object commandline) {
        System.out.println("starts to execute:" + commandline);
        StringBuilder outputBuffer = new StringBuilder();
        try {
            Channel channel = session.openChannel("exec");
            ((ChannelExec) channel).setCommand(commandline.toString());
            InputStream commandOutput = channel.getInputStream();
            channel.connect();
            int readByte = commandOutput.read();

            while (readByte != 0xffffffff) {
                outputBuffer.append((char) readByte);
                readByte = commandOutput.read();
            }
            channel.disconnect();
        } catch (IOException ioX) {
            System.out.println(ioX.getMessage());
        } catch (JSchException jschX) {
            System.out.println(jschX.getMessage());
        }
        result = outputBuffer.toString();

        System.out.println("execute:" + result);
    }

    public String getResponse() {
        return result;
    }


    public void close() {
        if (client != null) {
            session.disconnect();
        }

    }
}