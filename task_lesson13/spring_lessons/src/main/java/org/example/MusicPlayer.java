package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    private List<Music> genreList = new ArrayList<>();

    public MusicPlayer(List<Music> genreList){
        this.genreList = genreList;
    }


    public String playMusic() {
        Random random = new Random();
        return "Playing: " + genreList.get(random.nextInt(genreList.size())).getSong()
                + "with volume " + this.volume;
    }
}
