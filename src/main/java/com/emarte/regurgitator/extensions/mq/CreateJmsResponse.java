/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.extensions.mq;

import com.emarte.regurgitator.core.CreateResponse;
import com.emarte.regurgitator.test.MockStep;

public class CreateJmsResponse extends MockStep {
    public CreateJmsResponse(CreateResponse response, String messageId, String type, String destination, String correlationId, Long deliveryMode, Long expiration, Long priority, Boolean redelivered, String replyTo, Long timestamp) {
        super(response, messageId, type, destination, correlationId, deliveryMode, expiration, priority, redelivered, replyTo, timestamp);
    }
}
