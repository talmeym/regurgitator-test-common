/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.extensions;

import uk.emarte.regurgitator.core.RegurgitatorException;
import uk.emarte.regurgitator.core.ValueProcessor;
import uk.emarte.regurgitator.test.Mock;

public class JsonSchemaValidator extends Mock implements ValueProcessor {
    public JsonSchemaValidator(String schemaPath) throws RegurgitatorException {
        super(schemaPath);
    }
}
