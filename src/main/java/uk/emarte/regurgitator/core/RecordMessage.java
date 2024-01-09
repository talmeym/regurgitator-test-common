/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.core;

import uk.emarte.regurgitator.test.MockStep;

public class RecordMessage extends MockStep {
    public RecordMessage(Object id, String folderPath) {
        super(id, folderPath);
    }
}