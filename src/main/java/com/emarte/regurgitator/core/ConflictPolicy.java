package com.emarte.regurgitator.core;

public enum ConflictPolicy {
	REPLACE,
	LEAVE;

	@Override
	public String toString() {
		return ConflictPolicy.class.getName() + ":" + name();
	}
}
