package com.emarte.regurgitator.core;

interface CacheProvider {
    <TYPE> Cache<TYPE> getCache(Class<TYPE> clazz);

    interface Cache<TYPE> {
        boolean contains(Object key);
        TYPE get(Object key);
        void set(Object key, TYPE type);
    }
}
