package com.mapr.jatin.automation.samples.clients.jsch;


import com.jcraft.jsch.ChannelExec;
        import com.jcraft.jsch.JSch;
        import com.jcraft.jsch.Session;
        import java.io.BufferedReader;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Properties;

/**
 *
 * @author Jatin Shah
 */
public class Example1_RunScript {

    private JSch jsch;
    private Session session;
    private ChannelExec channelExec;

    public static void main(String[] args) {
        Example1_RunScript serverConnect = new Example1_RunScript();

        String username = "mapr";
        String password = "mapr";
        String ip = "u32g";
        int port = 22;

        serverConnect.openConnection(username, password, ip, port);
        //serverConnect.executeShellScript("/data/jatin/projects/crawler.sh");


    }

    public boolean openConnection(String username, String password, String host, int port) {

        System.out.println("openConnection() Started!");
        boolean success = false;
        try {

            System.out.println("Opening Connection...");
            jsch = new JSch();
            setSession(jsch.getSession(username, host, port));

//            System.out.println("Upload Session created with following properties " + serverDetails);
            getSession().setPassword(password);
            Properties config = new Properties();
            config.put("StrictHostKeyChecking", "no");

            getSession().setConfig(config);
            System.out.println("Connecting Upload Session...");
            getSession().connect();
            success = true;

            return success;

        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("executeFile() Ended!");
        System.out.println("ScheduledCrawler:executeFile() Ended!");
        return success;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public boolean executeShellScript(String jarPath) {

        System.out.println("ExecuteScript:executeShellScript() Execution of Shell Script file Started!");
        boolean status = false;
        List<String> result = new ArrayList<String>();
        System.out.println("Upload Session connected.");
        try {
            channelExec = (ChannelExec) getSession().openChannel("exec");

            InputStream in = channelExec.getInputStream();
            System.out.println("scriptFileName:-" + jarPath);
            System.out.println("scriptFileName:-" + jarPath);
            channelExec.setCommand("sh " + jarPath);
            channelExec.connect();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line = reader.readLine()) != null) {
                result.add(line);
                System.out.println("result:" + result);
            }

            int exitStatus = channelExec.getExitStatus();
            channelExec.disconnect();
            getSession().disconnect();

            if (exitStatus < 0) {
                System.out.println("Done, but exit status not set!");
                System.out.println("job:executeShellScript() Done, but exit status not set!");
            } else if (exitStatus > 0) {
                System.out.println("Done, but with error!");
                System.out.println("job:executeShellScript() Done, but with error!");
            } else {
                System.out.println("Done!");
                System.out.println("job:executeShellScript() Done!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("ExecuteScript:executeShellScript() Execution of Shell Script file Started!");
        return status;
    }
}