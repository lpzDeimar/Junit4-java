package com.platzi.javaTests.util;


import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public  void testRepeat() {

        assertEquals("HolaHolaHola",StringUtil.repeat("Hola",2));

        System.out.println("result = " + StringUtil.repeat("Hola",2));
    }
}