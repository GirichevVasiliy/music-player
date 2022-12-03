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
		// проверим черри пик
		Music music3 = context.getBean("rockMusic", Music.class);
		MusicPlayer musicPlayer3 = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer3.setName("AIMP");
		musicPlayer3.setVolume(22);
		musicPlayer3.getMusicList().add(music3);
		musicPlayer3.playMusic();
		musicPlayer3.playMusic();
		Music music4 = context.getBean("rockMusic", Music.class);
		MusicPlayer musicPlayer4 = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer4.setName("AIMP");
		musicPlayer4.setVolume(22);
		musicPlayer4.getMusicList().add(music3);
		musicPlayer4.playMusic();
		musicPlayer4.playMusic();
		// проверим черри пик
		context.close();
	}

}
