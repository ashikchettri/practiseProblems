package com.java8.UtilStream;

public class ExtendThreadMultiThreading extends Thread {

    public void run() {

        System.out.println("The thread no " + Thread.currentThread().getId() + " is running");
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            ExtendThreadMultiThreading extendThreadMultiThreading = new ExtendThreadMultiThreading();
            extendThreadMultiThreading.start();
        }


    }

}