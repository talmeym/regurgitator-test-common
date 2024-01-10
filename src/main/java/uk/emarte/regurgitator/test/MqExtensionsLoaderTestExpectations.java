/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

class MqExtensionsLoaderTestExpectations {
    static final String CreateJmsResponse =                   "uk.emarte.regurgitator.extensions.mq.CreateJmsResponse:[uk.emarte.regurgitator.core.CreateResponse:['create-jms-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[]],'message-id','type','destination','correlation-id',1,2,3,true,'reply-to',123456789]";
    static final String CreateJmsResponse_processor =         "uk.emarte.regurgitator.extensions.mq.CreateJmsResponse:[uk.emarte.regurgitator.core.CreateResponse:['create-jms-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]],'message-id','type','destination','correlation-id',1,2,3,true,'reply-to',123456789]";
    static final String CreateJmsResponse_multipleProcessors = "uk.emarte.regurgitator.extensions.mq.CreateJmsResponse:[uk.emarte.regurgitator.core.CreateResponse:['create-jms-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]],'message-id','type','destination','correlation-id',1,2,3,true,'reply-to',123456789]";
    static final String CreateJmsResponse_multipleProcessorsFlat = "uk.emarte.regurgitator.extensions.mq.CreateJmsResponse:[uk.emarte.regurgitator.core.CreateResponse:['create-jms-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]],'message-id','type','destination','correlation-id',1,2,3,true,'reply-to',123456789]";

    static final String JmsCall = "uk.emarte.regurgitator.extensions.mq.JmsCall:['jms-call-1',uk.emarte.regurgitator.test.stuff.TestMqMessagingSystem:[],'queue://something']";
}
