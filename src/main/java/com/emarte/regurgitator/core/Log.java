/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.core;

public class Log {
    private final Class clazz;

    private Log(Class clazz) {
        this.clazz = clazz;
    }

    public void debug(String message, Object... objs) {
        String logEntry = "DEBUG [" + clazz.getName() + "] " + message;
        System.out.println(String.format(logEntry.replace("{}", "%s"), objs));
    }

    public static Log getLog(Class clazz){
        return new Log(clazz);
    }
}
