package Section2_CoreJava.L47_StaticVariable;

class Mobile {
    static String brand;
    int price;
    String name;

    public void show() {
        System.out.println(brand + " " + name + ", " + price );
    }
}

public class Main {

    public static void main(String[] args) {
        Mobile.brand = "XYZ";
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();

        obj1.name = "G20"; obj1.price = 100;
        obj2.name = "G21"; obj2.price = 200;
        obj1.show();
        obj2.show();
    }
}
