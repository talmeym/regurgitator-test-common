package com.emarte.regurgitator.core;

public class Log {
    private Class clazz;

    private Log(Class clazz) {
        this.clazz = clazz;
    }

    public void debug(String message, Object... objs) {
        System.out.println(String.format(buildLogEntry(message), objs));
    }

    private String buildLogEntry(String message) {
        return "DEBUG [" + clazz.getName() + "] " + message;
    }

    public static Log getLog(Class clazz){
        return new Log(clazz);
    }
}
