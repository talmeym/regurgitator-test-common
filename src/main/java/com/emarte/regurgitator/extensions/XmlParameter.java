package com.emarte.regurgitator.extensions;

import com.emarte.regurgitator.core.*;
import com.emarte.regurgitator.test.MockStep;

public class XmlParameter extends MockStep {

	public XmlParameter(Object id, ParameterPrototype prototype, String context, ContextLocation location, XpathProcessor xpathProcessor, ValueProcessor processor) {
		super(id, prototype, context, location, xpathProcessor, processor);
	}
}
