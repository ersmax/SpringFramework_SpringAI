package Section9_JavaBasedConfig.L176_JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop aDesktop = context.getBean("desktop", Desktop.class);
        aDesktop.compile();
    }
}
