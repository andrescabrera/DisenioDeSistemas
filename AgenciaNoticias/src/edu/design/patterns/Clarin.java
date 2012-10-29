package edu.design.patterns;

public class Clarin implements INewsConsumer {
	private INewsAgency newsAgency;

	public Clarin(INewsAgency newsAgency) {
		this.newsAgency = newsAgency;
		this.newsAgency.attach(this);
	}
	@Override
	public void receiveNotification(PieceOfNews theNews) {
		System.out.println("PAGINA DEL DIARIO--> " + theNews.getCategory() + ": " + theNews.getTitle());
	}

}
