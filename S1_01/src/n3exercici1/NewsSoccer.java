package n3exercici1;

public class NewsSoccer extends News {
	private String competition;
	private String club;
	private String player;

	public NewsSoccer(String headline, String competition, String club, String player) {
		super(headline);
		this.competition = competition;
		this.club = club;
		this.player = player;
	}

	@Override
	public void calculateNewsPrice() {
		int newPrice = 300;
		if (competition.equalsIgnoreCase("Lliga de Campions")) {
			newPrice += 100;
		}
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
			newPrice += 100;
		}
		if (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) {
			newPrice += 50;
		}
		this.setPrice(newPrice);
	}

	@Override
	public void calculateNewsScore() {
		int newScore = 5;
		if (competition.equalsIgnoreCase("Lliga de Campions")) {
			newScore += 3;
		} else if (competition.equalsIgnoreCase("Lliga")) {
			newScore += 2;
		}
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
			newScore += 1;
		}
		if (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) {
			newScore += 1;
		}
		this.setScore(newScore);
	}

	@Override
	public String toString() {
		return "* Noticia de fútbol:\nTitular:" + this.getHeadline() + "\nCompetición:" + this.competition + "\nClub:"
				+ this.club + "\nJugador:" + this.player + "\nTexto:" + this.getText() + "\n";
	}
}
