package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music{

    private List<String> rockMusicList= new ArrayList<>();
    {
        rockMusicList.add("AC/DC - T.N.T.");
        rockMusicList.add("The Gitas - God");
        rockMusicList.add("The White Striped - Seven Nation Army");
    }

    @Override
    public List<String> getSong() {
        return rockMusicList;
    }
}
