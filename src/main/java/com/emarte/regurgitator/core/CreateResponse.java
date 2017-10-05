package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.MockStep;

public class CreateResponse extends MockStep {
    CreateResponse(String id, ValueSource valueSource, ValueProcessor processor) {
        super(id, valueSource, processor);
    }
}
