package edu.design.patterns;

public class Message {

	private String sender;
	private String recipient;
	private String text;

	public Message() {
	}

	public Message(String sender, String recipient, String text) {
		this.sender = sender;
		this.recipient = recipient;
		this.text = text;
	}

	public String getSender() {
		return this.sender;
	}


	public String getRecipient() {
		return this.recipient;
	}


	public String getText() {
		return this.text;
	}

}
