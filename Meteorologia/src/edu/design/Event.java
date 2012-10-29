package edu.design;

public class Event {
	private String code;
	private String message;
	private String sender;
	
	public Event(String sender, String code, String message) {
		this.sender = sender;
		this.code = code;
		this.message = message;
	}



	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}



	public void setSender(String sender) {
		this.sender = sender;
	}



	public String getSender() {
		return sender;
	}
}
