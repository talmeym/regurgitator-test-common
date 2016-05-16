package com.emarte.regurgitator.extensions.web;

import com.emarte.regurgitator.core.ValueSource;
import com.emarte.regurgitator.test.*;

public class FileResponse extends MockStep {
	public FileResponse(Object id, ValueSource valueSource, String pathPrefix) {
		super(id, valueSource, pathPrefix);
	}
}
