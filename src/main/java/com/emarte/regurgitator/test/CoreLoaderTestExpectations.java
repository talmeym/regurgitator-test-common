/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

class CoreLoaderTestExpectations {

    static final String BuildParameter_min =                  "com.emarte.regurgitator.core.BuildParameter:['build-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.test.stuff.TestValueBuilder:[],[]]";
    static final String BuildParameter_minFlat =              "com.emarte.regurgitator.core.BuildParameter:['build-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.test.stuff.TestValueBuilder:[],[]]";
    static final String BuildParameter_max =                  "com.emarte.regurgitator.core.BuildParameter:['build-param-2',com.emarte.regurgitator.core.ParameterPrototype:['toTest2',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'something',com.emarte.regurgitator.test.stuff.TestValueBuilder:[],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String BuildParameter_maxFlat =              "com.emarte.regurgitator.core.BuildParameter:['build-param-2',com.emarte.regurgitator.core.ParameterPrototype:['toTest2',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'something',com.emarte.regurgitator.test.stuff.TestValueBuilder:[],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String BuildParameter_maxHalfFlatBuilder =   "com.emarte.regurgitator.core.BuildParameter:['build-param-2',com.emarte.regurgitator.core.ParameterPrototype:['toTest2',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'something',com.emarte.regurgitator.test.stuff.TestValueBuilder:[],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String BuildParameter_maxHalfFlatProcessor = "com.emarte.regurgitator.core.BuildParameter:['build-param-2',com.emarte.regurgitator.core.ParameterPrototype:['toTest2',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'something',com.emarte.regurgitator.test.stuff.TestValueBuilder:[],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";

    static final String CreateParameter_value =           "com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[null,'value'],[]]";
    static final String CreateParameter_file =            "com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[null,'file-value'],[]]";
    static final String CreateParameter_source =          "com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],[]]";
    static final String CreateParameter_sourceAndValue =  "com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],'value'],[]]";
    static final String CreateParameter_sourceAndFile =   "com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],'file-value'],[]]";
    static final String CreateParameter_processor =       "com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String CreateParameter_processorConfig = "com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";

    static final String CreateResponse_value =           "com.emarte.regurgitator.core.CreateResponse:['create-response-1',com.emarte.regurgitator.core.ValueSource:[null,'value'],[]]";
    static final String CreateResponse_file =            "com.emarte.regurgitator.core.CreateResponse:['create-response-1',com.emarte.regurgitator.core.ValueSource:[null,'file-value'],[]]";
    static final String CreateResponse_source =          "com.emarte.regurgitator.core.CreateResponse:['create-response-1',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],[]]";
    static final String CreateResponse_sourceAndValue =  "com.emarte.regurgitator.core.CreateResponse:['create-response-1',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],'value'],[]]";
    static final String CreateResponse_sourceAndFile =   "com.emarte.regurgitator.core.CreateResponse:['create-response-1',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],'file-value'],[]]";
    static final String CreateResponse_processor =       "com.emarte.regurgitator.core.CreateResponse:['create-response-1',com.emarte.regurgitator.core.ValueSource:[null,'value'],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String CreateResponse_processorConfig = "com.emarte.regurgitator.core.CreateResponse:['create-response-1',com.emarte.regurgitator.core.ValueSource:[null,'value'],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";

    static final String Decision_min =     "com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location'],'value',true,com.emarte.regurgitator.core.ContainsBehaviour:[]]],'test-step-1']],com.emarte.regurgitator.core.FirstMatchBehaviour:[],null]";
    static final String Decision_minMin =  "com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location'],'value',true,com.emarte.regurgitator.core.ContainsBehaviour:[]]],'test-step-1']],com.emarte.regurgitator.core.FirstMatchBehaviour:[],null]";
    static final String Decision_max =     "com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location1'],'value1',false,com.emarte.regurgitator.core.EqualsBehaviour:[]], com.emarte.regurgitator.core.Condition:['condition-2',com.emarte.regurgitator.core.ContextLocation:['context:location2'],'value2',true,com.emarte.regurgitator.test.stuff.TestConditionBehaviour:[]]],'test-step-1'], com.emarte.regurgitator.core.Rule:['rule-2',[com.emarte.regurgitator.core.Condition:['condition-3',com.emarte.regurgitator.core.ContextLocation:['context:location3'],'value3',false,com.emarte.regurgitator.core.EqualsBehaviour:[]], com.emarte.regurgitator.core.Condition:['condition-4',com.emarte.regurgitator.core.ContextLocation:['context:location4'],'value4',true,com.emarte.regurgitator.test.stuff.TestConditionBehaviour:[]], com.emarte.regurgitator.core.Condition:['condition-5',com.emarte.regurgitator.core.ContextLocation:['context:location5'],'value5',true,com.emarte.regurgitator.test.stuff.TestConditionBehaviour:[]]],'test-step-2']],com.emarte.regurgitator.test.stuff.TestRulesBehaviour:[],'test-step-2']";
    static final String Decision_maxMax =  "com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location1'],'value1',false,com.emarte.regurgitator.core.EqualsBehaviour:[]], com.emarte.regurgitator.core.Condition:['condition-2',com.emarte.regurgitator.core.ContextLocation:['context:location2'],'value2',true,com.emarte.regurgitator.test.stuff.TestConditionBehaviour:[]]],'test-step-1'], com.emarte.regurgitator.core.Rule:['rule-2',[com.emarte.regurgitator.core.Condition:['condition-3',com.emarte.regurgitator.core.ContextLocation:['context:location3'],'value3',false,com.emarte.regurgitator.core.EqualsBehaviour:[]], com.emarte.regurgitator.core.Condition:['condition-4',com.emarte.regurgitator.core.ContextLocation:['context:location4'],'value4',true,com.emarte.regurgitator.test.stuff.TestConditionBehaviour:[]]],'test-step-2']],com.emarte.regurgitator.test.stuff.TestRulesBehaviour:[],'test-step-2']";

    static final String ExtractProcessor_min = "com.emarte.regurgitator.core.ExtractProcessor:['this is {0} test',0]";

    static final String GenerateParameter_min =                  "com.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.test.stuff.TestValueGenerator:[],[]]";
    static final String GenerateParameter_max =                  "com.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',com.emarte.regurgitator.test.stuff.TestValueGenerator:[],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String GenerateParameter_maxFlat =              "com.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',com.emarte.regurgitator.test.stuff.TestValueGenerator:[],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String GenerateParameter_maxHalfFlatGenerator = "com.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',com.emarte.regurgitator.test.stuff.TestValueGenerator:[],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String GenerateParameter_maxHalfFlatProcessor = "com.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',com.emarte.regurgitator.test.stuff.TestValueGenerator:[],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";

    static final String IdentifySession_value =          "com.emarte.regurgitator.core.IdentifySession:['identify-session-1',com.emarte.regurgitator.core.ValueSource:[null,'value']]";
    static final String IdentifySession_source =         "com.emarte.regurgitator.core.IdentifySession:['identify-session-1',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null]]";
    static final String IdentifySession_sourceAndValue = "com.emarte.regurgitator.core.IdentifySession:['identify-session-1',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],'value']]";

    static final String IndexOfProcessor_value =          "com.emarte.regurgitator.core.IndexOfProcessor:[com.emarte.regurgitator.core.ValueSource:[null,'value'],false]";
    static final String IndexOfProcessor_source =         "com.emarte.regurgitator.core.IndexOfProcessor:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],false]";
    static final String IndexOfProcessor_sourceAndValue = "com.emarte.regurgitator.core.IndexOfProcessor:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],'value'],false]";

    static final String IndexProcessor_value =          "com.emarte.regurgitator.core.IndexProcessor:[com.emarte.regurgitator.core.ValueSource:[null,'value']]";
    static final String IndexProcessor_source =         "com.emarte.regurgitator.core.IndexProcessor:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null]]";
    static final String IndexProcessor_sourceAndValue = "com.emarte.regurgitator.core.IndexProcessor:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],'value']]";

    static final String NumberGenerator =     "com.emarte.regurgitator.core.NumberGenerator:[null]";
    static final String NumberGenerator_max = "com.emarte.regurgitator.core.NumberGenerator:[1234]";

    static final String RecordMessage_min =    "com.emarte.regurgitator.core.RecordMessage:['record-message-1',null]";
    static final String RecordMessage_folder = "com.emarte.regurgitator.core.RecordMessage:['record-message-1','/folder/folder']";

    static final String Sequence_min =            "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],null]";
    static final String Sequence_max =            "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-3']],com.emarte.regurgitator.core.Isolate:[true,true]]";
    static final String Sequence_isolate =        "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-3']],com.emarte.regurgitator.core.Isolate:[false,false]]";
    static final String Sequence_isolateParams =  "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-3']],com.emarte.regurgitator.core.Isolate:[false,true]]";
    static final String Sequence_isolateSession = "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-3']],com.emarte.regurgitator.core.Isolate:[true,false]]";

    static final String SizeProcessor =         "com.emarte.regurgitator.core.SizeProcessor:[false]";
    static final String SizeProcessor_asIndex = "com.emarte.regurgitator.core.SizeProcessor:[true]";

    static final String SubstituteProcessor_min = "com.emarte.regurgitator.core.SubstituteProcessor:['this','that']";

    static final String UuidGenerator = "com.emarte.regurgitator.core.UuidGenerator:[]";
}
