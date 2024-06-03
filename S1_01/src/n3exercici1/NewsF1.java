package n3exercici1;

public class NewsF1 extends News {
	private String squad;

	public NewsF1(String headline, String squad) {
		super(headline);
		this.squad = squad;
	}

	@Override
	public void calculateNewsPrice() {
		int newPrice = 100;
		if (squad.equalsIgnoreCase("Ferrari") || squad.equalsIgnoreCase("Mercedes")) {
			newPrice += 50;
		}
		this.setPrice(newPrice);
	}

	@Override
	public void calculateNewsScore() {
		int newScore = 4;
		if (squad.equalsIgnoreCase("Ferrari") || squad.equalsIgnoreCase("Mercedes")) {
			newScore += 2;
		}
		this.setScore(newScore);
	}

	@Override
	public String toString() {
		return "* Noticia de F1:\nTitular:" + this.getHeadline() + "\nEscudería:" + this.squad + "\nTexto:"
				+ this.getText() + "\n";
	}
}
