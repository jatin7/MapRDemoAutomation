package com.mapr.jatin.automation.api;


import java.util.ArrayList;

/**
 * this class is for defining a command line/lines request which can be
 * identified by {@link } and it can be annotated by
 * {@link }.
 * 
 * @author Jatin Shah
 *
 */
public class CommandRequest {
	private String content = null;
	private String[] contents = null;
	private Client commandClient = null;
	private Object response = null;
	private ArrayList<Object> responses = new ArrayList<Object>();


	public String getLine() {
		// TODO Auto-generated method stub
		return this.content;
	}


	public void setLine(String arg) {
		// TODO Auto-generated method stub
		this.content = arg;

	}


	public String[] getLines() {
		// TODO Auto-generated method stub
		return this.contents;
	}


	public void setLines(String[] arg) {
		// TODO Auto-generated method stub
		this.contents = arg;

	}


	public Client getClient() {
		// TODO Auto-generated method stub
		return this.commandClient;
	}

	public void setClient(Client cc) {
		// TODO Auto-generated method stub
		this.commandClient = cc;
	}

	public void execute() {
		// TODO Auto-generated method stub
		if (this.content != null) {
			this.commandClient.execute(this.content);
			this.response = this.commandClient.getResponse();
		} else if (this.contents != null) {
			for (int i = 0; i < this.contents.length; i++) {
				this.commandClient.execute(this.contents[i]);
				this.responses.add(this.commandClient.getResponse());
			}

		} else {
			System.out.println("Nothing to execute!");
		}

	}

	@SuppressWarnings("unchecked")
	public <T> T getResponse() {
		// TODO Auto-generated method stub
		return (T) this.response;

	}

	@SuppressWarnings("unchecked")
	public <T> ArrayList<T> getResponses() {
		// TODO Auto-generated method stub
		ArrayList<T> temp = new ArrayList<T>();
		for (int i = 0; i < this.responses.size(); i++) {
			temp.add((T) this.responses.get(i));
		}
		return temp;
	}

}
