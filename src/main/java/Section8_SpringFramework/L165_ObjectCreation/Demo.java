package Section8_SpringFramework.L165_ObjectCreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {

        // Create 2 objects of class Laptop and 1 of class Alien
        // Create 2 because in the cfg file we have 2 objects of class Alien
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // create container

        // Two different reference variables that reference same object "alien"
        Alien obj1 = (Alien) context.getBean("alien");
        Alien obj2 = (Alien) context.getBean("alien");
        obj1.code();
        obj2.code();

    }
}
