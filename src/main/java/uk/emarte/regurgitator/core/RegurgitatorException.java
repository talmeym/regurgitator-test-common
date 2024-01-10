/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.core;

public class RegurgitatorException extends Exception {

    public RegurgitatorException(String message) {
        super(message);
    }

    public RegurgitatorException(String message, Exception e) {
        super(message, e);
    }
}
