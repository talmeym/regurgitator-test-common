/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test.stuff;

import uk.emarte.regurgitator.extensions.mq.MqMessagingSystem;
import uk.emarte.regurgitator.test.Mock;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.TextMessage;

public class TestMqMessagingSystem extends Mock implements MqMessagingSystem {
    @Override
    public Connection getConnection() {
        throw new UnsupportedOperationException("boom");
    }

    @Override
    public TextMessage createTextMessage() {
        throw new UnsupportedOperationException("boom");
    }

    @Override
    public Destination createDestination(String destination) {
        throw new UnsupportedOperationException("boom");
    }
}