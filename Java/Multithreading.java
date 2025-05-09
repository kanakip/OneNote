Multithreading in Java is a feature that allows multiple threads to execute concurrently within a single program. This capability is essential for maximizing CPU utilization and improving application performance. 

https://www.geeksforgeeks.org/multithreading-in-java/

Thread Class vs Runnable Interface 
	• If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance. But, if we implement the Runnable interface, our class can still extend other base classes.
	• We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt methods like yield(), interrupt() etc. that are not available in Runnable interface.
	• Using runnable will give you an object that can be shared amongst multiple threads.

From <https://www.geeksforgeeks.org/multithreading-in-java/> 

Lifecycle and States of a Thread in Java
Last Updated : 14 Jan, 2025
A thread in Java can exist in any one of the following states at any given time. A thread lies only in one of the shown states at any instant:
	• New State
	• Runnable State
	• Blocked State
	• Waiting State
	• Timed Waiting State
	• Terminated State
The diagram below represents various states of a thread at any instant.

Life Cycle of a Thread 
There are multiple states of the thread in a lifecycle as mentioned below:
	• New Thread: When a new thread is created, it is in the new state. The thread has not yet started to run when the thread is in this state. When a thread lies in the new state, its code is yet to be run and hasn’t started to execute.
	• Runnable State: A thread that is ready to run is moved to a runnable state. In this state, a thread might actually be running or it might be ready to run at any instant of time. It is the responsibility of the thread scheduler to give the thread, time to run. A multi-threaded program allocates a fixed amount of time to each individual thread. Each and every thread get a small amount of time to run. After running for a while, a thread pauses and gives up the CPU so that other threads can run.
	• Blocked: The thread will be in blocked state when it is trying to acquire a lock but currently the lock is acquired by the other thread. The thread will move from the blocked state to runnable state when it acquires the lock.
	• Waiting state: The thread will be in waiting state when it calls wait() method or join() method. It will move to the runnable state when other thread will notify or that thread will be terminated.
	• Timed Waiting: A thread lies in a timed waiting state when it calls a method with a time-out parameter. A thread lies in this state until the timeout is completed or until a notification is received. For example, when a thread calls sleep or a conditional wait, it is moved to a timed waiting state.
	• Terminated State: A thread terminates because of either of the following reasons: 
• Because it exits normally. This happens when the code of the thread has been entirely executed by the program.
• Because there occurred some unusual erroneous event, like a segmentation fault or an unhandled exception.

Threads can be created by using two mechanisms : 
	• Extending the Thread class 
	• Implementing the Runnable Interface

Thread creation by extending the Thread class
	
	// Java code for thread creation by extending
	// the Thread class
	class MultithreadingDemo extends Thread {
	    public void run()
	    {
	        try {
	            // Displaying the thread that is running
	            System.out.println(
	                "Thread " + Thread.currentThread().getId()
	                + " is running");
	        }
	        catch (Exception e) {
	            // Throwing an exception
	            System.out.println("Exception is caught");
	        }
	    }
	}
	// Main Class
	public class Multithread {
	    public static void main(String[] args)
	    {
	        int n = 8; // Number of threads
	        for (int i = 0; i < n; i++) {
	            MultithreadingDemo object
	                = new MultithreadingDemo();
	            object.start();
	        }
	    }
	}
	
	o/p- 
	Thread 15 is running
Thread 14 is running
Thread 16 is running
Thread 12 is running
Thread 11 is running
Thread 13 is running
Thread 18 is running
Thread 17 is running
	
	
Thread creation by implementing the Runnable Interface


// Java code for thread creation by implementing
// the Runnable Interface
class MultithreadingDemo implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
// Main Class
class Multithread {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object
                = new Thread(new MultithreadingDemo());
            object.start();
        }
    }
}

o/p-
Thread 13 is running
Thread 11 is running
Thread 12 is running
Thread 15 is running
Thread 14 is running
Thread 18 is running
Thread 17 is running
Thread 16 is running


• Benefits:
	• Improved application responsiveness.
	• Efficient resource utilization.
	• Better CPU performance by executing multiple tasks simultaneously 
• Creating Threads: In Java, threads can be created by:
	• Extending the Thread class.
	• Implementing the Runnable interface 
• Synchronization: To prevent thread interference when accessing shared resources, Java provides synchronization mechanisms to ensure that only one thread can access a resource at a time

Multiprocessing vs. Multithreading in Java
Feature	Multiprocessing	Multithreading
Definition	Involves multiple processes running on different processors or cores.	Involves multiple threads running within a single process.
Memory Space	Each process has its own memory space.	Threads share the same memory space and resources.
Isolation	High isolation between tasks; processes do not share memory.	Lower isolation; threads share memory, making communication easier.
Suitability	Suitable for applications requiring high isolation between tasks.	Suitable for applications needing concurrent tasks within the same application.
Performance	Can leverage multiple processors or cores effectively.	Can leverage multi-core processors but within a single process.

