package com.java8.UtilStream;

import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureExecutorsExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        CompletableFuture.runAsync(() -> performTask("first Stage"), executorService)
                .thenRun(() -> performTask("second stage"))
                .thenRunAsync(() -> performTask("third stage"), executorService)
                .join();
        System.out.println("main exiting");
        executorService.shutdown();
    }

    private static void performTask(String stage) {
        System.out.println("--------------------");
        System.out.printf("stage: %s, time before task: %s, thread: %s%n",
                stage, LocalTime.now(), Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("stage: %s, time after task: %s. thread: %s%n",
                stage, LocalTime.now(), Thread.currentThread().getName());
    }
}
