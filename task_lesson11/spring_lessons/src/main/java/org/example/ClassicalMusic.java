package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    private List<String> classicalMusicList= new ArrayList<>();
    {
        classicalMusicList.add("Шуберт - Аве Мария");
        classicalMusicList.add("Бетховен - Симфония 5");
        classicalMusicList.add("Вивальди - Летняя гроза");
    }

    @Override
    public List<String> getSong() {
        return classicalMusicList;
    }

}
