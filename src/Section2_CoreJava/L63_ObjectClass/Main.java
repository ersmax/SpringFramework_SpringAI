package Section2_CoreJava.L63_ObjectClass;

import java.util.Objects;

class Laptop {
    String brand;
    int price;

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(brand, laptop.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.brand = "Lenovo Yoga";
        obj.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.brand = "Lenovo Yoga";
        obj2.price = 1000;

        System.out.println(obj.equals(obj2));   // deep copy?
        System.out.println(obj == obj2);        // compare if they're the same object

        System.out.println(obj.toString());
    }
}
