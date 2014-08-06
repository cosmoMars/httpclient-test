package com.qubaopen;

import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;

public class Main {

	public static void main(String[] args) {

		JSONObject user = new JSONObject();
		user.put("phone", "13621673989");
		user.put("password", "123456aa");

		HttpClient client = new HttpClient();
		PutMethod put = new PutMethod("http://localhost:8081/users/login");

		//put.setRequestHeader(new Header("Content-Type", "application/json"));
		try {
			put.setRequestEntity(new StringRequestEntity(user.toString(), "application/json", "UTF-8"));
			int responseCode = client.executeMethod(put);
			System.out.println(responseCode);

			String response = put.getResponseBodyAsString();
			System.out.println(response);
		} catch (Exception e) {

		}

	}

}
