Synchronous
 
• Definition: Operations are performed sequentially. Each task must complete before the next one starts.
• Blocking: The caller waits for the operation to finish.
• Use Cases: Simple tasks where operations need to be completed in a specific order.
• Example: Reading a file line by line and processing each line before moving to the next.
 
Asynchronous
 
• Definition: Operations can be performed concurrently. Tasks can start before others finish.
• Non-blocking: The caller can continue executing other tasks while waiting for the operation to complete.
• Use Cases: Tasks that involve waiting, such as network requests or I/O operations, where responsiveness is important.
• Example: Fetching data from a server while allowing the user to interact with the UI.
 
Key Differences
 
Aspect	Synchronous	Asynchronous
Execution	Sequential	Concurrent
Blocking	Yes	No
Efficiency	Less efficient for I/O operations	More efficient for I/O operations
Complexity	Simpler to implement	More complex due to concurrency
 
Practical Implications
 
• Synchronous: Easier to reason about due to straightforward execution flow, but can lead to inefficiencies and unresponsiveness in applications.
• Asynchronous: Improves performance and responsiveness, especially in applications with heavy I/O tasks, but can introduce complexity in code management and debugging.
Here's a comprehensive guide on Synchronous and Asynchronous programming with examples:
 
1. Synchronous Programming
 
public class SynchronousExample {
    public static void main(String[] args) {
        System.out.println("Starting main...");
        
        // Synchronous method calls - execute sequentially
        cookFood();
        eatFood();
        washDishes();
        
        System.out.println("Main completed");
    }
    
    static void cookFood() {
        System.out.println("Cooking food...");
        sleep(2000);  // Simulating work
        System.out.println("Food is ready");
    }
    
    static void eatFood() {
        System.out.println("Eating food...");
        sleep(1000);
        System.out.println("Finished eating");
    }
    
    static void washDishes() {
        System.out.println("Washing dishes...");
        sleep(1000);
        System.out.println("Dishes are clean");
    }
    
    static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
 
2. Asynchronous Programming
 
Using Threads
 
public class AsyncThreadExample {
    public static void main(String[] args) {
        System.out.println("Starting main...");
        
        // Creating threads for async execution
        Thread cookingThread = new Thread(() -> {
            System.out.println("Cooking food...");
            sleep(2000);
            System.out.println("Food is ready");
        });
        
        Thread washingThread = new Thread(() -> {
            System.out.println("Washing dishes...");
            sleep(1000);
            System.out.println("Dishes are clean");
        });
        
        // Start threads
        cookingThread.start();
        washingThread.start();
        
        // Wait for threads to complete
        try {
            cookingThread.join();
            washingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Main completed");
    }
}
 
Using CompletableFuture (Modern Approach)
 

import java.util.concurrent.CompletableFuture;
public class AsyncModernExample {
    public static void main(String[] args) {
        System.out.println("Starting main...");
        
        CompletableFuture<String> cookingFuture = CompletableFuture
            .supplyAsync(() -> {
                System.out.println("Cooking food...");
                sleep(2000);
                return "Food is ready";
            });
            
        CompletableFuture<String> washingFuture = CompletableFuture
            .supplyAsync(() -> {
                System.out.println("Washing dishes...");
                sleep(1000);
                return "Dishes are clean";
            });
            
        // Combine results
        CompletableFuture.allOf(cookingFuture, washingFuture)
            .thenRun(() -> System.out.println("All tasks completed"));
            
        // Keep main thread alive
        sleep(3000);
    }
}


From <https://highlight-chat-frontend.vercel.app/> 


