package Section3_AdvancedJava.L100_ProjectMultithreading;

// Define PrinterTask class that implements Runnable
class PrinterTask implements Runnable {
    @Override
    public  void run() {
        String nameThread = Thread.currentThread().getName();
        for (int idx = 0; idx < 20; idx++) {
            System.out.println(nameThread + ": Running task " + (idx + 1));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Exercise {
    public static void main(String[] args) throws InterruptedException {
        // Create a single PrinterTask object
        // Runnable printer = new PrinterTask();

        // Create a single PrinterTask object
        Runnable printer = () -> {
            String nameThread = Thread.currentThread().getName();
            for (int idx = 0; idx < 20; idx++) {
                System.out.println(nameThread + ": Running task " + (idx + 1));
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        // Create two threads using the same task
        // Name them "Worker-1" and "Worker-2"
        Thread t1 = new Thread(printer, "Worker-1");
        Thread t2 = new Thread(printer, "Worker-2");

        // Start both threads
        t1.start();
        t2.start();

        // Use join() to wait for both threads to finish
        t1.join();
        t2.join();
    }
}
