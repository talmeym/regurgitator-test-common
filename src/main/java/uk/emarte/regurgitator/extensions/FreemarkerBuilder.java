/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.extensions;

import uk.emarte.regurgitator.core.ValueBuilder;
import uk.emarte.regurgitator.core.ValueSource;
import uk.emarte.regurgitator.test.Mock;

public class FreemarkerBuilder extends Mock implements ValueBuilder {
    public FreemarkerBuilder(ValueSource valueSource, boolean allContexts) {
        super(valueSource, allContexts);
    }
}
