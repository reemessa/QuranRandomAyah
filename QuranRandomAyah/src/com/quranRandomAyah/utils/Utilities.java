package com.quranRandomAyah.utils;

public class Utilities {

	public static int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}
}
