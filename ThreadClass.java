/*1.Threads
a)Extending the Thread Class
You can create a new thread by extending the Thread class and overriding the run() method.

Key Methods:
start(): Starts the thread and invokes the run() method in a new thread.
run(): The entry point for the thread. This is where the thread’s task is defined.*/

class MyThread extends Thread 
{
    public void run() 
	{
        System.out.println("Thread is running...");
    }
}

class ThreadClass 
{
    public static void main(String[] args) 
	{
        MyThread t1 = new MyThread();
        t1.start();  // This calls the run() method in a new thread
    }
}