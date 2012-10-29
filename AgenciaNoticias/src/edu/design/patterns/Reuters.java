package edu.design.patterns;

import java.util.ArrayList;
import java.util.List;

public class Reuters implements INewsAgency {
	private List<INewsConsumer> observers = new ArrayList<INewsConsumer>();

	@Override
	public void attach(INewsConsumer observer) {
		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	@Override
	public void dettach(INewsConsumer observer) {
		// TODO Auto-generated method stub
		if (observers.contains(observer)) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyEvent(String whatHappened) {
		for (int i = 0; i < observers.size(); i++) {
			PieceOfNews theNews = new PieceOfNews();
			theNews.setTitle(whatHappened);
			if (whatHappened.contains("equipo"))
			theNews.setCategory("deportes");
			else
				theNews.setCategory("politica");	
			observers.get(i).receiveNotification(theNews);
		}

	}

	
}
