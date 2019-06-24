package com.cai;

import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class MyConsumer {


	public void onMessage(Message<String> message) {
		MessageHeaders headers = message.getHeaders();
		//手动提交偏移量的参数对象
		Acknowledgment acknowledgment = (Acknowledgment) headers.get("kafka_acknowledgment");
		
		String topic = (String) headers.get("kafka_receivedTopic");
		log.info("topic:{}",topic);
		
		long offset = (long) headers.get("kafka_offset");
		log.info("offset:{}",offset);
		
		int partition = (int) headers.get("kafka_receivedPartitionId");
		log.info("partition:{}",partition);
		
		String kafkaMsg = message.getPayload();
		log.info("kafkaMsg:{}",kafkaMsg);
		
		//提交偏移量
		acknowledgment.acknowledge();
		
	}
	

}
