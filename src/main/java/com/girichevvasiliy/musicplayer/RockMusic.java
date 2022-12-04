package com.girichevvasiliy.musicplayer;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Component
public class RockMusic implements Music {
    public RockMusic() {
    }

    List<String> playListRockMusic = new ArrayList<>();
    @Override
    public List playSong() {
        playListRockMusic = List.of("Пачка сигарет", "Мы ждем перемен", "Звезда по имени солнце");
        return playListRockMusic;
    }
}
