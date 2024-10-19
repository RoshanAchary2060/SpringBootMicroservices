package com.rosan.sender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMessageSender {
	@Autowired
	private JmsTemplate template;

	@Scheduled(cron = "*/10 * * * * *")
	public void sendMessage() {
		// using anonymous inner class logics
//		template.send("testmq1", new MessageCreator() {
//			@Override
//			public Message createMessage(Session session) throws JMSException {
//				Message message = session.createTextMessage("From Sender at :: " + new Date());
//				return message;
//			}
//		});

		// using lambda style anonymous inner class
//		template.send("testmq1", sess -> {
//			return sess.createTextMessage("From sender at :: " + new Date());
//		});

		// using One Liner lambda expression
		template.send("testmq1", sess -> sess.createTextMessage("From sender at :: " + new Date()));
		System.out.println("Message sent");
	}

}
