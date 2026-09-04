package Section8_SpringFramework.L164_SpringXmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // create container
        Alien obj = (Alien) context.getBean("alien");

        Alien alien = new Alien();
        alien.code();
    }
}
