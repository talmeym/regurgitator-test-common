/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.Mock;

public class Isolate extends Mock {
    public Isolate(boolean includeSession, boolean includeParameters) {
        super(includeSession, includeParameters);
    }
}
