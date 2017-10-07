/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.MockStep;

class IdentifySession extends MockStep {
    IdentifySession(Object id, ValueSource valueSource) {
        super(id, valueSource);
    }
}
