package com.mapr.jatin.automation.samples.clients.jsch;
/**
 * This program will demonstrate the user authentification by public key.
 *   $ CLASSPATH=.:../build javac LoginUsingPubKey.java
 *   $ CLASSPATH=.:../build java LoginUsingPubKey
 * You will be asked username, hostname, privatekey(id_dsa) and passphrase.
 * If everything works fine, you will get the shell prompt
 *
 */
import com.jcraft.jsch.*;

public class LoginUsingPubKey{
    public static void main(String[] arg){

        try{
            JSch jsch=new JSch();

            //Key

            //jsch.addIdentity("");

            String host="mapr@maprdemo";
            //System.getProperty("user.name");

            String user=host.substring(0, host.indexOf('@'));
            host=host.substring(host.indexOf('@')+1);

            Session session=jsch.getSession(user, host, 22);

            // username and passphrase will be given via UserInfo interface.
            //UserInfo ui=new MyUserInfo();
            //session.setUserInfo(ui);
            session.connect();

            Channel channel=session.openChannel("shell");

            channel.setInputStream(System.in);
            channel.setOutputStream(System.out);

            channel.connect();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    }