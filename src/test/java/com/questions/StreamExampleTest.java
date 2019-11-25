package com.questions;

import com.java8.utility.StreamExercise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnitPlatform.class)
@DisplayName("Test method for Stream Example")
public class StreamExampleTest {

    private StreamExercise streamExercise;

    @BeforeEach
    public void testBeforeAll() {
        streamExercise = new StreamExercise();
    }


    @DisplayName("Test numbers divisible by 5 and 3 with square value")
    @Test
    public void testNumberDivisibleBy5and3() {

        List<Integer> expectedValue = Arrays.asList(3600, 8100);
        List<Integer> actualValue = streamExercise.getDivisibleNumber();
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    @DisplayName("Check the size of the list of integers")
    public void testTotalSizeOfTheListOfInteger() {

        int actual = streamExercise.getDivisibleNumber().size();
        Assertions.assertEquals(2, actual);
    }

    @Test
    @DisplayName("Test if the 30 is removed from the list of integers")
    public void testIf30IsRemovedFromList() {

        int numberToExclude = 30;

        long actual = streamExercise.getDivisibleNumber().stream().filter(x -> x == numberToExclude * numberToExclude).count();
        Assertions.assertEquals(0, actual);
    }

    @Test
    @DisplayName("Test if the numbers with last digit 25 are removed from the list of integers")
    public void testIfNumberwith25AreRemovedOrNot() {

        long actualValue = streamExercise.getDivisibleNumber().stream()
                                            .filter(x -> x % 100 == 25).count();
        Assertions.assertEquals(0, actualValue);

    }
}
