package com.quranRandomAyah.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.quranRandomAyah.json.AyahResponse;

/**
 * 
 * @author Reem Issa
 * @class_name RandomAyahAPICLient.java
 * @class_description
 * @create_date Aug 3, 2023
 * @last_Update Aug 3, 2023
 */
public class RandomAyahAPICLient {

	public String getAyah(Integer sorah, Integer ayah) {

		String api = String.format("http://api.quran-tafseer.com/quran/%d/%d", sorah, ayah);

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(api))
				.method("GET", HttpRequest.BodyPublishers.noBody()).build();

		HttpResponse<String> response = null;
		AyahResponse ayahRes = null;
		try {

			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

			Gson gson = new Gson();
			ayahRes = gson.fromJson(response.body(), AyahResponse.class);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return ayahRes.getAyah();
	}

}
