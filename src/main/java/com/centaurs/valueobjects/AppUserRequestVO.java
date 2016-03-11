package com.centaurs.valueobjects;

public class AppUserRequestVO {
	private String username;
	private String password;
	
    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private boolean isAppUserAuthenticated = false;

	public boolean isAppUserAuthenticated() {
		return isAppUserAuthenticated;
	}

	public void setAppUserAuthenticated(boolean isAppUserAuthenticated) {
		this.isAppUserAuthenticated = isAppUserAuthenticated;
	}
    
}
