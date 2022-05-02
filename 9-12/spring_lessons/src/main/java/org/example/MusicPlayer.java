package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }

    private ClassicalMusic classicalMusic;
    private RapMusic rapMusic;
    private RockMusic rockMusic;

    @Autowired
     public MusicPlayer(@Qualifier("rockMusic")RockMusic rockMusic, @Qualifier("rapMusic")RapMusic rapMusic,@Qualifier("classicalMusic")ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
        this.classicalMusic = classicalMusic;
    }

    public void playMusic(MusicGenre genre){
        Random random = new Random();
        int rand = random.nextInt(3);
        if(genre == MusicGenre.CLASSICAL){
            System.out.println(classicalMusic.getSong().get(rand));
        }
        if(genre == MusicGenre.RAP){
            System.out.println(rapMusic.getSong().get(rand));
        }
        if(genre == MusicGenre.ROCK){
            System.out.println(rockMusic.getSong().get(rand));
        }
    }
}
