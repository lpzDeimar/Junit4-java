package com.platzi.javaTests.util;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DataUtilTest {
    @Test
    public void return_true_when_year_is_divisible_by_400() {
//        CoreMatchers
        assertThat(DataUtil.isLeapYear(1600), is(true));
        assertThat(DataUtil.isLeapYear(2000), is(true));
        assertThat(DataUtil.isLeapYear(2400), is(true));
    }

    @Test
    public void return_false_when_year_is_divisible_by_100_but_not_by_400() {
        assertThat(DataUtil.isLeapYear(1700), is(false));
        assertThat(DataUtil.isLeapYear(1800), is(false));
        assertThat(DataUtil.isLeapYear(1900), is(false));
    }

    @Test
    public void return_true_where_yesar_is_divisible_by_4_but_not_by_100() {
        assertThat(DataUtil.isLeapYear(1996), is(true));
        assertThat(DataUtil.isLeapYear(2000), is(true));
        assertThat(DataUtil.isLeapYear(2400), is(true));
    }

    @Test
    public void return_false_when_year_is_not_divisible_by_4() {
        assertThat(DataUtil.isLeapYear(2017), is(false));
        assertThat(DataUtil.isLeapYear(2014), is(false));
        assertThat(DataUtil.isLeapYear(2019), is(false));
    }
}