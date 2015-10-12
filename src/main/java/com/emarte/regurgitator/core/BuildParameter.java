package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.MockStep;

class BuildParameter extends MockStep {
	BuildParameter(Object id, ParameterPrototype prototype, String context, ValueBuilder builder, ValueProcessor processor) {
		super(id, prototype, context, builder, processor);
	}
}
