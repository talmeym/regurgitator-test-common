package com.emarte.regurgitator.extensions;

import com.emarte.regurgitator.core.*;
import com.emarte.regurgitator.test.MockStep;

public class JsonParameter extends MockStep {

	public JsonParameter(Object id, ParameterPrototype prototype, String context, ValueSource valueSource, JsonPathProcessor jsonPathProcessor, ValueProcessor processor) {
		super(id, prototype, context, valueSource, jsonPathProcessor, processor);
	}
}
