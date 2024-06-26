/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.core;

import uk.emarte.regurgitator.test.MockStep;

import java.util.List;

public class GenerateParameter extends MockStep {
    public GenerateParameter(Object id, ParameterPrototype prototype, String context, ValueGenerator generator, List<ValueProcessor> processors, boolean optional) {
        super(id, prototype, context, generator, processors, optional);
    }
}
