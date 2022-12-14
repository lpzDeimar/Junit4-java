package com.platzi.javaTests.util;

public class DataUtil {
    public static boolean isLeapYear(int year){
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

}
