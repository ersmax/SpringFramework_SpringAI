package Section8_SpringXMLconfig.L174_GetBeanByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // create container
//        Alien obj1 = context.getBean("alien", Alien.class);
//        System.out.println(obj1.getAge());
//        obj1.code();

        Computer aDesktop = context.getBean("desktop", Computer.class);
        Computer aLaptop = context.getBean("laptop", Computer.class);
    }
}
