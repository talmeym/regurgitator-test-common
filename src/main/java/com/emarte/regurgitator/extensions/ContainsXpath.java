/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.extensions;

import com.emarte.regurgitator.core.ConditionBehaviour;
import com.emarte.regurgitator.test.Mock;

import java.util.Map;

public class ContainsXpath extends Mock implements ConditionBehaviour {
    public ContainsXpath(Map<String, String> namespaceUris) {
        super(namespaceUris);
    }
}
