package com.cai;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptor;

public class KafkaInterceptor implements ChannelInterceptor {

	@Override
	public Message<?> preSend(Message<?> message, MessageChannel channel) {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public void postSend(Message<?> message, MessageChannel channel, boolean sent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterSendCompletion(Message<?> message, MessageChannel channel, boolean sent, Exception ex) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preReceive(MessageChannel channel) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Message<?> postReceive(Message<?> message, MessageChannel channel) {
		// TODO Auto-generated method stub
		System.out.println("postReceive");
		return message;
	}

	@Override
	public void afterReceiveCompletion(Message<?> message, MessageChannel channel, Exception ex) {
		// TODO Auto-generated method stub
		System.out.println("afterReceiveCompletion");
		System.out.println(message);
	}

}
