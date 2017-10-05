package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.Mock;

class SubstituteProcessor extends Mock implements ValueProcessor {
    SubstituteProcessor(String token, String replacement) {
        super(token, replacement);
    }
}
