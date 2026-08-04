package Section2_CoreJava.L49_StaticBlock;

class Mobile {
    static String brand;

    int price;
    String name;

    static {
        System.out.println("In static block 1");
    }

    static {
        brand = "Samsung";
        System.out.println("In static block 2");
    }

    public Mobile() {
        System.out.println("In constructor");
        price = 10;
        name = "No name";
    }
}

public class  Main {

    /**
     * Load the class
     * @param args
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
//        Mobile obj1 = new Mobile();
//        System.out.println("One is done");
//        Mobile obj2 = new Mobile();

        Class.forName("Section2_CoreJava.L49_StaticBlock.Mobile");
    }
}
