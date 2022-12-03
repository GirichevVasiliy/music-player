package com.girichevvasiliy.musicplayer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ClassicalMusic implements Music{
    private String nameSong;
    @Override
    public String playSong() {
        return "Антонио Вивальди - Времена года";
    }

}
