package com.mapr.jatin.automation.api;

public interface Client {
	<T> T getResponse();

	void close();

	<T> void execute(T content);
}
