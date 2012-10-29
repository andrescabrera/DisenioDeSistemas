package edu.design.patterns;

public class GermanAgent {

	private String name;

	public GermanAgent(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void SendMessage(Message message, EnigmaMachine enigmaMachine) {
		enigmaMachine.Send(message);
	}
}
