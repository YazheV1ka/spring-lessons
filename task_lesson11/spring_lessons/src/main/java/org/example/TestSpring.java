package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        /*Music rockMusic = context.getBean("rockMusic", Music.class);
        Music rapMusic = context.getBean("rapMusic", Music.class);
        Music classicalMusic = context.getBean("classicalMusic", Music.class);
        MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);
        MusicPlayer rapMusicPlayer = new MusicPlayer(rapMusic);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(classicalMusic);
        rockMusicPlayer.playMusic();
        rapMusicPlayer.playMusic();
        classicalMusicPlayer.playMusic();*/

        /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();*/

        /*Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);*/

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(MusicGenre.CLASSICAL);
        musicPlayer.playMusic(MusicGenre.RAP);
        musicPlayer.playMusic(MusicGenre.ROCK);

        context.close();
    }
}
