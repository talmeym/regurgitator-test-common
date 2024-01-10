/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.core;

import uk.emarte.regurgitator.test.Mock;

public class Isolate extends Mock {
    public Isolate(boolean includeSession, boolean includeParameters) {
        super(includeSession, includeParameters);
    }
}
