package com.emarte.regurgitator.core;

import static com.emarte.regurgitator.core.CacheProvider.Cache;

public class Caching {
	private static final Log log = Log.getLog(Caching.class);
	private static final CacheProvider PROVIDER = new DefaultCacheProvider();

	public static <TYPE> Cache<TYPE> getCache(Class<TYPE> clazz) {
		log.debug("Using default cache");
		return PROVIDER.getCache(clazz);
	}
}
