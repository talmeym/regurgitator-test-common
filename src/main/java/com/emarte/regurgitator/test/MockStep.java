/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.Step;

public class MockStep extends Mock implements Step {
    private final Object id;

    public MockStep(Object... args) {
        super(args);
        this.id = args[0];
    }

    @Override
    public final Object getId() {
        return id;
    }
}
