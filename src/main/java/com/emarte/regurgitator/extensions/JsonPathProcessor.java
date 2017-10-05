package com.emarte.regurgitator.extensions;

import com.emarte.regurgitator.core.ValueProcessor;
import com.emarte.regurgitator.test.Mock;

public class JsonPathProcessor extends Mock implements ValueProcessor {
    public JsonPathProcessor(String path) {
        super(path);
    }
}
