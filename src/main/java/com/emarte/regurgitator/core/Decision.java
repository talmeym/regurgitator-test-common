/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.MockStep;

import java.util.List;

public class Decision extends MockStep {
    public Decision(String id, List<Step> steps, List<Rule> rules, RulesBehaviour behaviour, Object defaultStepId) {
        super(id, steps, rules, behaviour, defaultStepId);
    }
}
