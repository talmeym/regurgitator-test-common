package com.emarte.regurgitator.core;

public class Caching {
	private static Log log = Log.getLog(Caching.class);

	private static final CacheProvider PROVIDER = new DefaultCacheProvider();

	public static <TYPE> Cache<TYPE> getCache(Class<TYPE> clazz) {
		log.debug("Using default cache");
		return PROVIDER.getCache(clazz);
	}
}
