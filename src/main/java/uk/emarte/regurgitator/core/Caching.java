/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.core;

import static uk.emarte.regurgitator.core.CacheProvider.Cache;
import static uk.emarte.regurgitator.core.Log.getLog;

public class Caching {
    private static final Log log = getLog(Caching.class);
    private static final CacheProvider PROVIDER = new DefaultCacheProvider();

    public static <TYPE> Cache<TYPE> getCache(Class<TYPE> clazz) {
        return PROVIDER.getCache(clazz);
    }

    private static class DefaultCacheProvider implements CacheProvider {
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
