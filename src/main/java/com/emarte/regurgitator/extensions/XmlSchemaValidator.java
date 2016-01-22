package com.emarte.regurgitator.extensions;

import com.emarte.regurgitator.core.*;
import com.emarte.regurgitator.test.Mock;

public class XmlSchemaValidator extends Mock implements ValueProcessor {
	XmlSchemaValidator(String schemaPath) throws RegurgitatorException {
		super(schemaPath);
	}
}
