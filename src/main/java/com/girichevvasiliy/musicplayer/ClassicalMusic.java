package com.girichevvasiliy.musicplayer;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@EqualsAndHashCode

public class ClassicalMusic implements Music {
    public ClassicalMusic() {
    }

    private List<String> playListClassicalMusic = new ArrayList<>();
    private MusicType musicType = MusicType.CLASSICAL;
    @Override
    public List playSong() {
        playListClassicalMusic = List.of("Антонио Вивальди - Времена года", "Бах - Сонаты и партиты для скрипки соло",
                "Чайковский - созвучие, стройное звучание, стройность");
        return playListClassicalMusic;
    }

}
