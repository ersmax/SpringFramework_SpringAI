package Section9_JavaBasedConfig.L181_ComponentStereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien object = context.getBean(Alien.class);
        System.out.println(object.getAge());
        object.code();
    }
}
