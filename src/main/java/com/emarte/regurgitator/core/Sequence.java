/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.MockStep;

import java.util.List;

public class Sequence extends MockStep {
    public Sequence(String id, List<Step> steps, Isolate isolate) {
        super(id, steps, isolate);
    }
}
