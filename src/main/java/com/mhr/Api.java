package com.mhr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONObject;
import javax.net.ssl.HttpsURLConnection;

public class Api {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.out.println(getDog());
		System.out.println("just for test");
	}

	public static String getDog() throws MalformedURLException, IOException{
        String httpsURL = "https://dog.ceo/api/breeds/image/random";
        URL myUrl = new URL(httpsURL);
        HttpsURLConnection conn = (HttpsURLConnection) myUrl.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        JSONObject json = new JSONObject(in.readLine());
        String Picture = json.getString("message");
        return Picture;
    }
}
