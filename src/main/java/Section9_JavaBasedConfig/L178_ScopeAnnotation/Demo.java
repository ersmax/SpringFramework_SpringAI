package Section9_JavaBasedConfig.L178_ScopeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop aDesktop = context.getBean(Desktop.class);
        Desktop aDesktop2 = context.getBean("desktopComputer", Desktop.class);

    }
}
