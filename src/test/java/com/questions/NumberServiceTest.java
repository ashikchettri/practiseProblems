package com.questions;

import com.java8.utility.NumberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;


@RunWith(JUnitPlatform.class)
public class NumberServiceTest {


    private NumberService numberService;

    @BeforeEach
    public void testBeforeAll() {
        numberService = new NumberService();
    }


    @Test
    public void testTotalNumbers() {

        int num = numberService.getNum().size();
        Assertions.assertEquals(2, num);
    }


    //[225, 2025, 3600]
//        3


    @Test
    public void testExpectedNumbers() {
        List<Integer> expected = Arrays.asList(3600, 8100);
        List<Integer> actual = numberService.getNum();
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("30 was not included.")
    @Test
    public void testThatNumber30WasExcluded() {
        List<Integer> actual = numberService.getNum();
        int numberToExclude = 30;
        long onesWith900 = actual.stream().filter(x -> x == numberToExclude * numberToExclude).count();
        Assertions.assertEquals(0, onesWith900);
    }

    @DisplayName("squares ending with 25 are not included")
    @Test
    public void testThatSquaresEndingWith25AreNotInTheResult() {
        List<Integer> actual = numberService.getNum();
        long onesEndingWith25 = actual.stream().filter(x -> x % 100 == 25).count();
        Assertions.assertEquals(0,onesEndingWith25);
    }

}


