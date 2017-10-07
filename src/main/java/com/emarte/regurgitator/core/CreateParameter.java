/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.MockStep;

class CreateParameter extends MockStep {
    CreateParameter(Object id, ParameterPrototype prototype, String context, ValueSource valueSource, ValueProcessor processor) {
        super(id, prototype, context, valueSource, processor);
    }
}
