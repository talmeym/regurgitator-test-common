/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.MockStep;

import java.util.List;

public class CreateResponse extends MockStep {
    CreateResponse(String id, ValueSource valueSource, List<ValueProcessor> processors) {
        super(id, valueSource, processors);
    }
}
