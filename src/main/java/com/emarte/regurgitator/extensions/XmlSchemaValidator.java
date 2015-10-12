package com.emarte.regurgitator.extensions;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.test.Mock;

public class XmlSchemaValidator extends Mock {
	XmlSchemaValidator(String schemaPath) throws RegurgitatorException {
		super(schemaPath);
	}
}
