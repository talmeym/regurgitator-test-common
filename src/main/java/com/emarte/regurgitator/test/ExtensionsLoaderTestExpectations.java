/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

class ExtensionsLoaderTestExpectations {
    static final String ContainsJsonPathBehaviour_fullLoad = "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location'],'$.something.something',true,com.emarte.regurgitator.extensions.ContainsJsonPathBehaviour:[]]],'test-step-1']],com.emarte.regurgitator.core.FirstMatchBehaviour:[],null]],null]";

    static final String ContainsXpath_min = "com.emarte.regurgitator.extensions.ContainsXpath:[{}]";
    static final String ContainsXpath_max = "com.emarte.regurgitator.extensions.ContainsXpath:[{this=http://something.com}]";
    static final String ContainsXpath_fullLoad = "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location'],'/something/something',true,com.emarte.regurgitator.extensions.ContainsXpath:[{prefix2=url2, prefix1=url1}]]],'test-step-1']],com.emarte.regurgitator.core.FirstMatchBehaviour:[],null]],null]";
    static final String ContainsXpath_fullLoad_entityLookup = "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location'],'/something/something',true,com.emarte.regurgitator.extensions.ContainsXpath:[{}]]],'test-step-1']],com.emarte.regurgitator.core.FirstMatchBehaviour:[],null]],null]";

    static final String FreemarkerBuilder_value = "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'{\"something\":\"${something}\"}'],false]";
    static final String FreemarkerBuilder_valueFlat = "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'{\"something\":\"${something}\"}'],false]";
    static final String FreemarkerBuilder_file = "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'{\"something\":\"${something}\"}'],false]";
    static final String FreemarkerBuilder_source = "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],false]";
    static final String FreemarkerBuilder_allContexts = "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something.something'],true]";

    static final String FreemarkerProcessor_value = "com.emarte.regurgitator.extensions.FreemarkerProcessor:['{\"something\":\"${something}\"}']";
    static final String FreemarkerProcessor_valueFlat = "com.emarte.regurgitator.extensions.FreemarkerProcessor:['{\"something\":\"${something}\"}']";
    static final String FreemarkerProcessor_file = "com.emarte.regurgitator.extensions.FreemarkerProcessor:['{\"something\":\"${something}\"}']";


    static final String JsonParameter_min =     "com.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['location'],null],com.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],[]]";
    static final String JsonParameter_max =     "com.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],com.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String JsonParameter_maxFlat = "com.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],com.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";

    static final String JsonPathProcessor = "com.emarte.regurgitator.extensions.JsonPathProcessor:['something.something']";
    static final String JsonPathProcessor_fullLoad = "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],[com.emarte.regurgitator.extensions.JsonPathProcessor:['$.something.something']]]],null]";

    static final String VelocityBuilder_file = "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'{\"something\":\"${something}\"}'],false]";
    static final String VelocityBuilder_source = "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],false]";
    static final String VelocityBuilder_value = "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'{\"something\":\"${something}\"}'],false]";
    static final String VelocityBuilder_valueFlat = "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'{\"something\":\"${something}\"}'],false]";
    static final String VelocityBuilder_allContexts = "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'{\"something\":\"${something}\"}'],true]";

    static final String VelocityProcessor_value = "com.emarte.regurgitator.extensions.VelocityProcessor:['{\"something\":\"${something}\"}']";
    static final String VelocityProcessor_valueFlat = "com.emarte.regurgitator.extensions.VelocityProcessor:['{\"something\":\"${something}\"}']";
    static final String VelocityProcessor_file = "com.emarte.regurgitator.extensions.VelocityProcessor:['{\"something\":\"${something}\"}']";

    static final String XmlParameter_min =     "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['location'],null],com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}],[]]";
    static final String XmlParameter_max =     "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['location'],null],com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";
    static final String XmlParameter_maxFlat = "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['location'],null],com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]]";

    static final String XmlSchemaValidator = "com.emarte.regurgitator.extensions.XmlSchemaValidator:['classpath:/something.something.file']";

    static final String XpathProcessor_min = "com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}]";
    static final String XpathProcessor_max = "com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}]";
}