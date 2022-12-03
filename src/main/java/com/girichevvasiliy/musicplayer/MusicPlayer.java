package com.girichevvasiliy.musicplayer;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Component
public class MusicPlayer {
    @NonNull
    /*Подключу Lombok, для работы с классами*/
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

     public MusicPlayer(Music music) {
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
    }
}
