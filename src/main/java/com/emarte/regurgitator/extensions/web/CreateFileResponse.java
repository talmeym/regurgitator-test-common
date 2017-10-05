package com.emarte.regurgitator.extensions.web;

import com.emarte.regurgitator.core.ValueSource;
import com.emarte.regurgitator.test.*;

public class CreateFileResponse extends MockStep {
    public CreateFileResponse(Object id, ValueSource valueSource, String pathPrefix) {
        super(id, valueSource, pathPrefix);
    }
}
