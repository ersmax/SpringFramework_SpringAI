package Section8_SpringFramework.L167_SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // create container

        // Two different reference variables that reference same object "alien"
        Alien obj1 = (Alien) context.getBean("alien");
        Alien obj2 = (Alien) context.getBean("alien");
        System.out.println(obj1.getAge());
    }
}
