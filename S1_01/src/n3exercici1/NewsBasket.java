package n3exercici1;

public class NewsBasket extends News {
	private String competition;
	private String club;

	public NewsBasket(String headline, String competition, String club) {
		super(headline);
		this.competition = competition;
		this.club = club;
	}

	public void calculateNewsPrice() {
		int newPrice = 250;
		if (competition.equalsIgnoreCase("Eurolliga")) {
			newPrice += 75;
		}
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
			newPrice += 100;
		}
		this.setPrice(newPrice);
	}

	public void calculateNewsScore() {
		int newScore = 4;
		if (competition.equalsIgnoreCase("Eurolliga")) {
			newScore += 3;
		} else if (competition.equalsIgnoreCase("ACB")) {
			newScore += 2;
		}
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
			newScore += 1;
		}
		this.setScore(newScore);
	}

	@Override
	public String toString() {
		return "* Noticia de básquet:\nTitular:" + this.getHeadline() + "\nCompetición:" + this.competition + "\nClub:"
				+ this.club + "\nTexto:" + this.getText() + "\n";
	}
}
