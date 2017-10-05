package com.emarte.regurgitator.extensions.web;

import com.emarte.regurgitator.core.CreateResponse;
import com.emarte.regurgitator.test.MockStep;

public class CreateHttpResponse extends MockStep {
    public CreateHttpResponse(CreateResponse response, long statusCode, String contentType) {
        super(response, statusCode, contentType);
    }
}
