/* b)
Implementing the Runnable Interface
A more flexible and recommended way to create a thread is by implementing the Runnable interface. The class that implements Runnable must define the run() method.
Key Methods:
Thread(Runnable target): Used to create a thread with a Runnable object.
start(): Starts the thread and calls the run() method.*/


class MyRunnable implements Runnable 
{
    public void run() 
	{
        System.out.println("Runnable thread is running...");
    }
}

class RunnableInterface
{
    public static void main(String[] args) 
	{
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();  // Calls the run() method of MyRunnable in a new thread
    }
}
