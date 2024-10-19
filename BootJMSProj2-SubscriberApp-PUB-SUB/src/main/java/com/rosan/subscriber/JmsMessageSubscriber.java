package com.rosan.subscriber;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsMessageSubscriber {
	@JmsListener(destination = "topic")
	public void readMessage(String text) {
		System.out.println("Received message :: " + text);
	}
}
