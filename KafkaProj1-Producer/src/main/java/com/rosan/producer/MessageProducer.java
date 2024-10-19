package com.rosan.producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class MessageProducer {
	public static void main(String[] args) {
		// create Connection properties as key-value pairs in java.util.Properties class
		// object
		Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);

		// create KafkaProducer class obj
		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);

		// create ProducerRecord class object representing the message
		String msg = "Welcome to Apache Kafka Messaging Developed using Non-Spring style";
		String topicName = "rosan-tpc-oct";
		ProducerRecord<String, String> record = new ProducerRecord<String, String>(topicName, msg);

		// send message (record)
		producer.send(record);

		// flush the message
		producer.flush();

		// close the connection with Bootstrap server
		producer.close();
		System.out.println("Message sent");

	} // end of method

} // end of class
