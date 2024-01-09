package uk.emarte.regurgitator.extensions.web;

import uk.emarte.regurgitator.core.Step;
import uk.emarte.regurgitator.test.MockStep;

import java.util.List;

public class HttpCall extends MockStep {
    public HttpCall(Object id, HttpMessageProxy httpMessageProxy, List<Step> steps) {
        super(id, httpMessageProxy, steps);
    }
}
