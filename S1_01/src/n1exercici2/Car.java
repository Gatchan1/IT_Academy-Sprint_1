package n1exercici2;

public class Car {
	private static final String BRAND = "Ford";
	private static String model = "Focus";
	private final int horsepower;

	public Car(int potencia) {
		this.horsepower = potencia;
	}
	
	public static String getBRAND() {
		return BRAND;
	}

	public static String getModel() {
		return model;
	}
	public static void setModel(String model) {
		Car.model = model;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public static void brake() {
		System.out.println("El vehicle està frenant");
	}

	public void accelerate() {
		System.out.println("El vehicle està accelerant");
	}
}
