package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean ClassicalMusic classicalMusic(){return new ClassicalMusic();}
    @Bean RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean MusicPlayer musicPlayer(){
        return new MusicPlayer(genreList());
    }
    @Bean List<Music> genreList(){
        return Arrays.asList(classicalMusic(),rapMusic(),rockMusic());
    }
}
