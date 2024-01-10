/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

class WebExtensionsLoaderTestExpectations {
    static final String CreateFileResponse =          "uk.emarte.regurgitator.extensions.web.CreateFileResponse:['create-file-response-1',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['request-metadata:path-info'],null],null]";
    static final String CreateFileResponse_prefixed = "uk.emarte.regurgitator.extensions.web.CreateFileResponse:['create-file-response-1',uk.emarte.regurgitator.core.ValueSource:[uk.emarte.regurgitator.core.ContextLocation:['request-metadata:path-info'],null],'/assets']";

    static final String CreateHttpResponse_value =                  "uk.emarte.regurgitator.extensions.web.CreateHttpResponse:[uk.emarte.regurgitator.core.CreateResponse:['create-http-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[]],-1,null]";
    static final String CreateHttpResponse_statusCode =             "uk.emarte.regurgitator.extensions.web.CreateHttpResponse:[uk.emarte.regurgitator.core.CreateResponse:['create-http-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[]],200,null]";
    static final String CreateHttpResponse_contentType =            "uk.emarte.regurgitator.extensions.web.CreateHttpResponse:[uk.emarte.regurgitator.core.CreateResponse:['create-http-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[]],-1,'contentType']";
    static final String CreateHttpResponse_both =                   "uk.emarte.regurgitator.extensions.web.CreateHttpResponse:[uk.emarte.regurgitator.core.CreateResponse:['create-http-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[]],200,'contentType']";
    static final String CreateHttpResponse_processors =             "uk.emarte.regurgitator.extensions.web.CreateHttpResponse:[uk.emarte.regurgitator.core.CreateResponse:['create-http-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]],200,'contentType']";
    static final String CreateHttpResponse_multipleProcessors =     "uk.emarte.regurgitator.extensions.web.CreateHttpResponse:[uk.emarte.regurgitator.core.CreateResponse:['create-http-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]],200,'contentType']";
    static final String CreateHttpResponse_multipleProcessorsFlat = "uk.emarte.regurgitator.extensions.web.CreateHttpResponse:[uk.emarte.regurgitator.core.CreateResponse:['create-http-response-1',uk.emarte.regurgitator.core.ValueSource:[null,'value'],[uk.emarte.regurgitator.test.stuff.TestValueProcessor:[], uk.emarte.regurgitator.test.stuff.TestValueProcessor:[]]],200,'contentType']";

    static final String HttpCall =     "uk.emarte.regurgitator.extensions.web.HttpCall:['http-call-1',uk.emarte.regurgitator.extensions.web.HttpMessageProxy:[uk.emarte.regurgitator.extensions.web.HttpClientWrapper:['http','something.com',1234,null,null]],[]]";
    static final String HttpCall_max = "uk.emarte.regurgitator.extensions.web.HttpCall:['http-call-1',uk.emarte.regurgitator.extensions.web.HttpMessageProxy:[uk.emarte.regurgitator.extensions.web.HttpClientWrapper:['http','something.com',1234,'username','password']],[uk.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], uk.emarte.regurgitator.test.stuff.TestStep:['test-step-2']]]";

    static final String QueryParamProcessor = "uk.emarte.regurgitator.extensions.web.QueryParamProcessor:['value']";
}
