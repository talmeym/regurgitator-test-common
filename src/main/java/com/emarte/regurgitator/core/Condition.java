package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.Mock;

public class Condition extends Mock {
	Condition(Object id, ContextLocation location, String conditionValue, boolean expectation, ConditionBehaviour behaviour) {
		super(id, location, conditionValue, expectation, behaviour);
	}
}
