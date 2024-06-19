/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

class CoreLoaderTestExpectations {
    static final String BuildParameter_min =                    "uk.emarte.regurgitator.core.BuildParameter:['build-param-1',uk.emarte.regurgitator.core.ParameterPrototype:['toTest1',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.test.stuff.TestValueBuilder:[],[],false]";
    static final String BuildParameter_min_optional =           "uk.emarte.regurgitator.core.BuildParameter:['build-param-1',uk.emarte.regurgitator.core.ParameterPrototype:['toTest1',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.test.stuff.TestValueBuilder:[],[],true]";
    static final String BuildParameter_minFlat =                "uk.emarte.regurgitator.core.BuildParameter:['build-param-1',uk.emarte.regurgitator.core.ParameterPrototype:['toTest1',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.test.stuff.TestValueBuilder:[],[],false]";
    static final String BuildParameter_max =                    "uk.emarte.regurgitator.core.BuildParameter:['build-param-2',uk.emarte.regurgitator.core.ParameterPrototype:['toTest2',uk.emarte.regurgitator.core.NumberType:[],uk.emarte.regurgitator.core.ConflictPolicy:LEAVE],'something',uk.emarte.regurgitator.test.stuff.TestValueBuilder:[],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]],false]";
    static final String BuildParameter_maxFlat =                "uk.emarte.regurgitator.core.BuildParameter:['build-param-2',uk.emarte.regurgitator.core.ParameterPrototype:['toTest2',uk.emarte.regurgitator.core.NumberType:[],uk.emarte.regurgitator.core.ConflictPolicy:LEAVE],'something',uk.emarte.regurgitator.test.stuff.TestValueBuilder:[],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]],false]";
    static final String BuildParameter_maxHalfFlatBuilder =     "uk.emarte.regurgitator.core.BuildParameter:['build-param-2',uk.emarte.regurgitator.core.ParameterPrototype:['toTest2',uk.emarte.regurgitator.core.NumberType:[],uk.emarte.regurgitator.core.ConflictPolicy:LEAVE],'something',uk.emarte.regurgitator.test.stuff.TestValueBuilder:[],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]],false]";
    static final String BuildParameter_maxHalfFlatProcessor =   "uk.emarte.regurgitator.core.BuildParameter:['build-param-2',uk.emarte.regurgitator.core.ParameterPrototype:['toTest2',uk.emarte.regurgitator.core.NumberType:[],uk.emarte.regurgitator.core.ConflictPolicy:LEAVE],'something',uk.emarte.regurgitator.test.stuff.TestValueBuilder:[],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]],false]";
    static final String BuildParameter_multipleProcessors =     "uk.emarte.regurgitator.core.BuildParameter:['build-param-2',uk.emarte.regurgitator.core.ParameterPrototype:['toTest2',uk.emarte.regurgitator.core.NumberType:[],uk.emarte.regurgitator.core.ConflictPolicy:LEAVE],'something',uk.emarte.regurgitator.test.stuff.TestValueBuilder:[],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]],false]";
    static final String BuildParameter_multipleProcessorsFlat = "uk.emarte.regurgitator.core.BuildParameter:['build-param-2',uk.emarte.regurgitator.core.ParameterPrototype:['toTest2',uk.emarte.regurgitator.core.NumberType:[],uk.emarte.regurgitator.core.ConflictPolicy:LEAVE],'something',uk.emarte.regurgitator.test.stuff.TestValueBuilder:[],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]],false]";

    static final String CreateParameter_value =                  "uk.emarte.regurgitator.core.CreateParameter:['create-param-1',uk.emarte.regurgitator.core.ParameterPrototype:['toTest1',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[],false]";
    static final String CreateParameter_value_optional =         "uk.emarte.regurgitator.core.CreateParameter:['create-param-1',uk.emarte.regurgitator.core.ParameterPrototype:['toTest1',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[],true]";
    static final String CreateParameter_file =                   "uk.emarte.regurgitator.core.CreateParameter:['create-param-1',uk.emarte.regurgitator.core.ParameterPrototype:['toTest1',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[null,'file-value'],[],false]";
    static final String CreateParameter_source =                 "uk.emarte.regurgitator.core.CreateParameter:['create-param-1',uk.emarte.regurgitator.core.ParameterPrototype:['toTest1',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null],[],false]";
    static final String CreateParameter_sourceAndValue =         "uk.emarte.regurgitator.core.CreateParameter:['create-param-1',uk.emarte.regurgitator.core.ParameterPrototype:['toTest1',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],'value'],[],false]";
    static final String CreateParameter_sourceAndFile =          "uk.emarte.regurgitator.core.CreateParameter:['create-param-1',uk.emarte.regurgitator.core.ParameterPrototype:['toTest1',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],'file-value'],[],false]";
    static final String CreateParameter_processorFlat =          "uk.emarte.regurgitator.core.CreateParameter:['create-param-1',uk.emarte.regurgitator.core.ParameterPrototype:['toTest1',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]],false]";
    static final String CreateParameter_processor =              "uk.emarte.regurgitator.core.CreateParameter:['create-param-1',uk.emarte.regurgitator.core.ParameterPrototype:['toTest1',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]],false]";
    static final String CreateParameter_multipleProcessors =     "uk.emarte.regurgitator.core.CreateParameter:['create-param-1',uk.emarte.regurgitator.core.ParameterPrototype:['toTest1',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]],false]";
    static final String CreateParameter_multipleProcessorsFlat = "uk.emarte.regurgitator.core.CreateParameter:['create-param-1',uk.emarte.regurgitator.core.ParameterPrototype:['toTest1',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]],false]";

    static final String CreateResponse_value =                  "uk.emarte.regurgitator.core.CreateResponse:['create-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[]]";
    static final String CreateResponse_file =                   "uk.emarte.regurgitator.core.CreateResponse:['create-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'file-value'],[]]";
    static final String CreateResponse_source =                 "uk.emarte.regurgitator.core.CreateResponse:['create-response-1',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null],[]]";
    static final String CreateResponse_sourceAndValue =         "uk.emarte.regurgitator.core.CreateResponse:['create-response-1',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],'value'],[]]";
    static final String CreateResponse_sourceAndFile =          "uk.emarte.regurgitator.core.CreateResponse:['create-response-1',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],'file-value'],[]]";
    static final String CreateResponse_processorFlat =          "uk.emarte.regurgitator.core.CreateResponse:['create-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String CreateResponse_processor =              "uk.emarte.regurgitator.core.CreateResponse:['create-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String CreateResponse_multipleProcessors =     "uk.emarte.regurgitator.core.CreateResponse:['create-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String CreateResponse_multipleProcessorsFlat = "uk.emarte.regurgitator.core.CreateResponse:['create-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";

    static final String Decision_min =     "uk.emarte.regurgitator.core.Decision:['decision-1',[uk.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[uk.emarte.regurgitator.core.Rule:['rule-1',[uk.emarte.regurgitator.core.Condition:['condition-1',uk.emarte.regurgitator.core.ContextLocation:['context:location'],'value',true,uk.emarte.regurgitator.core.ContainsBehaviour:[]]],'test-step-1']],uk.emarte.regurgitator.core.FirstMatchBehaviour:[],null]";
    static final String Decision_minMin =  "uk.emarte.regurgitator.core.Decision:['decision-1',[uk.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[uk.emarte.regurgitator.core.Rule:['rule-1',[uk.emarte.regurgitator.core.Condition:['condition-1',uk.emarte.regurgitator.core.ContextLocation:['context:location'],'value',true,uk.emarte.regurgitator.core.ContainsBehaviour:[]]],'test-step-1']],uk.emarte.regurgitator.core.FirstMatchBehaviour:[],null]";
    static final String Decision_max =     "uk.emarte.regurgitator.core.Decision:['decision-1',[uk.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], uk.emarte.regurgitator.test.stuff.TestStep:['test-step-2']],[uk.emarte.regurgitator.core.Rule:['rule-1',[uk.emarte.regurgitator.core.Condition:['condition-1',uk.emarte.regurgitator.core.ContextLocation:['context:location1'],'value1',false,uk.emarte.regurgitator.core.EqualsBehaviour:[]], uk.emarte.regurgitator.core.Condition:['condition-2',uk.emarte.regurgitator.core.ContextLocation:['context:location2'],'value2',true,uk.emarte.regurgitator.test.stuff.TestConditionBehaviour:[]]],'test-step-1'], uk.emarte.regurgitator.core.Rule:['rule-2',[uk.emarte.regurgitator.core.Condition:['condition-3',uk.emarte.regurgitator.core.ContextLocation:['context:location3'],'value3',false,uk.emarte.regurgitator.core.EqualsBehaviour:[]], uk.emarte.regurgitator.core.Condition:['condition-4',uk.emarte.regurgitator.core.ContextLocation:['context:location4'],'value4',true,uk.emarte.regurgitator.test.stuff.TestConditionBehaviour:[]], uk.emarte.regurgitator.core.Condition:['condition-5',uk.emarte.regurgitator.core.ContextLocation:['context:location5'],'value5',true,uk.emarte.regurgitator.test.stuff.TestConditionBehaviour:[]]],'test-step-2']],uk.emarte.regurgitator.test.stuff.TestRulesBehaviour:[],'test-step-2']";
    static final String Decision_maxMax =  "uk.emarte.regurgitator.core.Decision:['decision-1',[uk.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], uk.emarte.regurgitator.test.stuff.TestStep:['test-step-2']],[uk.emarte.regurgitator.core.Rule:['rule-1',[uk.emarte.regurgitator.core.Condition:['condition-1',uk.emarte.regurgitator.core.ContextLocation:['context:location1'],'value1',false,uk.emarte.regurgitator.core.EqualsBehaviour:[]], uk.emarte.regurgitator.core.Condition:['condition-2',uk.emarte.regurgitator.core.ContextLocation:['context:location2'],'value2',true,uk.emarte.regurgitator.test.stuff.TestConditionBehaviour:[]]],'test-step-1'], uk.emarte.regurgitator.core.Rule:['rule-2',[uk.emarte.regurgitator.core.Condition:['condition-3',uk.emarte.regurgitator.core.ContextLocation:['context:location3'],'value3',false,uk.emarte.regurgitator.core.EqualsBehaviour:[]], uk.emarte.regurgitator.core.Condition:['condition-4',uk.emarte.regurgitator.core.ContextLocation:['context:location4'],'value4',true,uk.emarte.regurgitator.test.stuff.TestConditionBehaviour:[]]],'test-step-2']],uk.emarte.regurgitator.test.stuff.TestRulesBehaviour:[],'test-step-2']";

    static final String ExtractProcessor_min = "uk.emarte.regurgitator.core.ExtractProcessor:['this is {0} test',0]";

    static final String GenerateParameter_min =                    "uk.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.test.stuff.TestValueGenerator:[],[],false]";
    static final String GenerateParameter_min_optional =           "uk.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.test.stuff.TestValueGenerator:[],[],true]";
    static final String GenerateParameter_max =                    "uk.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.NumberType:[],uk.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',uk.emarte.regurgitator.test.stuff.TestValueGenerator:[],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]],false]";
    static final String GenerateParameter_maxFlat =                "uk.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.NumberType:[],uk.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',uk.emarte.regurgitator.test.stuff.TestValueGenerator:[],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]],false]";
    static final String GenerateParameter_maxHalfFlatGenerator =   "uk.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.NumberType:[],uk.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',uk.emarte.regurgitator.test.stuff.TestValueGenerator:[],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]],false]";
    static final String GenerateParameter_maxHalfFlatProcessor =   "uk.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.NumberType:[],uk.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',uk.emarte.regurgitator.test.stuff.TestValueGenerator:[],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]],false]";
    static final String GenerateParameter_multipleProcessors =     "uk.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.NumberType:[],uk.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',uk.emarte.regurgitator.test.stuff.TestValueGenerator:[],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]],false]";
    static final String GenerateParameter_multipleProcessorsFlat = "uk.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.NumberType:[],uk.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',uk.emarte.regurgitator.test.stuff.TestValueGenerator:[],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]],false]";

    static final String IdentifySession_value =          "uk.emarte.regurgitator.core.IdentifySession:['identify-session-1',uk.emarte.regurgitator.core.ValueSource:[null,'value']]";
    static final String IdentifySession_source =         "uk.emarte.regurgitator.core.IdentifySession:['identify-session-1',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null]]";
    static final String IdentifySession_sourceAndValue = "uk.emarte.regurgitator.core.IdentifySession:['identify-session-1',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],'value']]";

    static final String IndexOfProcessor_value =          "uk.emarte.regurgitator.core.IndexOfProcessor:[uk.emarte.regurgitator.core.ValueSource:[null,'value'],false]";
    static final String IndexOfProcessor_source =         "uk.emarte.regurgitator.core.IndexOfProcessor:[uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null],false]";
    static final String IndexOfProcessor_sourceAndValue = "uk.emarte.regurgitator.core.IndexOfProcessor:[uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],'value'],false]";

    static final String AtIndexProcessor_value =          "uk.emarte.regurgitator.core.AtIndexProcessor:[uk.emarte.regurgitator.core.ValueSource:[null,'value']]";
    static final String AtIndexProcessor_source =         "uk.emarte.regurgitator.core.AtIndexProcessor:[uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null]]";
    static final String AtIndexProcessor_sourceAndValue = "uk.emarte.regurgitator.core.AtIndexProcessor:[uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],'value']]";

    static final String NumberGenerator =     "uk.emarte.regurgitator.core.NumberGenerator:[null]";
    static final String NumberGenerator_max = "uk.emarte.regurgitator.core.NumberGenerator:[1234]";

    static final String ListProcessor = "uk.emarte.regurgitator.core.ListProcessor:[[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";

    static final String RecordMessage_min =    "uk.emarte.regurgitator.core.RecordMessage:['record-message-1',null]";
    static final String RecordMessage_folder = "uk.emarte.regurgitator.core.RecordMessage:['record-message-1','/folder/folder']";

    static final String RemoveAtIndexProcessor_value = "uk.emarte.regurgitator.core.RemoveAtIndexProcessor:[uk.emarte.regurgitator.core.ValueSource:[null,'param-1']]";
    static final String RemoveAtIndexProcessor_source = "uk.emarte.regurgitator.core.RemoveAtIndexProcessor:[uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['param-1'],null]]";

    static final String SetAtIndexProcessor_BothSource = "uk.emarte.regurgitator.core.SetAtIndexProcessor:[uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['param-1'],null],uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['param-2'],null]]";

    static final String Sequence_min =            "uk.emarte.regurgitator.core.Sequence:['sequence-1',[uk.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],null]";
    static final String Sequence_max =            "uk.emarte.regurgitator.core.Sequence:['sequence-1',[uk.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], uk.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], uk.emarte.regurgitator.test.stuff.TestStep:['test-step-3']],uk.emarte.regurgitator.core.Isolate:[true,true]]";
    static final String Sequence_isolate =        "uk.emarte.regurgitator.core.Sequence:['sequence-1',[uk.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], uk.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], uk.emarte.regurgitator.test.stuff.TestStep:['test-step-3']],uk.emarte.regurgitator.core.Isolate:[false,false]]";
    static final String Sequence_isolateParams =  "uk.emarte.regurgitator.core.Sequence:['sequence-1',[uk.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], uk.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], uk.emarte.regurgitator.test.stuff.TestStep:['test-step-3']],uk.emarte.regurgitator.core.Isolate:[false,true]]";
    static final String Sequence_isolateSession = "uk.emarte.regurgitator.core.Sequence:['sequence-1',[uk.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], uk.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], uk.emarte.regurgitator.test.stuff.TestStep:['test-step-3']],uk.emarte.regurgitator.core.Isolate:[true,false]]";

    static final String SequenceRef_min = "uk.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[uk.emarte.regurgitator.core.CreateParameter:['create-param-1',uk.emarte.regurgitator.core.ParameterPrototype:['toTest1',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null],[],false]],null]";

    static final String SizeProcessor =         "uk.emarte.regurgitator.core.SizeProcessor:[false]";
    static final String SizeProcessor_asIndex = "uk.emarte.regurgitator.core.SizeProcessor:[true]";

    static final String SubstituteProcessor_min = "uk.emarte.regurgitator.core.SubstituteProcessor:['this','that']";

    static final String UuidGenerator = "uk.emarte.regurgitator.core.UuidGenerator:[]";
}
