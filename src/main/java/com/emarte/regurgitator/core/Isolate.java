package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.MockStep;

public class Isolate extends MockStep {
	public Isolate(Object id, Step step, boolean includeSession, boolean includeParameters) {
		super(id, step, includeSession, includeParameters);
	}
}
