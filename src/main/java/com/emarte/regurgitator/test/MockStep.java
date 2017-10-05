package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.Step;

public class MockStep extends Mock implements Step {
    private Object id;

    public MockStep(Object... args) {
        super(args);
        this.id = args[0];
    }

    @Override
    public final Object getId() {
        return id;
    }
}
