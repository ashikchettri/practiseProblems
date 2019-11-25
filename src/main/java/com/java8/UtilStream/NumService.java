package com.java8.UtilStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumService {


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

    public List<Integer> divisibleNumbers() {

        return IntStream.range(1, 100)
                .boxed()
                .filter(x -> x % 3 == 0 && x % 5 == 0)
                .map(x -> x * x)
                .filter(x -> x % 100 != 25)
                .filter(x -> x != (30 * 30))
                .limit(5)
                .collect(Collectors.toList());
    }


    // 225, 900, 2025, 3600, 5625

}
