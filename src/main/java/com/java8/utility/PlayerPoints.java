package com.java8.utility;

import java.util.ArrayList;
import java.util.List;

public class PlayerPoints {

    public static class Player {

        private final String name;
        private final long points;

        public Player(String name, Long points) {
            this.name = name;
            this.points = points;
        }

        public String toString() {
            return name + ":" + points;
        }
    }

    public static long getPoints(final String name) {
        return getPoints(name);
    }


    public static void main(String[] args) {

        //find the highest player


//        Player highestPlayer = names.stream().map(name -> new Player(name, getPoints(name)))
//                                                .reduce(new Player("", 0.0 ),
//                                                        (s1, s2) -> (s1.points > s2.points) ? s1 : s2);
//    }
//
//    //using parallel array with stream - stream() and parallelStream()
//
//    double bestGpa = students
//                        .parallelStream()
//                        .filter(s -> (s.gradutationYear == THIS_YEAR))
//                        .mapToDouble(s -> s.gpa)
//                        .max().getAsDouble();
//


    }
}
