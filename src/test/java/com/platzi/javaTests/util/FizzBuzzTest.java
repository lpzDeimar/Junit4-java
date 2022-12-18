package com.platzi.javaTests.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @Before
    public void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void return_Fizz_if_result_is_multiple_by_3() {
        assertEquals("Fizz",fizzBuzz.fizzBuzz(6));
    }

    @Test
    public void return_Buzz_if_result_is_multiple_by_5() {
        assertEquals("Buzz",fizzBuzz.fizzBuzz(10));
    }

    @Test
    public void return_FizzBuzz_if_result_is_multiple_by_5_and_3() {
        assertEquals("FizzBuzz",fizzBuzz.fizzBuzz(30));
    }

    @Test
    public void retun_number_if_is_not_multiple_by_5_or_3() {
        int number = 2;
        assertEquals(String.valueOf(number),fizzBuzz.fizzBuzz(number));
    }
}