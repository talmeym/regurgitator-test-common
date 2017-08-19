package com.emarte.regurgitator.extensions;

import com.emarte.regurgitator.core.ValueProcessor;
import com.emarte.regurgitator.test.Mock;

import java.util.Map;

public class XpathProcessor extends Mock implements ValueProcessor {
	public XpathProcessor(String xpath, Map<String, String> namespaces) {
		super(xpath, namespaces);
	}
}
