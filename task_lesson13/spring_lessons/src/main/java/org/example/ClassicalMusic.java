package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music{

    private List<String> classicalMusicList= new ArrayList<>();
    {
        classicalMusicList.add("Шуберт - Аве Мария");
        classicalMusicList.add("Бетховен - Симфония 5");
        classicalMusicList.add("Вивальди - Летняя гроза");
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("Initialization...");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Destruction...");
    }
    @Override
    public List<String> getSong() {
        return classicalMusicList;
    }

}
