/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test.stuff;

import uk.emarte.regurgitator.core.AbstractEntityPack;

public class TestEntityPack extends AbstractEntityPack {
    public TestEntityPack() {
        addRulesBehaviour("test-rules-behaviour", new TestRulesBehaviour());
        addConditionBehaviour("test-condition-behaviour", new TestConditionBehaviour());
        addValueBuilder("test-value-builder", new TestValueBuilder());
        addValueGenerator("test-value-generator", new TestValueGenerator());
        addValueProcessor("test-value-processor", new TestValueProcessor());
    }
}
