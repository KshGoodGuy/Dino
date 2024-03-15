package Dino.dinosaur;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class DinosaurConfig {

    @Bean
    public DinosaurManager dinosaurManager() {
        return new DinosaurManager();
    }
}
