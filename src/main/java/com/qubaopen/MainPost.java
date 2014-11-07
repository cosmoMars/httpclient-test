package com.qubaopen;

import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class MainPost {
	public static void main(String[] args) {

		new JSONObject();
		String questionJson = "[{\"questionId\": 270,\"contents\":[{\"id\":827}]}," + "{\"questionId\": 271,\"contents\":[{\"id\":828},{\"id\":829}]},"
				+ "{\"questionId\": 272,\"contents\":[{\"id\":830,\"cnt\":\"你好你\"}," + "{\"id\":831,\"cnt\":\"dddddddd\"}]},{\"questionId\": 273,\"contents\":[{\"id\":832,\"order\":1},"
				+ "{\"id\":833,\"order\":2},{\"id\":834,\"order\":3}]}," + "{\"questionId\": 274,\"contents\":[{\"id\":836}]}]";

		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod("http://localhost:8081/selfs/calculateSelfResult");

		post.addParameter("selfId", "12");
		post.addParameter("questionJson", questionJson);
//		post.addParameter("refresh", "false");

		HttpMethodParams param = post.getParams();
		param.setContentCharset("UTF-8");
		try {
			// post.setRequestEntity(new StringRequestEntity(calSelf.toString(),
			// "application/x-www-form-urlencoded", "UTF-8"));
			int responseCode = client.executeMethod(post);
			System.out.println(responseCode);
			String response = post.getResponseBodyAsString();
			System.out.println(response);
		} catch (Exception e) {

		}
	}
}
