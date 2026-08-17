package Section3_AdvancedJava.L092_DuckingExceptions;

class MyException extends RuntimeException {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }


}

class A {
    static int numbers;

    static {
        numbers = 10;
    }

    public Class show() throws ClassNotFoundException {
        return Class.forName("Ciccio"); // forName loads the class
//        try {
//            Class.forName("Demo");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Not able to find the class " + e);
//        } catch (Exception e) {
//            System.out.println("Error: " + e);
//        }
    }
}

public class Main {
    public static void main(String[] args)  {
        System.out.println("Calling here " + A.numbers);

        A obj = new A();

        try {
            System.out.println(obj.show());
        } catch (ClassNotFoundException e) {
            System.out.println("An error occured " + e);
            e.printStackTrace();
        }

    }
}
