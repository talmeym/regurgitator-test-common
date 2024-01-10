/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.core;

import uk.emarte.regurgitator.test.Mock;

public class Condition extends Mock {
    public Condition(Object id, ContextLocation location, String conditionValue, boolean expectation, ConditionBehaviour behaviour) {
        super(id, location, conditionValue, expectation, behaviour);
    }
}
