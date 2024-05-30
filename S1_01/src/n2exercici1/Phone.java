 package n2exercici1;

public class Phone {
	private String brand;
	private String model;
	
	public Phone(String marca, String model) {
		this.brand = marca;
		this.model = model;
	}
	
	public void ring(String numero) {
		System.out.println("S'està truncant al número "+numero+".");
	}
}
