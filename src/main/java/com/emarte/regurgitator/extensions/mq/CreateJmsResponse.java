package com.emarte.regurgitator.extensions.mq;

import com.emarte.regurgitator.core.CreateResponse;
import com.emarte.regurgitator.test.MockStep;

public class CreateJmsResponse extends MockStep {
	public CreateJmsResponse(CreateResponse response, String destination, String correlationId, String type) {
		super(response, destination, correlationId, type);
	}
}
