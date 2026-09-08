package Section9_JavaBasedConfig.L182_AutowireFieldConstructorSetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import java.beans.ConstructorProperties;

@Component
public class Alien {

    private int age;

    private Computer comp;

    public Alien() {
        System.out.println("Alien object created");
    }

    public Alien(int ageConstructor) {
        System.out.println("Parameterized Alien object created");
        this.age = ageConstructor;
    }

    @Autowired
    public Alien(Computer compConstructor) {
        System.out.println("Parameterized (ref) Alien object created");
        this.comp = compConstructor;
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
