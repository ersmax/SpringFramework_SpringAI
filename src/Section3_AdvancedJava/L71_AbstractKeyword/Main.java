package Section3_AdvancedJava.L71_AbstractKeyword;

abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("play music");
    }
}

abstract class WagonR extends Car {
    @Override
    public void drive() {
        System.out.println("Driving");
    }
}

// concrete class
class UpdateWagonR extends WagonR {

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car obj = new UpdateWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
