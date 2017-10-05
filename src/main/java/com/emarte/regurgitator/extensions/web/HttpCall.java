package com.emarte.regurgitator.extensions.web;

import com.emarte.regurgitator.core.Step;
import com.emarte.regurgitator.test.MockStep;

import java.util.List;

public class HttpCall extends MockStep {
    public HttpCall(Object id, HttpMessageProxy httpMessageProxy, List<Step> steps) {
        super(id, httpMessageProxy, steps);
    }
}
