/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.extensions;

import com.emarte.regurgitator.core.ValueProcessor;
import com.emarte.regurgitator.test.Mock;

public class FreemarkerProcessor extends Mock implements ValueProcessor {
    public FreemarkerProcessor(String value) {
        super(value);
    }
}
