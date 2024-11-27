/*b) Synchronized Blocks:
You can also use synchronized blocks to synchronize only a part of the method, 
improving performance by limiting synchronization scope.*/

class Counter {
    private int count = 0;

    // Method to increment the count using a synchronized block
    public void increment() {
        synchronized (this) { // synchronized block to lock this object
            count++;
        }
    }

    // Getter to return the count value
    public int getCount() {
        return count;
    }
}

class  SynchronizedBlock {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();  // Create a shared Counter object

        // Create first thread
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();  // Increment the counter
            }
        });

        // Create second thread
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();  // Increment the counter
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Print the final value of the count
        System.out.println("Final count: " + counter.getCount());
    }
}
