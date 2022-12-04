package com.girichevvasiliy.musicplayer;

import java.util.ArrayList;
import java.util.List;

public class HouseMusic implements Music {
    List<String>playListHouseMusic = new ArrayList<>();
    private HouseMusic() {
    }
    public static HouseMusic getHouseMusic(){
        return new HouseMusic();
    }

    @Override
    public List playSong() {
        playListHouseMusic = List.of("David Guetta -  I'm Good");
        return playListHouseMusic;
    }
}
