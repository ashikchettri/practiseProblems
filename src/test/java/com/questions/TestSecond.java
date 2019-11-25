package com.questions;

import com.java8.utility.StreamPartSecond;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TestSecond {

    private StreamPartSecond streamPartSecond;


    @BeforeEach
    public void testBeforeAll(){
        streamPartSecond = new StreamPartSecond();
    }

    @Test
    public void testMultipleOfFive(){
        int check = streamPartSecond.multipleOfFive();
        Assertions.assertEquals(check, 100500);
    }

    @Test
    public void testGetNames(){
        String[] namesList = new String[]{"ashik","sagar","kushal"};
        String expectedNames = "ashik,sagar,kushal";
         String result = streamPartSecond.names(namesList);
         Assertions.assertEquals(expectedNames, result);

    }

    @Test
    public void testGetInclusiveNumber(){
        List<Integer> num = streamPartSecond.getNumbers(5,10);
        List<Integer> expectedNum = Arrays.asList(5,6,7,8,9,10);
        Assertions.assertEquals(num, expectedNum);
    }

    @Test
    public void testGetExclusive(){
        List<Integer> result = streamPartSecond.getExclusive(5,10);
        List<Integer> expectedResult = Arrays.asList(5,6,7,8,9);
        Assertions.assertEquals(result,expectedResult);
    }

    @Test
    public void testReverseCities(){
        List<String> data = Arrays.asList("sydney","melbourne","butwal");
        List<String> expected = streamPartSecond.capitalCity(data);
        List<String> actual = Arrays.asList("yendys","enruoblem","lawtub");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testShort(){
        List<String> data = Arrays.asList("butwal","kathmandu","asham");
        List<String> expected = Arrays.asList("asham","butwal","kathmandu");
        List<String> actual = streamPartSecond.cities(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConertWord(){
        List<String> expected = Arrays.asList("p","o","r","s","c","h","e");
        List<String> actual = streamPartSecond.convertWord("porsche");
        Assertions.assertEquals(expected, actual);
    }
}
