package com.girichevvasiliy.musicplayer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class RockMusic implements Music{
    @Override
    public String playSong() {
        return "Кино - кукушка";
    }
}
