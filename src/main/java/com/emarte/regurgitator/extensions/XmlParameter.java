/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.extensions;

import com.emarte.regurgitator.core.ParameterPrototype;
import com.emarte.regurgitator.core.ValueProcessor;
import com.emarte.regurgitator.core.ValueSource;
import com.emarte.regurgitator.test.MockStep;

import java.util.List;

public class XmlParameter extends MockStep {
    public XmlParameter(Object id, ParameterPrototype prototype, String context, ValueSource valueSource, XpathProcessor xpathProcessor, List<ValueProcessor> processors) {
        super(id, prototype, context, valueSource, xpathProcessor, processors);
    }
}
