package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.MockStep;

import java.util.List;

class Sequence extends MockStep {
	Sequence(String id, List<Step> steps, Isolate isolate) {
		super(id, steps, isolate);
	}
}
