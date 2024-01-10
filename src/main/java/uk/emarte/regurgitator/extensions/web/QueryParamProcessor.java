package uk.emarte.regurgitator.extensions.web;

import uk.emarte.regurgitator.core.ValueProcessor;
import uk.emarte.regurgitator.test.Mock;

public class QueryParamProcessor extends Mock implements ValueProcessor {
    public QueryParamProcessor(String key) {
        super(key);
    }
}
