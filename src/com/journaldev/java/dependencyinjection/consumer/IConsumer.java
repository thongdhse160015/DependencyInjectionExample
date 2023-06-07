package com.journaldev.java.dependencyinjection.consumer;

public interface IConsumer {

	//do some msg validation, manipulation logic etc
	void processMessages(String msg, String rec);
}
