package uk.emarte.regurgitator.extensions.web;

import uk.emarte.regurgitator.core.ValueSource;
import uk.emarte.regurgitator.test.MockStep;

public class CreateFileResponse extends MockStep {
    public CreateFileResponse(Object id, ValueSource valueSource, String pathPrefix) {
        super(id, valueSource, pathPrefix);
    }
}
