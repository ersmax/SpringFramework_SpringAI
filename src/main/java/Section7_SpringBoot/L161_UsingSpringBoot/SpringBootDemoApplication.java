package Section7_SpringBoot.L161_UsingSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

        Alien newAlien = new Alien();
        newAlien.code();

        Alien newAl = context.getBean(Alien.class);
        newAl.code();

        Alien newAl2 = context.getBean(Alien.class);
        newAl2.code();
    }
}
