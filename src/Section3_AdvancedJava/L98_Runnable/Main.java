package Section3_AdvancedJava.L98_Runnable;

class Parent {
}

class A extends Parent implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from Normal Class");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Runnable obj1 = new A();

        /* Create anonymous inner class */
        Runnable obj2 = new Runnable() {
            @Override
            public void run() {
                for (int idx = 0; idx < 10; idx++) {
                    System.out.println("Hello from Anonymous class");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        /* Use a lambda expression since Runnable is a functional interface */
        Runnable obj3 = () -> {
            for (int idx = 0; idx < 10; idx++) {
                System.out.println("Hello from Lambda");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };


        Thread t1 = new Thread(obj1);   // Creating thread t1 using instances of Runnable implementations
        Thread t2 = new Thread(obj2);   // "" t2
        Thread t3 = new Thread(obj3);   // "" t3

        t1.start(); // Start thread t1
        t2.start(); // "" t2
        t3.start(); // "" t3
    }
}
