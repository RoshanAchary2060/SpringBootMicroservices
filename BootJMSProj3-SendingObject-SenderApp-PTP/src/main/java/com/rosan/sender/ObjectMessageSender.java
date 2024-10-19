package com.rosan.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.rosan.model.ActorInfo;

@Component
public class ObjectMessageSender {
	@Autowired
	JmsTemplate template;

	@Scheduled(cron = "0/20 * * * * *")
	public void sendObjectDataAsMessage() {
		// prepare Object
		ActorInfo actor = new ActorInfo(101, "Roshan", "Mumbai");

		// send object as the message
		template.convertAndSend("obj_mq1", actor);
		System.out.println("Object is sent as message");
	}
}
