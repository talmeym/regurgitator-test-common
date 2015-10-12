package com.emarte.regurgitator.core;

public class Caching {
	public static Cache getCache(Class clazz) {
		return new Cache() {
			@Override
			public boolean hasValue(Object key) {
				return false;
			}

			@Override
			public Object getValue(Object key) {
				throw new UnsupportedOperationException("Caching not implemented for tests");
			}

			@Override
			public Object setValue(Object key, Object value) {
				// do nothing
				return null;
			}
		};
	}

	public static interface Cache {
		public boolean hasValue(Object key);

		public Object getValue(Object key);

		public Object setValue(Object key, Object value);
	}

}
