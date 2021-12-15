package com.loginmodule.model;

public class LoginModel {
	
	public static boolean checkLoginDetails(String uname, String pword) {
		if((uname.equals("admin") && pword.equals("admin")) || (uname.equals("admin1") && pword.equals("admin1"))) {
			return true;
		}else {
			return false;
		}
	}

}
