/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

class MqExtensionsLoaderTestExpectations {
    static final String CreateJmsResponse = "com.emarte.regurgitator.extensions.mq.CreateJmsResponse:[com.emarte.regurgitator.core.CreateResponse:['create-jms-response-1',com.emarte.regurgitator.core.ValueSource:[null,'value'],[]],'message-id','type','destination','correlation-id',1,2,3,true,'reply-to',123456789]";

    static final String JmsCall = "com.emarte.regurgitator.extensions.mq.JmsCall:['jms-call-1',com.emarte.regurgitator.test.stuff.TestMqMessagingSystem:[],'queue://something']";
}
