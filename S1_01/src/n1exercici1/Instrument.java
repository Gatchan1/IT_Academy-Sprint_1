package n1exercici1;

public abstract class Instrument {
	private String name;
	private double price;
	
	public Instrument(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	static {
		System.out.println("Clase cargada!");
	}

	public abstract void play();
}
