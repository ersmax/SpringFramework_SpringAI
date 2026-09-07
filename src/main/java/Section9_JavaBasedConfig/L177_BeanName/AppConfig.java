package Section9_JavaBasedConfig.L177_BeanName;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = {"computer", "desktopComputer", "laptop"})
    public Desktop desktop(){
        return new Desktop();
    }
}
