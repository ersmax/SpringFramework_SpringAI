package Section9_JavaBasedConfig.L178_ScopeAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = {"computer", "desktopComputer", "laptop"})
    @Scope(value = "prototype")
    public Desktop desktop(){
        return new Desktop();
    }
}
