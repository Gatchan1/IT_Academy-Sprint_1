package n3exercici1;

public class NewsMotorcycling extends News {
	private String team;

	public NewsMotorcycling(String headline, String team) {
		super(headline);
		this.team = team;
	}

	public void calculateNewsPrice() {
		int newPrice = 100;
		if (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")) {
			newPrice += 50;
		}
		this.setPrice(newPrice);
	}

	public void calculateNewsScore() {
		int newScore = 3;
		if (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")) {
			newScore += 3;
		}
		this.setScore(newScore);
	}

	@Override
	public String toString() {
		return "* Noticia de motociclismo:\nTitular:" + this.getHeadline() + "\nEquipo:" + this.team + "\nTexto:"
				+ this.getText() + "\n";
	}
}
