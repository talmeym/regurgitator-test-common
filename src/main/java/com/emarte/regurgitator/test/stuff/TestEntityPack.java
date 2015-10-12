package com.emarte.regurgitator.test.stuff;

import com.emarte.regurgitator.core.AbstractEntityPack;

public class TestEntityPack extends AbstractEntityPack {

	public TestEntityPack() {
		addRulesBehaviour("test-rules-behaviour", new TestRulesBehaviour());
		addConditionBehaviour("test-condition-behaviour", new TestConditionBehaviour());
		addValueBuilder("test-value-builder", new TestValueBuilder());
		addValueGenerator("test-value-generator", new TestValueGenerator());
		addValueProcessor("test-value-processor", new TestValueProcessor());
	}
}
