package com.journaldev.java.dependencyinjection.injector;

import com.journaldev.java.dependencyinjection.consumer.IConsumer;

public interface IMessageServiceInjector {

	public IConsumer getConsumer();
}
