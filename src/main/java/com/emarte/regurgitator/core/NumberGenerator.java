package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.Mock;

public class NumberGenerator extends Mock implements ValueGenerator {
	public NumberGenerator() {
	}

	public NumberGenerator(int max) {
		super(max);
	}
}
