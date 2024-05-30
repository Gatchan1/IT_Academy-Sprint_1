package n3exercici1;

public class NewsTennis extends News {
	private String competition;
	private String players;

	public NewsTennis(String headline, String competition, String players) {
		super(headline);
		this.competition = competition;
		this.players = players;
	}

	public void calculateNewsPrice() {
		int newPrice = 150;
		if (players.contains("Federer") || players.contains("Nadal") || players.contains("Djokovic")) {
			newPrice += 100;
		}
		this.setPrice(newPrice);
	}

	public void calculateNewsScore() {
		int newScore = 4;
		if (players.contains("Federer") || players.contains("Nadal") || players.contains("Djokovic")) {
			newScore += 3;
		}
		this.setScore(newScore);
	}

	@Override
	public String toString() {
		return "* Noticia de tenis:\nTitular:" + this.getHeadline() + "\nCompetición:" + this.competition + "\nTenistas:"
				+ this.players + "\nTexto:" + this.getText() + "\n";
	}
}
