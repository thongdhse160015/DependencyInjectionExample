package com.journaldev.java.dependencyinjection.injector;

import com.journaldev.java.dependencyinjection.consumer.IConsumer;
import com.journaldev.java.dependencyinjection.consumer.MyDIApplication;
import com.journaldev.java.dependencyinjection.service.SMSServiceImpl;

public class SMSServiceInjector implements IMessageServiceInjector {

	@Override
	public IConsumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}
