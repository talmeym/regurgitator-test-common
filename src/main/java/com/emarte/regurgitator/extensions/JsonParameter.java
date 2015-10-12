package com.emarte.regurgitator.extensions;

import com.emarte.regurgitator.core.*;
import com.emarte.regurgitator.test.MockStep;

public class JsonParameter extends MockStep {

	public JsonParameter(Object id, ParameterPrototype prototype, String context, ContextLocation location, JsonPathProcessor jsonPathProcessor, ValueProcessor processor) {
		super(id, prototype, context, location, jsonPathProcessor, processor);
	}
}
