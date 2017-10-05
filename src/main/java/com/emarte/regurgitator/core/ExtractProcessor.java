package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.Mock;

class ExtractProcessor extends Mock implements ValueProcessor {
    ExtractProcessor(String format, int index) {
        super(format, index);
    }
}
