package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.Mock;

public class IndexOfProcessor extends Mock implements ValueProcessor {
    public IndexOfProcessor(ValueSource valueSource, boolean backwards) {
        super(valueSource, backwards);
    }
}
