package com.testingsshatra.exceptions;

public class UnabletoGetBrowserException extends RuntimeException{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Invalid Browsername , Unable to get Browser ";
	}

}
