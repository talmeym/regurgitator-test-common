package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.Mock;

public class ContextLocation extends Mock {
    public static final String PARAMETER_CONTEXT = "parameters";

    static final String SEPARATOR = ":";

    private final String context;
    private final String name;

    public ContextLocation(String location) {
		super(location);
		boolean contextSpecified = location.contains(SEPARATOR);
		context = contextSpecified ? location.substring(0, location.indexOf(SEPARATOR)) : PARAMETER_CONTEXT;
		name = contextSpecified ? location.substring(location.indexOf(SEPARATOR) + 1) : location;
    }

    public String getContext() {
        return context;
    }

    public String getName() {
        return name;
    }
}
