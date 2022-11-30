package com.girichevvasiliy.musicplayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MusicPlayerApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Music music = context.getBean("musicBean", Music.class);
		MusicPlayer musicPlayer = new MusicPlayer(music);
		musicPlayer.musicPlayback();
		context.close();
	}

}
