package com.questions;

import com.java8.UtilStream.NumService;
import com.java8.utility.NumberService;
import org.assertj.core.internal.Integers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@RunWith(JUnitPlatform.class)
public class NumServiceTest {

    private NumService numService;

    @BeforeEach
    public void testBeforeAll() {
        numService = new NumService();
    }

    @Test
    @DisplayName("test to check if the number is divisible by 3 and 5")
    public void testIfTheNumberIsDivisibleBy5and3() {

        List<Integer> actual = Arrays.asList(3600, 8100);
        List<Integer> expectedNum = numService.divisibleNumbers();
        Assertions.assertEquals(actual, expectedNum);
    }

    @Test
    public void testIfLast25IsExclusded() {

        List<Integer> num = numService.divisibleNumbers();
        long actual = num.stream().filter(x -> x % 100 == 25).count();
        Assertions.assertEquals(0, actual);
    }

    @Test
    @DisplayName("check the total number of integers in the list")
    public void testTotalNumberOfResult() {
        long actual = numService.divisibleNumbers().stream().count();
        Assertions.assertEquals(2, actual);
    }

    @Test
    @DisplayName("Check if 30 is ignored although divisible by 5")
    public void testCheckIf30IsIgnored() {

        List<Integer> actual = numService.divisibleNumbers();
        long checking = actual.stream().filter(x -> x == 30).count();
        Assertions.assertEquals(0, checking);

    }
}
