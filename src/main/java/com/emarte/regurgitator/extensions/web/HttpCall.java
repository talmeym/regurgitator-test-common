package com.emarte.regurgitator.extensions.web;

import com.emarte.regurgitator.core.Step;
import com.emarte.regurgitator.test.MockStep;

public class HttpCall extends MockStep {
	public HttpCall(Object id, HttpMessageProxy httpMessageProxy, Step responseProcessing) {
		super(id, httpMessageProxy, responseProcessing);
	}
}
