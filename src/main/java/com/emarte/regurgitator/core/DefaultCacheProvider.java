package com.emarte.regurgitator.core;

public class DefaultCacheProvider implements CacheProvider {
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
