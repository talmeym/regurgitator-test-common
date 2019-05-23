/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.Mock;

import java.util.List;

public class ListProcessor extends Mock implements ValueProcessor {
    public ListProcessor(List<ValueProcessor> valueProcessors) {
        super(valueProcessors);
    }
}
