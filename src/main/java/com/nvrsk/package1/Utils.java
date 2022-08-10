package com.nvrsk.package1;

public final class Utils {

    // private constructor is not indexed by Jacoco
    private Utils() {
    }

    public static <T extends Number> double calcSum (T a, T b){
        return a.doubleValue() + b.doubleValue();
    }

    public static String returnOne(){
        return "one";
    }

    public static String returnTwo(){
        return "two";
    }

}
