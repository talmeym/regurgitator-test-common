/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.extensions.mq;

import uk.emarte.regurgitator.test.MockStep;

public class JmsCall extends MockStep {
    public JmsCall(Object id, MqMessagingSystem mqMessagingSystem, String destination) {
        super(id, mqMessagingSystem, destination);
    }
}