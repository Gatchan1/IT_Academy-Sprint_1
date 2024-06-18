package n1exercici1;

public class Worker {
	private String name;
	private String lastName;
	private double hourPrice;

	public Worker(String name, String lastName, double hourPrice) {
		this.name = name;
		this.lastName = lastName;
		this.hourPrice = hourPrice;
	}
	
	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public double getHourPrice() {
		return hourPrice;
	}

	public double calculateWage(int workedHours) {
		return workedHours * hourPrice;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", lastName=" + lastName + ", hourPrice=" + hourPrice + "]";
	}
}
