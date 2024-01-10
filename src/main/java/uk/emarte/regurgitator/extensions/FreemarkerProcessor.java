/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.extensions;

import uk.emarte.regurgitator.core.ValueProcessor;
import uk.emarte.regurgitator.test.Mock;

public class FreemarkerProcessor extends Mock implements ValueProcessor {
    public FreemarkerProcessor(String value) {
        super(value);
    }
}
