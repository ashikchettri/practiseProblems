package com.java8.UtilStream;

public class ImplementRunnableInterfaceMultithreading implements Runnable {

    @Override
    public void run() {

        try {

            System.out.println("The Thread running is " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Exception is handled");
        }

    }

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            Thread obj = new Thread(new ImplementRunnableInterfaceMultithreading());
            obj.start();
        }
    }
}
