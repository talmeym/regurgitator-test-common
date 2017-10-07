/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.core;

public enum ConflictPolicy {
    REPLACE,
    LEAVE;

    @Override
    public String toString() {
        return ConflictPolicy.class.getName() + ":" + name();
    }
}
