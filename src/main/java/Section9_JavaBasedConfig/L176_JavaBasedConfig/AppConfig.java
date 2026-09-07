package Section9_JavaBasedConfig.L176_JavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Desktop desktop(){
        return new Desktop();
    }
}
