/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.extensions;

import uk.emarte.regurgitator.core.ConditionBehaviour;
import uk.emarte.regurgitator.test.Mock;

import java.util.Map;

public class ContainsXpathBehaviour extends Mock implements ConditionBehaviour {
    public ContainsXpathBehaviour(Map<String, String> namespaceUris) {
        super(namespaceUris);
    }
}
