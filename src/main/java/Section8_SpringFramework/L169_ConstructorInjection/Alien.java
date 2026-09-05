package Section8_SpringFramework.L169_ConstructorInjection;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Laptop lap;

    public Alien() {
        System.out.println("Alien object created");
    }

    public Alien(int age) {
        System.out.println("Parameterized Alien object created");
        this.age = age;
    }

    @ConstructorProperties({"ageConstructor", "lapConstructor"})
    public Alien(int ageConstructor, Laptop lapConstructor) {
        System.out.println("Two argument Parameterized Alien object created");
        this.age = ageConstructor;
        this.lap = lapConstructor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code() {
        System.out.println("Coding");
        lap.compile();
    }
}
