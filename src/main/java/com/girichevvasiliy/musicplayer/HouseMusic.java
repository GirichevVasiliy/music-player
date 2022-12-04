package com.girichevvasiliy.musicplayer;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;
@EqualsAndHashCode
public class HouseMusic implements Music {
    private MusicType musicType = MusicType.HOUSE;
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

    @Override
    public MusicType getMusicType() {
        return null;
    }
}
