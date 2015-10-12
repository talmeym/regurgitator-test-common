package com.emarte.regurgitator.test;

public class Mock {
	private String clazz;
	private Object[] args;

	public Mock(Object... args) {
		this.clazz = getClass().getName();
		this.args = args;
	}

	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer(clazz + ":[");

		if (args != null) {
			for (int i = 0; i < args.length; i++) {
				stringBuffer.append(nullSafeToString(args[i]));

				if (i < args.length - 1) {
					stringBuffer.append(",");
				}
			}
		}

		stringBuffer.append("]");
		return stringBuffer.toString();
	}

	private String nullSafeToString(Object string) {
		if(string instanceof String) {
			string = "'" + string + "'";
		}

		return string != null ? string.toString() : "null";
	}
}
