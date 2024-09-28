package com.cst.sr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
public class KafkaProducer {
	
	@Autowired
	private  KafkaTemplate<String, String> kafkaTemplate;
	
	private static final String TOPIC = "user_registration";

	public void sendMessage(String message) {
		kafkaTemplate.send(TOPIC, message);
	}

}
