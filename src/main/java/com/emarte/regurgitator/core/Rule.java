package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.Mock;

import java.util.List;

public class Rule extends Mock {
	Rule(String id, List<Condition> conditions, Object stepId) {
		super(id, conditions, stepId);
	}
}