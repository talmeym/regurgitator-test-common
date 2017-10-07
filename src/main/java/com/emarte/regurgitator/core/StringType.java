/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.core;

import com.emarte.regurgitator.test.Mock;

public class StringType extends Mock implements ParameterType {
    public static String stringify(Object object) {
        return object.toString();
    }
}
