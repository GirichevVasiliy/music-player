package com.girichevvasiliy.musicplayer;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    public ClassicalMusic() {
    }

    private List<String> playListClassicalMusic = new ArrayList<>();

    @Override
    public List playSong() {
        playListClassicalMusic = List.of("Антонио Вивальди - Времена года", "Бах - Сонаты и партиты для скрипки соло",
                "Чайковский - созвучие, стройное звучание, стройность");
        return playListClassicalMusic;
    }

}
