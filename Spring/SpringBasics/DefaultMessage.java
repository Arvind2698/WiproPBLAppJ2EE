package com.arvind.wipro.bean;

public class DefaultMessage {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public DefaultMessage(String message) {
		super();
		this.message = message;
	}

	public DefaultMessage() {
		super();
	}
	
	@Override
	public String toString() {
		return "DefaultMessage [message=" + message + "]";
	}
	
}
