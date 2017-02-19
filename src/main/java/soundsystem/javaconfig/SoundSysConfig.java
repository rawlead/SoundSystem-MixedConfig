package soundsystem.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoundSysConfig {

    @Bean(name = "lonelyHearts")
    CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    MyMediaPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }
}
