package com.quranRandomAyah.main;

import com.quranRandomAyah.client.RandomAyahAPICLient;
import com.quranRandomAyah.json.StaticMessages;
import com.quranRandomAyah.utils.Utilities;

/**
 * 
 * @author Reem Issa
 * @class_name Main.java
 * @class_description
 * @create_date Aug 1, 2023
 * @last_Update Aug 1, 2023
 */
public class Main {

	private static Integer QURAN_SORAH_COUNT = 114;
	private static Integer QURAN_MAX_AYAT_IN_SORAH_COUNT = 286;

	private static RandomAyahAPICLient randomAyahAPICLient;

	public static void main(String[] args) {

		getRandomQuote();

	}

	private static void getRandomQuote() {

		System.out.println(StaticMessages.WELCOME_MSG);

		// TODO Map the ayah max number to the sorah
		randomAyahAPICLient = new RandomAyahAPICLient();
		String quote = null;

		do {
			quote = randomAyahAPICLient.getAyah(Utilities.getRandomNumber(1, QURAN_SORAH_COUNT),
					Utilities.getRandomNumber(1, QURAN_MAX_AYAT_IN_SORAH_COUNT));
		} while (quote == null || quote == "");

		System.out.println(quote);
	}

}
