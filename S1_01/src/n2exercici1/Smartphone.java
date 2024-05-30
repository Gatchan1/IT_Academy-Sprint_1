package n2exercici1;

public class Smartphone extends Phone implements Camera, Clock {
	public Smartphone(String marca, String model) {
		super(marca, model);
	}
	
	public void photograph() {
		System.out.println("S’està fent una foto");
	}
	
	public void alarm() {
		System.out.println("Està sonant l’alarma");
	}
	
}
