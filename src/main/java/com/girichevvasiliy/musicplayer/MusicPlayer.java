package com.girichevvasiliy.musicplayer;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    @NonNull
    /*Подключу Lombok, для работы с классами*/
    private List<Music> musicList = new ArrayList<>();
    private Music music1;
    private Music music2;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    /*  public MusicPlayer(Music music) {
           musicList.add(music);
       }
      public void playMusic() {
          for (Music music : musicList) {
              String i = music.getClass().getName();
              String[] musisType = i.split("\\.");
              System.out.println("*****************************************************************************************************************");
              System.out.println("Плеер " + "\"" + getName() + "\"" + " запущен, выбран жанр: " + "\"" + musisType[musisType.length - 1] + "\"," + " сейчас проиграется: " + music.playSong());
              System.out.println("Громкость: " + getVolume() + "%");
              System.out.println("*****************************************************************************************************************");
          }
      }*/
    public void playMusic() {
        musicList.add(music1);
        musicList.add(music2);
        for (Music music : musicList) {
            String i = music.getClass().getName();
            String[] musisType = i.split("\\.");
            System.out.println("*****************************************************************************************************************");
            System.out.println("Плеер " + "\"" + getName() + "\"" + " запущен, выбран жанр: " + "\"" + musisType[musisType.length - 1] + "\"," + " сейчас проиграется: " + music.playSong());
            System.out.println("Громкость: " + getVolume() + "%");
            System.out.println("*****************************************************************************************************************");
        }
    }

    public void setMusic1(Music music1) {
        this.music1 = music1;
    }

    public void setMusic2(Music music2) {
        this.music2 = music2;
    }
}
