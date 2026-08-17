package Section2_CoreJava.L048_StaticMethods;

class Mobile {
    private static String brand;
    private String name;

    public static void showStatic(Mobile aMobile) {
        System.out.println(brand + ", " + aMobile.name);
    }

    public static void setBrand(String brand) {
        Mobile.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile aMobile = new Mobile();
        Mobile.setBrand("Samsung");

        aMobile.setName("A Series");
        Mobile.showStatic(aMobile);
    }
}
