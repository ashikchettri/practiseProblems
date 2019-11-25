package com.questions;

import com.java8.UtilStream.StreamPractise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnitPlatform.class)
public class StreamPractiseTest {

    public StreamPractise streamPractise;

    @BeforeEach
    public void beforeAll() {
        streamPractise = new StreamPractise();
    }

    @DisplayName("Check if the number from 1 to 1000 is divisible by 5 and get the sum")
    @Test
    public void testGetTheTotalSum() {
        int expectedValue = 100500;
        int actualValue = streamPractise.sumOfFive();
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @DisplayName("Take a array of names and change them into steam in lowercase and then sepereate by delimiter")
    @Test
    public void testIfTheNameIsChangedToStream() {
        String[] names = {"ashik", "sagar", "kushal"};
        String expectedValue = "ashik,sagar,kushal";
        String actualValue = streamPractise.getBestFriendNames(names);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @DisplayName("Print number from 5 to 15 inclusive")
    @Test
    public void testIfTheNumberAreInclusive() {
        List<Integer> expectedValue = Arrays.asList(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        List<Integer> actualValue = streamPractise.inclusiveNumber();
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @DisplayName("Get the 5 exclusive and 10 inclusive")
    @Test
    public void testIf5isExclusiveAnd10isInclusive() {
        List<Integer> expectedValue = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> actualValue = streamPractise.exclusiveNumber();
        Assertions.assertEquals(expectedValue, actualValue);
    }


}
