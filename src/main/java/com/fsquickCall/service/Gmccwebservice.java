package com.fsquickCall.service;

import org.springframework.stereotype.Component;

@Component
public class Gmccwebservice {
	
	private String systemid;
	private String accountid;
	private String password;
	
	public void setSystemid(String  systemid) {
        this.systemid = systemid;
    }
	public String getSystemid(){
		return systemid;
	}
	public void setAccountid(String  accountid) {
        this.accountid = accountid;
    }
	public String getAccountid(){
		return accountid;
	}
	public void setPassword(String  password) {
        this.password = password;
    }
	public String getPassword(){
		return password;
	}
	
}
