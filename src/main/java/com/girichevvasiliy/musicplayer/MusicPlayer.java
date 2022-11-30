package com.girichevvasiliy.musicplayer;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void musicPlayback(){
       String i =  music.getClass().getName();
        String[] musisType = i.split("\\.");
        System.out.println("Плеер запущен, выбран жанр: " + "\""+ musisType[musisType.length-1] + "\"," + " сейчас проиграется: " + music.playSong());
    }
}
