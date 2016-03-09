package com.emarte.regurgitator.core;

import static com.emarte.regurgitator.core.CacheProvider.Cache;
import static com.emarte.regurgitator.core.Log.getLog;

public class Caching {
	private static final Log log = getLog(Caching.class);
	private static final CacheProvider PROVIDER = new DefaultCacheProvider();

	public static <TYPE> Cache<TYPE> getCache(Class<TYPE> clazz) {
		log.debug("Using default cache");
		return PROVIDER.getCache(clazz);
	}

	public static class DefaultCacheProvider implements CacheProvider {
		@Override
		public <TYPE> Cache<TYPE> getCache(Class<TYPE> clazz) {
			return new Cache<TYPE>() {
				@Override
				public boolean contains(Object key) {
					return false;
				}

				@Override
				public TYPE get(Object key) {
					throw new UnsupportedOperationException("Caching not implemented for tests");
				}

				@Override
				public void set(Object key, Object value) {
					// do nothing
				}
			};
		}
	}
}
