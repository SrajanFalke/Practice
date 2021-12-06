package com.qa.google.utility;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class JsonReader {
	static String path = "C:\\Users\\Veerendra Singh Thak\\eclipse-workspace\\PageObjectModel\\src\\main\\java\\com\\qa\\google\\loginDb\\LoginCertaIn.json";

	public String jsonReader(int list, String feature, String getJson) {
		try {
			JSONParser jsonParser = new JSONParser();
			FileReader reader = new FileReader(path);
			// Read JSON file
			Object obj = jsonParser.parse(reader);
			JSONArray userDetailsList = (JSONArray) obj;
			JSONObject company = (JSONObject) userDetailsList.get(list);
			JSONObject user = (JSONObject) company.get(feature);
			String Entitname = (String) user.get(getJson);
			return Entitname;
		} catch (Exception exception) {
		}
		return null;
	}

	@Test
	public void getadminJsondata() {
		String str = jsonReader(0, "adminUser","emailUser");
		System.out.println(str);
		String pwd = jsonReader(1, "PasswordDetails","password");
		System.out.println(str);
	}
	@Test
	public void getNonadminJsondata() {
		String str = jsonReader(1, "", "user2");
		System.out.println(str);
	}

}
