package Section8_SpringFramework.L165_ObjectCreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {

        // Create 2 objects of class Laptop and 1 of class Alien
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // create container


    }
}
