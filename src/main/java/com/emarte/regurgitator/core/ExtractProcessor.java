/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.Mock;

class ExtractProcessor extends Mock implements ValueProcessor {
    ExtractProcessor(String format, int index) {
        super(format, index);
    }
}
