/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

public class Mock {
    private final String clazz;
    private final Object[] args;

    public Mock(Object... args) {
        this.clazz = getClass().getName();
        this.args = args;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(clazz + ":[");

        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                stringBuilder.append(nullSafeToString(args[i]));

                if (i < args.length - 1) {
                    stringBuilder.append(",");
                }
            }
        }

        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private String nullSafeToString(Object object) {
        if(object instanceof String) {
            object = "'" + object + "'";
        }

        return object != null ? object.toString() : "null";
    }
}
