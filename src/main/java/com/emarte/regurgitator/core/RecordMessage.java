/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.MockStep;

public class RecordMessage extends MockStep {
    public RecordMessage(Object id, String folderPath) {
        super(id, folderPath);
    }
}