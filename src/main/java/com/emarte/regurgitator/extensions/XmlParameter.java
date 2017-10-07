/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.extensions;

import com.emarte.regurgitator.core.*;
import com.emarte.regurgitator.test.MockStep;

public class XmlParameter extends MockStep {
    public XmlParameter(Object id, ParameterPrototype prototype, String context, ValueSource valueSource, XpathProcessor xpathProcessor, ValueProcessor processor) {
        super(id, prototype, context, valueSource, xpathProcessor, processor);
    }
}
