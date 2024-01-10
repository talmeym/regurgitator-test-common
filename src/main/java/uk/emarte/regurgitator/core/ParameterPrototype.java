/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.core;

import uk.emarte.regurgitator.test.Mock;

public class ParameterPrototype extends Mock {
    public ParameterPrototype(String name, ParameterType type, ConflictPolicy conflictPolicy) {
        super(name, type, conflictPolicy);
    }
}
