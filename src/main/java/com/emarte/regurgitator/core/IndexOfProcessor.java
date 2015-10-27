package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.Mock;

public class IndexOfProcessor extends Mock implements ValueProcessor {
	public IndexOfProcessor(ContextLocation source, String value, boolean backwards) {
		super(source, value, backwards);
	}
}
