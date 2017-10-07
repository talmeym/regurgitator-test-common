/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.Mock;

class SubstituteProcessor extends Mock implements ValueProcessor {
    SubstituteProcessor(String token, String replacement) {
        super(token, replacement);
    }
}
