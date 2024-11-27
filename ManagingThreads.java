/*2.Managing Threads
Java provides various methods in the Thread class to manage threads effectively:

a) Thread Lifecycle Management Methods:
start(): Starts a new thread by calling the run() method.
sleep(long millis): Pauses the thread execution for a specified time (milliseconds).
join(): Allows one thread to wait for the completion of another.
interrupt(): Interrupts a sleeping, waiting, or blocked thread.
isAlive(): Checks if the thread is still running. */

class MyRunnable implements Runnable 
{
    public void run() 
	{
        for (int i = 0; i < 5; i++) 
		{
            System.out.println(Thread.currentThread().getName() + " is running.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ManagingThreads 
{
    public static void main(String[] args) throws InterruptedException 
	{
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();
        
        t1.join();  // Wait for t1 to finish
        t2.join();  // Wait for t2 to finish
        System.out.println("Both threads have finished.");
    }
}
