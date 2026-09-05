package Section8_SpringFramework.L171_Autowiring;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer comp;

    public Alien() {
        System.out.println("Alien object created");
    }

    public Alien(int age) {
        System.out.println("Parameterized Alien object created");
        this.age = age;
    }

    @ConstructorProperties({"ageConstructor", "compConstructor"})
    public Alien(int ageConstructor, Computer compConstructor) {
        System.out.println("Two argument Parameterized Alien object created");
        this.age = ageConstructor;
        this.comp = compConstructor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code() {
        System.out.println("Coding");
        comp.compile();
    }
}
