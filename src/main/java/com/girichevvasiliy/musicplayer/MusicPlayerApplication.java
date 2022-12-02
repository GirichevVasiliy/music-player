package com.girichevvasiliy.musicplayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MusicPlayerApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 1. Тут мы явно создаем объекты  без участия спринга
		/*Music music = context.getBean("musicBean", Music.class);
		MusicPlayer musicPlayer = new MusicPlayer(music);
		musicPlayer.playMusic();*/

		// Тут мы создаем объекты при помощи спринга в xml - Зависимость через конструктор
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.playMusic();
		context.close();
	}

}
