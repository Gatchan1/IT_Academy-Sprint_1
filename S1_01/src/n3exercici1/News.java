package n3exercici1;

public abstract class News {
	private String headline;
	private String text;
	private int score;
	private int price;
	
	public News(String headline) {
		text = "";
		this.headline = headline;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public abstract void calculateNewsPrice();
	
	public abstract void calculateNewsScore();
}
