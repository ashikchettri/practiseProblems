package com.questions;

import com.java8.UtilStream.PractiseStream;
import org.assertj.core.internal.Integers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnitPlatform.class)
public class PractiseStreamTest {

    private PractiseStream practiseStream;

    @BeforeEach
    public void beforeAll() {
        practiseStream = new PractiseStream();
    }

    @Test
    public void testIfttheSumIsCorrect() {

        int actualValue = practiseStream.sumOfNumbers();
        Assertions.assertEquals(actualValue, 100500);
    }


//    Convert and array of your best friends names into a stream. apply lowecase(withoud using var), then join them into 1 string separated by ','.

    @Test
    public void testIfNamesInOneString() {
        String[] names = new String[]{"ashik", "sagar", "kushal"};
        String expected = "ashik,sagar,kushal";
        String actual = practiseStream.friendsName(names);
        Assertions.assertEquals(expected, actual);
    }

//    Print all numbers between 5 and 15 (inclusive).

    @Test
    @DisplayName("test if the number from 5 to 10 are listed")
    public void testInclusive() {
        List<Integer> num = Arrays.asList(5, 6, 7, 8, 9, 10);
        List<Integer> expected = practiseStream.printInclusive();
        Assertions.assertEquals(num, expected);
    }

    @Test
    @DisplayName("test if the 5 is exclusive and 10 is inclusive")
    public void test5exclusive10inclusive() {

        List<Integer> expected = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> actual = practiseStream.fiveExclusive();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("5 inclusive and 10 exclusive")
    public void testIf5isIncluviseAnd10Exclusive() {

        List<Integer> expected = Arrays.asList(5, 6, 7, 8, 9);
        List<Integer> actual = practiseStream.fiveInclusiveAndTenExclusive();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("test to sort the cities by capital names")
    public void testIftheCapitalCitiesAreSorted() {

        List<String> names = Arrays.asList("sydney", "melbourne", "brisbane");
        List<String> actual = Arrays.asList("brisbane", "melbourne", "sydney");
        List<String> expected = practiseStream.cities(names);
        Assertions.assertEquals(actual, expected);
    }

//    Take a list of Australian capital cities and reverse everyone of them.

    @Test
    @DisplayName("reverse the australian capital cities")
    public void testIfCitiesAreReversed() {

        List<String> cities = Arrays.asList("sydney", "bris", "mel");
        List<String> expected = Arrays.asList("yendys", "sirb", "lem");
        List<String> actual = practiseStream.australianCapital(cities);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("convert string word into list of words")
    public void testIfThewordIsConvertedToList() {

        String word = "PORSCHE";
        List<String> expected = practiseStream.porsche(word);
        List<String> actual = Arrays.asList("P", "O", "R", "S", "C", "H", "E");
        Assertions.assertEquals(expected, actual);

    }


}
