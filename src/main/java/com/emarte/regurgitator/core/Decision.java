package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.MockStep;

import java.util.List;

class Decision extends MockStep {
    private Object id;

    Decision(String id, List<Step> steps, List<Rule> rules, RulesBehaviour behaviour, Object defaultStepId) {
        super(id, steps, rules, behaviour, defaultStepId);
        this.id = id;
    }
}
