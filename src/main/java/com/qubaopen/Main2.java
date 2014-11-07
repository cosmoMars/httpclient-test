package com.qubaopen;


public class Main2 {

	public static void main(String[] args) {

		try {
			System.out.println(getConstantValue("02"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static int getConstantValue(String code) throws Exception {
		return Constant.class.getField("BTN_" + code).getInt(null);
	}

}
