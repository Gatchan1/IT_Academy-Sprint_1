package n1exercici1;

public class WorkerOnline extends Worker {
	private static final double INTERNET_FARE = 30;

	public WorkerOnline(String name, String lastName, double hourPrice) {
		super(name, lastName, hourPrice);
	}

	@Override
	public double calculateWage(int workedHours) {
		return super.calculateWage(workedHours) + INTERNET_FARE;
	}
}
