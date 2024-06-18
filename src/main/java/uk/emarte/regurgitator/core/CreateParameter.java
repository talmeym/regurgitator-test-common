/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.core;

import uk.emarte.regurgitator.test.MockStep;

import java.util.List;

public class CreateParameter extends MockStep {
    public CreateParameter(Object id, ParameterPrototype prototype, String context, ValueSource valueSource, List<ValueProcessor> processors, boolean optional) {
        super(id, prototype, context, valueSource, processors, optional);
    }
}
