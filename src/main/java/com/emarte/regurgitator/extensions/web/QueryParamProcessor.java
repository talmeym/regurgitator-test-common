package com.emarte.regurgitator.extensions.web;

import com.emarte.regurgitator.core.ValueProcessor;
import com.emarte.regurgitator.test.Mock;

public class QueryParamProcessor extends Mock implements ValueProcessor {
	public QueryParamProcessor(String key) {
		super(key);
	}
}
