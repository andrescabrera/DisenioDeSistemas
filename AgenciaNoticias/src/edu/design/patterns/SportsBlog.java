package edu.design.patterns;

public class SportsBlog implements INewsConsumer {
	private INewsAgency newsAgency;

	public SportsBlog(INewsAgency newsAgency) {
		this.newsAgency = newsAgency;
		this.newsAgency.attach(this);
	}

	@Override
	public void receiveNotification(PieceOfNews theNews) {
		if (theNews.getCategory().equalsIgnoreCase("deportes")) {
			this.publicarEnLaWeb(theNews);
		}

	}

	private void publicarEnLaWeb(PieceOfNews theNews) {
		System.out.println("<HTML>");
		System.out.println(theNews.getTitle());
		System.out.println("</HTML>");
	}
}
