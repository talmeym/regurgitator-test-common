package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.MockStep;

class CreateResponse extends MockStep {
	CreateResponse(String id, ContextLocation location, String staticValue, ValueProcessor processor) {
		super(id, location, staticValue, processor);
	}
}
