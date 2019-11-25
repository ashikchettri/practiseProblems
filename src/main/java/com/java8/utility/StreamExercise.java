package com.java8.utility;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExercise {



    /*
  Find the numbers between 1 to 100 which are divisible by 5 and 3
  and square them and return the first 5 numbers.
  Also measure how long it took to run your procedure in nanoseconds.
   */

    //1. return the list of numbers from the above function
//2. why is the above method static. can you solve without making that static.
//4. also improve the code so that 30 is ignored even if it is divisible by both 5 and 3


//3. write a test instead of printing and validate that there are exactly 3 numbers.


//5. update the code further so that squared values ending with 25 are also not selected.


//write the test for 4.
//write the test for 5.


    public List<Integer> getDivisibleNumber() {

        return IntStream.range(1, 100)
                .boxed()
                .filter(x -> x % 5 == 0 && x % 3 == 0)
                .map(x -> x * x)
                .filter(x -> x != 900)
                .filter(x-> x % 100 != 25)
                .limit(3)
                .collect(Collectors.toList());
    }

}
