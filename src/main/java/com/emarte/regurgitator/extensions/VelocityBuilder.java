/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.extensions;

import com.emarte.regurgitator.core.ValueBuilder;
import com.emarte.regurgitator.core.ValueSource;
import com.emarte.regurgitator.test.Mock;

public class VelocityBuilder extends Mock implements ValueBuilder {
    public VelocityBuilder(ValueSource valueSource, boolean allContexts) {
        super(valueSource, allContexts);
    }
}
