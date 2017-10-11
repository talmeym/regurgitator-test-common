/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.extensions;

import com.emarte.regurgitator.core.ValueBuilder;
import com.emarte.regurgitator.core.ValueSource;
import com.emarte.regurgitator.test.Mock;

public class FreemarkerBuilder extends Mock implements ValueBuilder {
    public FreemarkerBuilder(ValueSource valueSource, boolean allContexts) {
        super(valueSource, allContexts);
    }
}
