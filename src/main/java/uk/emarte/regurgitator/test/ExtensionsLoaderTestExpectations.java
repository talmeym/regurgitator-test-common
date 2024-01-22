/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

class ExtensionsLoaderTestExpectations {
    static final String ContainsJsonPathBehaviour_fullLoad = "uk.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[uk.emarte.regurgitator.core.Decision:['decision-1',[uk.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[uk.emarte.regurgitator.core.Rule:['rule-1',[uk.emarte.regurgitator.core.Condition:['condition-1',uk.emarte.regurgitator.core.ContextLocation:['context:location'],'$.something.something',true,uk.emarte.regurgitator.extensions.ContainsJsonPathBehaviour:[]]],'test-step-1']],uk.emarte.regurgitator.core.FirstMatchBehaviour:[],null]],null]";

    static final String ContainsXpathBehaviour_min =                   "uk.emarte.regurgitator.extensions.ContainsXpathBehaviour:[{}]";
    static final String ContainsXpathBehaviour_max =                   "uk.emarte.regurgitator.extensions.ContainsXpathBehaviour:[{this=http://something.com}]";
    static final String ContainsXpathBehaviour_fullLoad =              "uk.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[uk.emarte.regurgitator.core.Decision:['decision-1',[uk.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[uk.emarte.regurgitator.core.Rule:['rule-1',[uk.emarte.regurgitator.core.Condition:['condition-1',uk.emarte.regurgitator.core.ContextLocation:['context:location'],'/something/something',true,uk.emarte.regurgitator.extensions.ContainsXpathBehaviour:[{prefix2=url2, prefix1=url1}]]],'test-step-1']],uk.emarte.regurgitator.core.FirstMatchBehaviour:[],null]],null]";
    static final String ContainsXpathBehaviour_fullLoad_entityLookup = "uk.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[uk.emarte.regurgitator.core.Decision:['decision-1',[uk.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[uk.emarte.regurgitator.core.Rule:['rule-1',[uk.emarte.regurgitator.core.Condition:['condition-1',uk.emarte.regurgitator.core.ContextLocation:['context:location'],'/something/something',true,uk.emarte.regurgitator.extensions.ContainsXpathBehaviour:[{}]]],'test-step-1']],uk.emarte.regurgitator.core.FirstMatchBehaviour:[],null]],null]";

    static final String FreemarkerBuilder_value =       "uk.emarte.regurgitator.extensions.FreemarkerBuilder:[uk.emarte.regurgitator.core.ValueSource:[null,'{\"something\":\"${something}\"}'],false]";
    static final String FreemarkerBuilder_valueFlat =   "uk.emarte.regurgitator.extensions.FreemarkerBuilder:[uk.emarte.regurgitator.core.ValueSource:[null,'{\"something\":\"${something}\"}'],false]";
    static final String FreemarkerBuilder_file =        "uk.emarte.regurgitator.extensions.FreemarkerBuilder:[uk.emarte.regurgitator.core.ValueSource:[null,'{\"something\":\"${something}\"}'],false]";
    static final String FreemarkerBuilder_source =      "uk.emarte.regurgitator.extensions.FreemarkerBuilder:[uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null],false]";
    static final String FreemarkerBuilder_allContexts = "uk.emarte.regurgitator.extensions.FreemarkerBuilder:[uk.emarte.regurgitator.core.ValueSource:[null,'something.something'],true]";

    static final String FreemarkerProcessor_value =     "uk.emarte.regurgitator.extensions.FreemarkerProcessor:['{\"something\":\"${something}\"}']";
    static final String FreemarkerProcessor_valueFlat = "uk.emarte.regurgitator.extensions.FreemarkerProcessor:['{\"something\":\"${something}\"}']";
    static final String FreemarkerProcessor_file =      "uk.emarte.regurgitator.extensions.FreemarkerProcessor:['{\"something\":\"${something}\"}']";

    static final String JsonParameter_min =                    "uk.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['location'],null],uk.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],[]]";
    static final String JsonParameter_max =                    "uk.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.NumberType:[],uk.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null],uk.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String JsonParameter_maxFlat =                "uk.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.NumberType:[],uk.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null],uk.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String JsonParameter_multipleProcessors =     "uk.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.NumberType:[],uk.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null],uk.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String JsonParameter_multipleProcessorsFlat = "uk.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.NumberType:[],uk.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null],uk.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";

    static final String JsonPathProcessor =          "uk.emarte.regurgitator.extensions.JsonPathProcessor:['something.something']";
    static final String JsonPathProcessor_fullLoad = "uk.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[uk.emarte.regurgitator.core.CreateParameter:['create-param-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null],[uk.emarte.regurgitator.extensions.JsonPathProcessor:['$.something.something']]]],null]";

    static final String JsonPrintProcessor =          "uk.emarte.regurgitator.extensions.JsonPrintProcessor:[]";
    static final String JsonPrintProcessor_fullLoad = "uk.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[uk.emarte.regurgitator.core.CreateParameter:['create-param-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null],[uk.emarte.regurgitator.extensions.JsonPrintProcessor:[]]]],null]";

    static final String VelocityBuilder_file =        "uk.emarte.regurgitator.extensions.VelocityBuilder:[uk.emarte.regurgitator.core.ValueSource:[null,'{\"something\":\"${something}\"}'],false]";
    static final String VelocityBuilder_source =      "uk.emarte.regurgitator.extensions.VelocityBuilder:[uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['context:location'],null],false]";
    static final String VelocityBuilder_value =       "uk.emarte.regurgitator.extensions.VelocityBuilder:[uk.emarte.regurgitator.core.ValueSource:[null,'{\"something\":\"${something}\"}'],false]";
    static final String VelocityBuilder_valueFlat =   "uk.emarte.regurgitator.extensions.VelocityBuilder:[uk.emarte.regurgitator.core.ValueSource:[null,'{\"something\":\"${something}\"}'],false]";
    static final String VelocityBuilder_allContexts = "uk.emarte.regurgitator.extensions.VelocityBuilder:[uk.emarte.regurgitator.core.ValueSource:[null,'{\"something\":\"${something}\"}'],true]";

    static final String VelocityProcessor_value =     "uk.emarte.regurgitator.extensions.VelocityProcessor:['{\"something\":\"${something}\"}']";
    static final String VelocityProcessor_valueFlat = "uk.emarte.regurgitator.extensions.VelocityProcessor:['{\"something\":\"${something}\"}']";
    static final String VelocityProcessor_file =      "uk.emarte.regurgitator.extensions.VelocityProcessor:['{\"something\":\"${something}\"}']";

    static final String XmlParameter_min =                    "uk.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['location'],null],uk.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}],[]]";
    static final String XmlParameter_max =                    "uk.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['location'],null],uk.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String XmlParameter_maxFlat =                "uk.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['location'],null],uk.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String XmlParameter_multipleProcessors =     "uk.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['location'],null],uk.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String XmlParameter_multipleProcessorsFlat = "uk.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',uk.emarte.regurgitator.core.ParameterPrototype:['name',uk.emarte.regurgitator.core.StringType:[],uk.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['location'],null],uk.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";

    static final String XmlSchemaValidator = "uk.emarte.regurgitator.extensions.XmlSchemaValidator:['classpath:/something.something.file']";

    static final String XpathProcessor_min = "uk.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}]";
    static final String XpathProcessor_max = "uk.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}]";
}
