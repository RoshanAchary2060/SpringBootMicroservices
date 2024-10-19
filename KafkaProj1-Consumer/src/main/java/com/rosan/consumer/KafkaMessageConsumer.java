package com.rosan.consumer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class KafkaMessageConsumer {
	public static void main(String[] args) {
		// create Connection properties as key-value pairs in java.util.Properties class
		// object
		Properties props = new Properties();
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		props.put(ConsumerConfig.GROUP_ID_CONFIG, "grp1_consumers");
		// create KafkaConsumer class obj
		KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);

		// subscribe to topic destination through MessageBroker
		consumer.subscribe(Arrays.asList("rosan-tpc-oct"));
		// perform polling to check and read the messages
		while (true) {
			// poll and get consumer records (messages)
			ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(2000));

			// read and display messages
			for (ConsumerRecord<String, String> record : records) {
				System.out.println("Message :: " + record.value());
			} // end of for
		} // end of while

	} // end of method
}
