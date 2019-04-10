/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

class WebExtensionsLoaderTestExpectations {
    static final String CreateFileResponse = "com.emarte.regurgitator.extensions.web.CreateFileResponse:['create-file-response-1',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['request-metadata:path-info'],null],null]";
    static final String CreateFileResponse_prefixed = "com.emarte.regurgitator.extensions.web.CreateFileResponse:['create-file-response-1',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['request-metadata:path-info'],null],'/assets']";

    static final String CreateHttpResponse_value =              "com.emarte.regurgitator.extensions.web.CreateHttpResponse:[com.emarte.regurgitator.core.CreateResponse:['create-http-response-1',com.emarte.regurgitator.core.ValueSource:[null,'value'],[]],-1,null]";
    static final String CreateHttpResponse_statusCode =         "com.emarte.regurgitator.extensions.web.CreateHttpResponse:[com.emarte.regurgitator.core.CreateResponse:['create-http-response-1',com.emarte.regurgitator.core.ValueSource:[null,'value'],[]],200,null]";
    static final String CreateHttpResponse_contentType =        "com.emarte.regurgitator.extensions.web.CreateHttpResponse:[com.emarte.regurgitator.core.CreateResponse:['create-http-response-1',com.emarte.regurgitator.core.ValueSource:[null,'value'],[]],-1,'contentType']";
    static final String CreateHttpResponse_both =               "com.emarte.regurgitator.extensions.web.CreateHttpResponse:[com.emarte.regurgitator.core.CreateResponse:['create-http-response-1',com.emarte.regurgitator.core.ValueSource:[null,'value'],[]],200,'contentType']";
    static final String CreateHttpResponse_processors =         "com.emarte.regurgitator.extensions.web.CreateHttpResponse:[com.emarte.regurgitator.core.CreateResponse:['create-http-response-1',com.emarte.regurgitator.core.ValueSource:[null,'value'],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]],200,'contentType']";
    static final String CreateHttpResponse_multipleProcessors = "com.emarte.regurgitator.extensions.web.CreateHttpResponse:[com.emarte.regurgitator.core.CreateResponse:['create-http-response-1',com.emarte.regurgitator.core.ValueSource:[null,'value'],[com.emarte.regurgitator.test.stuff.TestValueProcessor:[], com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]],200,'contentType']";

    static final String HttpCall = "com.emarte.regurgitator.extensions.web.HttpCall:['http-call-1',com.emarte.regurgitator.extensions.web.HttpMessageProxy:[com.emarte.regurgitator.extensions.web.HttpClientWrapper:['http','something.com',1234,null,null]],[]]";
    static final String HttpCall_max = "com.emarte.regurgitator.extensions.web.HttpCall:['http-call-1',com.emarte.regurgitator.extensions.web.HttpMessageProxy:[com.emarte.regurgitator.extensions.web.HttpClientWrapper:['http','something.com',1234,'username','password']],[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2']]]";

    static final String QueryParamProcessor = "com.emarte.regurgitator.extensions.web.QueryParamProcessor:['value']";
}
