package Section3_AdvancedJava.L99_RaceConditions;

class Counter {
    private int count;

    // synchronized: thread safety (a method or block of code is executed by only one thread at a time)
    // When a method is thread safe, it ensures that no other thread can access or modify the
    // shared resource while it's used by one thread.
    // Java makes sure that increment()  is called only by 1 thread at a time
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable obj1 = () -> {
            for (int idx = 0; idx < 10000; idx++) {
                counter.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int idx = 0; idx < 10000; idx++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        // tell main thread to wait children threads to come back and join
        t1.join();
        t2.join();

        System.out.println(counter.getCount());
    }
}
