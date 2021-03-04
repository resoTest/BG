package com.testingsshatra.exceptions;

public class ElementNotFound extends RuntimeException {
	String detailmsg;

	public ElementNotFound() {
		System.out.println(" No such Elemnet Found : ");
	}

	public ElementNotFound(String msg) {
		detailmsg = msg;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return detailmsg;
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
	}
	@Override
	public String toString() {
		String ClassName = getClass().getName();
		return ClassName+":"+ detailmsg;
	}
}
