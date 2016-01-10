package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.MockStep;

import java.util.List;

public class Isolate extends MockStep {
	public Isolate(Object id, List<Step> steps, boolean includeSession, boolean includeParameters) {
		super(id, steps, includeSession, includeParameters);
	}
}
