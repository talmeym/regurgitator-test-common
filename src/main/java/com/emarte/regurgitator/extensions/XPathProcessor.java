package com.emarte.regurgitator.extensions;

import com.emarte.regurgitator.core.ValueProcessor;
import com.emarte.regurgitator.test.Mock;

import java.util.Map;

public class XPathProcessor extends Mock implements ValueProcessor {
	public XPathProcessor(String xpath, Map<String, String> namespaces) {
		super(xpath, namespaces);
	}
}
