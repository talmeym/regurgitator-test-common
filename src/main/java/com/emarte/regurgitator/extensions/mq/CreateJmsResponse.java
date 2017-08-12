package com.emarte.regurgitator.extensions.mq;

import com.emarte.regurgitator.core.CreateResponse;
import com.emarte.regurgitator.test.MockStep;

public class CreateJmsResponse extends MockStep {
	public CreateJmsResponse(CreateResponse response, String messageId, String type, String destination, String correlationId, String deliveryMode, String expiration, String priority, String redelivered, String replyTo, String timestamp) {
		super(response, messageId, type, destination, correlationId, deliveryMode, expiration, priority, redelivered, replyTo, timestamp);
	}
}
