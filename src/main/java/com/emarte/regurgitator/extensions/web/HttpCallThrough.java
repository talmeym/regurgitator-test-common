package com.emarte.regurgitator.extensions.web;

import com.emarte.regurgitator.core.Step;
import com.emarte.regurgitator.test.MockStep;

public class HttpCallThrough extends MockStep {
	public HttpCallThrough(Object id, HttpMessageProxy httpMessageProxy, Step responseProcessing) {
		super(id, httpMessageProxy, responseProcessing);
	}
}
