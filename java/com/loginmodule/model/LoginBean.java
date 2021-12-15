package com.loginmodule.model;

public class LoginBean {
	
	private String name;
	private String password;
	
	
	public LoginBean(String name, String password) {
		if(LoginModel.checkLoginDetails(name, password)) {
			this.name = name;
			this.password = password;
		}else {
			this.name = "unknown";
			this.password = "unknown";
		}
		
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	
	

}
