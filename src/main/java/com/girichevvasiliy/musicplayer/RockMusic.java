package com.girichevvasiliy.musicplayer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@Component
public class RockMusic implements Music{
    @Override
    public String playSong() {
        return "Кино - кукушка";
    }
}
