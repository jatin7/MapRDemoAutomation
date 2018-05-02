
package com.mapr.jatin.automation.linux;

import com.jcraft.jsch.JSchException;
import  com.mapr.jatin.automation.api.CommandRequest;
import com.mapr.jatin.automation.linux.SSHClient;

import java.io.IOException;

/**
 * a Inspector for get real server's information .
 * 
 * @author Jatin Shah
 * 
 */

public class RealServerInspector {
	private boolean isFirstConnected = true;
	private SSHClient sshc ;
	private LinuxQueryList linuxQueryList;
	private RealLinuxServerInfoBean realServerForLinux;

	public RealLinuxServerInfoBean getLinuxServerInfo() {
		return this.realServerForLinux;
	}


	/**
	 * Check connection for Linux.
	 * 
	 * create on 2018
	 * 
	 * @param hostname
	 *            hostname
	 * @param username
	 *            username
	 * @param password
	 *            password
	 * @return the SSHClient object
	 * @throws JSchException
	 * @throws JSchException
	 * @throws IOException
	 */
	public void connectToLinuxServer(String hostname, String username, String password) throws JSchException {
		System.out.println("connecting to server: " + hostname + " user: " + username);
		this.realServerForLinux = new RealLinuxServerInfoBean();

		try {
			sshc = new SSHClient();
			sshc.openSession(hostname, username, password);

		} catch (JSchException e) {
			e.printStackTrace();
			throw new JSchException("Exception:" + e.getMessage());
		}

		isFirstConnected = false;

	}

	/**
	 * Check connection for Linux.
	 * 
	 * create on 2015-02-01
	 * 
	 * @param hostname
	 *            hostname
	 * @param port
	 *            port
	 * @param username
	 *            username
	 * @param password
	 *            password
	 * @return the SecureShellClient object
	 * @throws Exception
	 * @throws JSchException
	 * @throws IOException
	 */
	public void connectToLinuxServerBySSHClient(String hostname, int port, String username, String password)
			throws Exception {
		System.out.println("connecting to server: " + hostname + " port: " + port + " user: " + username);

		this.realServerForLinux = new RealLinuxServerInfoBean();

		try {
			sshc = new SSHClient();
			sshc.openSession(hostname, port, username, password);

		} catch (JSchException e) {
			e.printStackTrace();
			throw new JSchException("Exception:" + e.getMessage());
		}

		isFirstConnected = false;

	}

	/**
	 * Get bit size.
	 * 
	 * create on 2015-02-01
	 */
	public void tourLinuxBit() {
		try {
			CommandRequest query = linuxQueryList.queryBit;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxBit(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxBit(e.getMessage());
		}

	}

	/**
	 * Get CPU type.
	 * 
	 * create on 2015-02-01
	 */
	public void tourLinuxCPU() {

		try {
			CommandRequest query = linuxQueryList.queryCPU;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxCPU(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxCPU(e.getMessage());
		}

	}

	/**
	 * Get DNS.
	 * 
	 * create on 2015-04-20
	 */
	public void tourLinuxDNS(String ip) {

		try {
			CommandRequest query = linuxQueryList.queryDNS;
			query.setLine(query.getLine().replaceAll(LinuxQueryList.deafultIP.replaceAll("\\.", "\\\\."), ip));
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxDNS(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxDNS(e.getMessage());
		}
	}

	/**
	 * Get Floating IP.
	 * 
	 * create on 2015-02-01
	 */
	public void tourLinuxFloatingIP() {

		try {
			CommandRequest query = linuxQueryList.queryFloatingIP;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxFloatingIP(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxFloatingIP(e.getMessage());
		}
	}

	/**
	 * Get Floating MAC.
	 * 
	 * create on 2015-02-01
	 */
	public void tourLinuxFloatingMac() {

		try {
			CommandRequest query = linuxQueryList.queryFloatingMac;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxFloatingMac(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxFloatingMac(e.getMessage());
		}
	}

	/**
	 * Get host name.
	 * 
	 * create on 2015-02-01
	 */
	public void tourLinuxHostName() {

		try {
			CommandRequest query = linuxQueryList.queryHostname;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxHostName(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxHostName(e.getMessage());
		}
	}

	/**
	 * Get /etc/hosts.
	 * 
	 * create on 2015-04-22
	 */
	public void tourLinuxHosts() {

		try {
			CommandRequest query = linuxQueryList.queryHosts;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxHosts(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxHosts(e.getMessage());
		}
	}

	/**
	 * Get memory.
	 * 
	 * create on 2015-02-01
	 */
	public void tourLinuxMemory() {

		try {
			CommandRequest query = linuxQueryList.queryMemory;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxMemory(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxMemory(e.getMessage());
		}
	}

	/**
	 * Get NTP.
	 * 
	 * create on 2015-02-01
	 */
	public void tourLinuxNTP() {

		try {
			CommandRequest query = linuxQueryList.queryNTP;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxNTP(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxNTP(e.getMessage());
		}
	}

	/**
	 * Get OS version.
	 * 
	 * create on 2015-02-01
	 */
	public void tourLinuxOSVersion() {

		try {
			CommandRequest query = linuxQueryList.queryOSVersion;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxOSVersion(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxOSVersion(e.getMessage());
		}
	}

	/**
	 * Get Private IP.
	 * 
	 * create on 2015-02-01
	 */
	public void tourLinuxPrivateIP() {

		try {
			CommandRequest query = linuxQueryList.queryPrivateIP;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxPrivateIP(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxPrivateIP(e.getMessage());
		}
	}

	/**
	 * Get Private MAC.
	 * 
	 * create on 2015-02-01
	 */
	public void tourLinuxPrivateMac() {

		try {
			CommandRequest query = linuxQueryList.queryPrivateMac;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxPrivateMac(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxPrivateMac(e.getMessage());
		}
	}

	/**
	 * Get RAM.
	 * 
	 * create on 2015-02-01
	 */
	public void tourLinuxRAM() {

		try {
			CommandRequest query = linuxQueryList.queryRAM;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxRam(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxRam(e.getMessage());
		}
	}

	/**
	 * Get Run Level.
	 * 
	 * create on 2015-04-30
	 */
	public void tourLinuxRunLevel() {
		try {
			CommandRequest query = linuxQueryList.queryRunLevel;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxRunLevel(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxRunLevel(e.getMessage());
		}
	}

	/**
	 * Get SeLinux.
	 * 
	 * create on 2015-04-28
	 */
	public void tourSeLinux() {
		try {
			CommandRequest query = linuxQueryList.querySeLinux;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setSeLinux(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setSeLinux(e.getMessage());
		}
	}

	/**
	 * Get Storage.
	 * 
	 * create on 2015-05-25
	 */
	public void tourLinuxStorage() {
		try {
			CommandRequest query = linuxQueryList.queryStorage;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxStorage(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxStorage(e.getMessage());
		}
	}

	/**
	 * Get Swap Size.
	 * 
	 * create on 2015-02-01
	 */
	public void tourLinuxSwapSize() {
		try {
			CommandRequest query = linuxQueryList.querySwapSize;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxSwapSize(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxSwapSize(e.getMessage());
		}
	}

	/**
	 * Get /etc/sysconfig/network
	 * 
	 * create on 2015-04-27
	 */
	public void tourLinuxSysconfige() {
		try {
			CommandRequest query = linuxQueryList.querySysconfig;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxSysconfig(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxSysconfig(e.getMessage());
		}
	}

	/**
	 * Get Time Zone.
	 * 
	 * create on 2015-02-01
	 */
	public void tourLinuxTimeZone() {
		try {
			CommandRequest query = linuxQueryList.queryTimeZone;
			query.execute();
			String res = query.getResponse();
			this.realServerForLinux.setLinuxTimeZone(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.realServerForLinux.setLinuxTimeZone(e.getMessage());
		}
	}

	public void exitLinuxSever() throws Exception {

		if (sshc != null) {
			sshc.close();
		}
	}

}
