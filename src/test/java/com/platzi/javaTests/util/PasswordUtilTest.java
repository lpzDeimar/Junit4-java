package com.platzi.javaTests.util;

import org.junit.Test;

import static com.platzi.javaTests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {
    @Test
    public void weakWhenHasLeesThan8Letters(){
        assertEquals(WEAK,PasswordUtil.assessPassword("12ds!"));
    }
    @Test
    public void weakWhenHasOnlyLetters(){
        assertEquals(WEAK,PasswordUtil.assessPassword("asdfgwqeads"));
    }
    @Test
    public void weakWhenHasLettersAndNumbers(){
        assertEquals(MEDIUM,PasswordUtil.assessPassword("abcdef1234"));
    }
    @Test
    public void weakWhenHasLettersAndNumbersAndSymbols(){
        assertEquals(STRONG,PasswordUtil.assessPassword("abcdef1234!*"));
    }

}