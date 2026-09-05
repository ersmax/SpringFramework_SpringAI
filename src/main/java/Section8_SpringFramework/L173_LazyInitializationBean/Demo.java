package Section8_SpringFramework.L173_LazyInitializationBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // create container
        Alien obj1 = (Alien) context.getBean("alien");
        System.out.println(obj1.getAge());
        obj1.code();

        Desktop aDesktop = (Desktop) context.getBean("desktop");
    }
}
