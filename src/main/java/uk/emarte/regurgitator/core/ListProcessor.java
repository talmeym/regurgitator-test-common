/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.core;

import uk.emarte.regurgitator.test.Mock;

import java.util.List;

public class ListProcessor extends Mock implements ValueProcessor {
    public ListProcessor(List<ValueProcessor> valueProcessors) {
        super(valueProcessors);
    }
}
