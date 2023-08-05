package com.quranRandomAyah.json;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Reem Issa
 * @class_name Ayah.java
 * @class_description
 * @create_date Aug 3, 2023
 * @last_Update Aug 3, 2023
 */
public class AyahResponse {

	private int sura_index;
	private String sura_name;
	private int ayah_number;

	@SerializedName("text") // Map the JSON property "text" to the Java field "ayah"
	private String ayah;

	public int getSura_index() {
		return sura_index;
	}

	public void setSura_index(int sura_index) {
		this.sura_index = sura_index;
	}

	public String getSura_name() {
		return sura_name;
	}

	public void setSura_name(String sura_name) {
		this.sura_name = sura_name;
	}

	public int getAyah_number() {
		return ayah_number;
	}

	public void setAyah_number(int ayah_number) {
		this.ayah_number = ayah_number;
	}

	public String getAyah() {
		return ayah;
	}

	public void setAyah(String ayah) {
		this.ayah = ayah;
	}
}
