package com.questions;


import com.java8.utility.StreamOfIntegers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class QuestionsTest {

    private StreamOfIntegers streamInt;

    @BeforeEach
    public void testBeforeAll(){
        streamInt = new StreamOfIntegers();
    }

    @Test
    public void testGetSum(){
        int total = streamInt.getSum();
        Assertions.assertEquals(100500, total);
    }


    @Test
    public void testGetAllNumber(){
        List<Integer>  num = streamInt.getNumberBetweenFiveandFifteen(5,15);
        List<Integer> requiredNum = Arrays.asList(5,6,7,8,9,10,11,12,13,14,15);
        Assertions.assertEquals(num, requiredNum);
    }

    @Test
    public void testFiveExclusive(){
        List<Integer> five = streamInt.getFiveExclusive();
        List<Integer> expectedResult = Arrays.asList(6,7,8,9,10,11,12,13,14,15);
        Assertions.assertEquals(five, expectedResult);
    }

    @Test
    public void testget15Exclusive(){
        List<Integer> exclusive = streamInt.get15Exclusive(5,15);
        List<Integer> expectedResult = Arrays.asList(5,6,7,8,9,10,11,12,13,14);
        Assertions.assertEquals(exclusive, expectedResult);
    }

    @Test
    public void testGetNames(){

        String[] names = new String[]{"Ashik","Kushal"};
        String expectedResult = "ashik,kushal";
         String result = streamInt.getNames(names);
         Assertions.assertNotNull(expectedResult, result);
         Assertions.assertEquals(expectedResult, result);
    }

    @Test
        public void testStates(){
        Map<String,String> statesCities = new HashMap<>();
        statesCities.put("Australia Capital Territory", "Canberra");
        statesCities.put("New south wales", "sydney");
        statesCities.put("victoria", "melbourne");
        List<String> result= streamInt.states(statesCities);
        List<String> expectedResult = Arrays.asList("Australia Capital Territory","New south wales","victoria");
        Assertions.assertEquals(result, expectedResult);
    }


    @Test
    public void testCities(){
        Map<String,String> statesCiti = new HashMap<>();
        statesCiti.put("Australia Capital Territory", "Canberra");
        statesCiti.put("New south wales", "sydney");
        statesCiti.put("victoria", "melbourne");
        List<String> result= streamInt.cities(statesCiti);
        List<String> expectedResult = Arrays.asList("Canberra","melbourne","sydney");
        Assertions.assertEquals(result, expectedResult);
    }


    @Test
    public void testAbbr(){
        Map<String,String> check = new HashMap<>();
        check.put("Australia Capital Territory", "Canberra");
        check.put("New South Wales", "sydney");
        check.put("victoria", "melbourne");

        Map<String, String> actualResult = streamInt.abbrev(check);
        Map<String,String> expectedResult = new HashMap<>();
        expectedResult.put("ACT", "Canberra");
        expectedResult.put("NSW", "sydney");
        expectedResult.put("VIC", "melbourne");

        Assertions.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testReverse(){
        List<String> reverseList = Arrays.asList("ashik","sagar","kushal");
        List<String> expected= streamInt.reverse(reverseList);
        List<String> actual = Arrays.asList("kihsa","ragas","lahsuk");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testShortCities(){
        List<String> citiesNames = Arrays.asList("Kathmandu", "Butwal", "Chitwan","Biratnagar");
        List<String> expectedResult = streamInt.capitalCities(citiesNames);
        List<String> actualResult = Arrays.asList("Biratnagar","Butwal","Chitwan","Kathmandu");
        Assertions.assertEquals(expectedResult,actualResult);
    }


    @Test
    public void testWordToList(){
        List<String> actual = streamInt.listString("PORSCHE");
        List<String> expectedResult = Arrays.asList("P","O","R","S","C","H","E");
        Assertions.assertEquals(actual, expectedResult);
    }






}
