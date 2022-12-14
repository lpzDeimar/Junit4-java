package com.platzi.javaTests.doscounts;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PriceCalculatorTest {

    PriceCalculator calculator;

    @Before
    public void setup(){
        calculator = new PriceCalculator();
    }

    @Test
    public void total_zero_where_there_are_price() {
        assertThat(calculator.getTotal(), is(0.0));
    }

    @Test
    public void total_is_sum_of_prices() {
        calculator.addPrice(10.2);
        calculator.addPrice(15.3);
        assertThat(calculator.getTotal(), is(25.5));
    }

    @Test
    public void aply_dicount_to_prices() {
        calculator.addPrice(150.0);
        calculator.addPrice(50.0);
        calculator.setDiscount(75);
        assertThat(calculator.getTotal(), is(150.0));
    }
}