/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.MockStep;

import java.util.List;

public class CreateParameter extends MockStep {
    public CreateParameter(Object id, ParameterPrototype prototype, String context, ValueSource valueSource, List<ValueProcessor> processors) {
        super(id, prototype, context, valueSource, processors);
    }
}
