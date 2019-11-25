package com.questions;

import com.java8.UtilStream.JavaStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.stream.Stream;

@RunWith(JUnitPlatform.class)
public class JavaStreamTest {

    private JavaStream javaStream;

    @BeforeEach
    public void testBeforeAll() {
        javaStream = new JavaStream();
    }

    @Test
    @DisplayName("Test the number from 1 to 1000 with multiple of 5 and its sum")
    public void testIftotalValueIsMultiple() {

        long expectedValue = javaStream.multipleNumber();
        Assertions.assertEquals(expectedValue, 100500);
    }

    @Test
    @DisplayName("Convert the array of names into stream , seperated by comma")
    public void testArrayOfNamesIntoStream() {

        String[] names = new String[]{"ashik", "sagar", "kushal"};
        String expected = "ashik,sagar,kushal";
        String actual = javaStream.names(names);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Display the number from 5 to 12 inclusive")
    public void testInclusiveNumber() {

        List<Integer> expectedValue = Arrays.asList(5, 6, 7, 8, 9, 10, 11, 12);
        List<Integer> actualValue = javaStream.inclusiveNumber();
        Assertions.assertEquals(actualValue, expectedValue);
    }

    @Test
    @DisplayName("Test to check if last number excluded in the list of integers")
    public void testIfTheExclusiveNumberIsListed() {

        List<Integer> expectedValue = Arrays.asList(5, 6, 7, 8, 9, 10, 11);
        List<Integer> actualValue = javaStream.getExclusiveNumbers();
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    @DisplayName("sort the australian cities by there names")
    public void testSortByNames() {
        String[] cities = {"new south wales", "sydney", "brisbane", "melbourne"};
        List<String> expected = Arrays.asList("brisbane", "melbourne", "new south wales", "sydney");
        List<String> actual = javaStream.sortNames(cities);
        Assertions.assertEquals(actual, expected);

    }
}
