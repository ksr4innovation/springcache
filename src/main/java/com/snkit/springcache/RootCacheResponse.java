package com.snkit.springcache;

import java.io.Serializable;

public class RootCacheResponse implements Serializable {
	
	private String code;
	
	private String message;


	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
