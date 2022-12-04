package com.girichevvasiliy.musicplayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MusicPlayerApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.playMusic();
		context.close();
	}

}
