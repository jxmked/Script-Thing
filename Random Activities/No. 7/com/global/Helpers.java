package com.global;

public class Helpers {
    public Helpers() {

    }

    /**
     * Uppercase first char of a string
     * 
     * @param str
     * @return string
     */
    public static String ucfirst(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
