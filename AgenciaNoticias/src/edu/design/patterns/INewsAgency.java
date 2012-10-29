package edu.design.patterns;

//The Subject!!!
public interface INewsAgency {
	void attach(INewsConsumer observer);
	void dettach(INewsConsumer observer);
	void notifyEvent(String whatHappened);
}
