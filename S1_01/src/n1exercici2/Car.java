package n1exercici2;

public class Car {
	private static final String BRAND = "Ford";
	private static String model;
	private final int HORSEPOWER;

	public Car(String model, int potencia) {
		Car.model = model;
		this.HORSEPOWER = potencia;
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

	public int getHORSEPOWER() {
		return HORSEPOWER;
	}

	public static void brake() {
		System.out.println("El vehicle està frenant");
	}

	public void accelerate() {
		System.out.println("El vehicle està accelerant");
	}
}
