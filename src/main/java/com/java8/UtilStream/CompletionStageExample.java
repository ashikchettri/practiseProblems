package com.java8.UtilStream;

import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class CompletionStageExample {

    public static void main(String[] args) {

        CompletionStage<Void> cf = CompletableFuture.runAsync(() -> performTask("first stage"));
        cf = cf.thenRun(() -> performTask("Second Stage"));
        cf = cf.thenRunAsync(() -> performTask("third stage"));
        ((CompletableFuture) cf).join(); //wait until the task is completed
        System.out.println("main exiting");

    }

    private static void performTask(String stage) {
        System.out.println("-------------------------");
        System.out.printf("stage: %s, time before task: %s, thread: %s%n",
                stage, LocalTime.now(), Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("stage: %s, time after task: %s, thread: %s%n",
                stage, LocalTime.now(), Thread.currentThread().getName());
    }
}
