package Section3_AdvancedJava.L082_Project_Abstraction;

import java.util.Objects;

// Create an interface called Machine with one method: String start()
interface Machine {
    String start();
}

// Create an abstract class called Appliance that:
// - Implements Machine interface
abstract class Appliance implements Machine {

    private String name;

    public Appliance(String name) {
        this.name = name;
    }

    public Appliance() {
        this("No name");
    }

    @Override
    public String start() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return Objects.equals(name, appliance.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Create a class Fan that:
// - Extends Appliance
class Fan extends Appliance {
    public Fan(String name) {
        super(name);
    }

    public Fan() {}

    @Override
    public String start() {
        return super.start() + " is running";
    }

    @Override
    public String toString() {
        return "Fan" + super.toString();
    }
}

// Create a class WashingMachine that:
// - Extends Appliance
class WashingMachine extends Appliance {
    public WashingMachine(String name) {
        super(name);
    }

    public WashingMachine() {}

    @Override
    public String start() {
        return super.start() + " is operating";
    }

    @Override
    public String toString() {
        return "WashingMachine" + super.toString();
    }
}

public class Exercise {

    public static void main(String[] args) {
        // Create objects of Fan and WashingMachine using interface references
        Machine fan = new Fan("Fan");
        Machine washer = new WashingMachine("Washing Machine");

        // Print the result of start() for each object
        System.out.println(fan.start());
        System.out.println(washer.start());
    }
}