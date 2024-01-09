package uk.emarte.regurgitator.core;

import uk.emarte.regurgitator.test.Mock;

public class RemoveAtIndexProcessor extends Mock implements ValueProcessor {
    public RemoveAtIndexProcessor(ValueSource indexSource) {
        super(indexSource);
    }
}
