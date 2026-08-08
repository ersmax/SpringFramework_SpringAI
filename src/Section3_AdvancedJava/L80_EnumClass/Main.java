package Section3_AdvancedJava.L80_EnumClass;

enum Status {
    Running, Failed, Pending, Success;
}

enum Laptop {
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    // cannot have a public const. because all instances are the above constants
    private Laptop() {
        price = 800;
        System.out.println("In default constructor: " + this.name());
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("In parametrised constructor: " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Main {

    public static void main(String[] args) {
        Status[] allStatus = Status.values();
        Status s = Status.Success;
        System.out.println(s.getClass().getSuperclass());

        Laptop.Macbook.setPrice(3000);
        System.out.println("---");

        for (Laptop laptop : Laptop.values())
            System.out.println(laptop + ", $" + laptop.getPrice());
    }
}
