/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.MockStep;

class GenerateParameter extends MockStep {
    GenerateParameter(Object id, ParameterPrototype prototype, String context, ValueGenerator generator, ValueProcessor processor) {
        super(id, prototype, context, generator, processor);
    }
}
