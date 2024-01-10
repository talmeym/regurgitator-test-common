package uk.emarte.regurgitator.extensions.web;

import uk.emarte.regurgitator.core.CreateResponse;
import uk.emarte.regurgitator.test.MockStep;

public class CreateHttpResponse extends MockStep {
    public CreateHttpResponse(CreateResponse response, long statusCode, String contentType) {
        super(response, statusCode, contentType);
    }
}
