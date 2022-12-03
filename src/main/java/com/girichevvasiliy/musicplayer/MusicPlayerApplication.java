package com.girichevvasiliy.musicplayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MusicPlayerApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 1. Тут мы явно создаем объекты  без участия спринга
		/*Music music = context.getBean("musicBean", Music.class);
		MusicPlayer musicPlayer = new MusicPlayer(music);
		musicPlayer.playMusic();*/
/*
		// Тут мы создаем объекты при помощи спринга в xml - Зависимость через конструктор
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.playMusic();
		musicPlayer.playMusic();

		MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer1.setVolume(77);
		musicPlayer1.setName("AIMP");
		musicPlayer1.playMusic();*/

		ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);
		System.out.println(classicalMusic.playSong());

		ClassicalMusic classicalMusic1 = context.getBean("musicBean1", ClassicalMusic.class);
		System.out.println(classicalMusic1.playSong());
		classicalMusic1.setNameSong("Antonio Stradivarius");
		System.out.println("classicalMusic1: " + classicalMusic1.getNameSong());
		System.out.println("classicalMusic: " + classicalMusic.getNameSong());
		classicalMusic.setNameSong("Bah");
		System.out.println("classicalMusic1: " + classicalMusic1.getNameSong());
		System.out.println("classicalMusic: " + classicalMusic.getNameSong());

		context.close();
	}

}
