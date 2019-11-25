package com.java8.UtilStream;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFutureExample {


    public Future<String> calculateAsync() throws InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            completableFuture.complete("hello");
            return null;
        });

        return completableFuture;
    }


    public Future<String> calculateAsyncWithCancellation() throws InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            completableFuture.cancel(false);
            return null;
        });
        return completableFuture;
    }

    public static void main(String[] args) {
        CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> {
            System.out.println("running in thread: " + Thread.currentThread().getName());
        });

        cf.join();
        System.out.println("main exiting,thread " + Thread.currentThread().getName());

    }

}


