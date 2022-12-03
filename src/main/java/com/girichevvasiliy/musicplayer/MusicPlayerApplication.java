package com.girichevvasiliy.musicplayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MusicPlayerApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Music music = context.getBean("classicalMusic", Music.class);
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.getMusicList().add(music);
		musicPlayer.playMusic();

		Music music1 = context.getBean("rockMusic", Music.class);
		MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer1.setName("AIMP");
		musicPlayer1.setVolume(22);
		musicPlayer1.getMusicList().add(music1);
		musicPlayer1.playMusic();
		musicPlayer.setName("Winap");
		musicPlayer1.playMusic();
		System.out.println("_________________________________");
		System.out.println(musicPlayer.getName());

		context.close();
	}

}
