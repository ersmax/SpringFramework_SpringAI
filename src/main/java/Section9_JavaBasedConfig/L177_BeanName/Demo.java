package Section9_JavaBasedConfig.L177_BeanName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop aDesktop = context.getBean("desktopComputer", Desktop.class);
        aDesktop.compile();
    }
}
