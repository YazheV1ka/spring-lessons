package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music {

    private List<String> rapMusicList= new ArrayList<>();
    {
        rapMusicList.add("MORGENSTERN - ДУЛО");
        rapMusicList.add("МС ПОХ - Банька-парилка");
        rapMusicList.add("Oxxxymiron - Тентакли");
    }

    @Override
    public List<String> getSong() {
        return rapMusicList;
    }
}
