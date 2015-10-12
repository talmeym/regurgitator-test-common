package com.emarte.regurgitator.core;

public class Log {
	private Class clazz;

	private Log(Class clazz) {
		this.clazz = clazz;
	}

	public void debug(String message) {
		System.out.println("DEBUG [" + clazz.getName() + "]: " + message);
	}

	public static Log getLog(Class clazz){
		return new Log(clazz);
	}
}
