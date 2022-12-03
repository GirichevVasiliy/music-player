package com.girichevvasiliy.musicplayer;

public class HouseMusic implements Music {
    private HouseMusic() {
    }
    public static HouseMusic getHouseMusic(){
        return new HouseMusic();
    }

    @Override
    public String playSong() {
        return "David Guetta -  I'm Good";
    }
}
