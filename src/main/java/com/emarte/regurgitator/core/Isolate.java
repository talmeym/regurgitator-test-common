package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.MockStep;

public class Isolate extends MockStep {
	public Isolate(Object id, Step step, boolean includeSession) {
		super(id, step, includeSession);
	}
}
