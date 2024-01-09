/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.core;

import uk.emarte.regurgitator.test.Mock;

public class SetAtIndexProcessor extends Mock implements ValueProcessor {
    public SetAtIndexProcessor(ValueSource indexSource, ValueSource valueSource) {
        super(indexSource, valueSource);
    }
}
