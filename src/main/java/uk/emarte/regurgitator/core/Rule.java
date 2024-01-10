/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.core;

import uk.emarte.regurgitator.test.Mock;

import java.util.List;

public class Rule extends Mock {
    public Rule(String id, List<Condition> conditions, Object stepId) {
        super(id, conditions, stepId);
    }
}