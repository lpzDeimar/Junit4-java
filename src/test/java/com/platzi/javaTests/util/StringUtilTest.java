package com.platzi.javaTests.util;


import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public  void repeatStringCero() {
        assertEquals("",StringUtil.repeat("Hola",0));
    }

    @Test
    public  void repeatStringOne() {
        assertEquals("Hola",StringUtil.repeat("Hola",1));
    }
    @Test
    public  void repeatStringTree() {
        assertEquals("HolaHolaHola",StringUtil.repeat("Hola",3));
    }
    @Test(expected = IllegalArgumentException.class)
    public  void repeatStringNegative() {
        StringUtil.repeat("Hola",-1);
    }
}