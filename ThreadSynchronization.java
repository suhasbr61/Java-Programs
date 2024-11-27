/* 3)Thread Synchronization
When multiple threads access shared resources, synchronization is required to prevent data inconsistency. The synchronized keyword ensures that only one thread can access a resource at a time.

a) Synchronized Methods: 
Mark a method as synchronized to ensure only one thread can execute it at a time. */

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println("Final count: " + counter.getCount());
    }
}
