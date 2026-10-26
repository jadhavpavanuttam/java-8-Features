package completable;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        CompletableFuture<String> order =
                CompletableFuture.supplyAsync(() -> "Order: ORD-101");

        CompletableFuture<String> delivery =
                CompletableFuture.supplyAsync(() -> "Delivery: In transit");

        CompletableFuture<String> payment =
                CompletableFuture.supplyAsync(() -> "Payment: Successful");

        CompletableFuture<Void> all =
                CompletableFuture.allOf(order, delivery, payment);

        all.thenRun(() -> {
            System.out.println(order.join());
            System.out.println(delivery.join());
            System.out.println(payment.join());
        }).join();
        CompletableFuture<Integer> task =
                CompletableFuture.supplyAsync(() -> 10 / 0)
                        .exceptionally(error -> -1);

        System.out.println(task.join());

    }
}
/*
Methods :-

supplyAsync() -->	Runs a task that returns a value
runAsync()	--> Runs a task without a return value
thenApply()	--> Transforms a result
thenCompose()	--> Chains another asynchronous operation
thenCombine()	--> Combines two independent results
allOf()	--> Waits for multiple futures to complete
anyOf()	--> Completes when any supplied future completes
exceptionally()-->	Supplies a fallback after failure
handle()	--> Processes success or failure
join()	--> Waits for a result and throws an unchecked completion exception on fai
 */