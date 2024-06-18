package n1exercici2;

public class WorkerOnline extends Worker {
	private static final double INTERNET_FARE = 30;

	public WorkerOnline(String name, String lastName, double hourPrice) {
		super(name, lastName, hourPrice);
	}

	@Override
	public double calculateWage(int workedHours) {
		return workedHours * super.getHourPrice() + INTERNET_FARE;
	}
	
	@Deprecated
	public void phoneCallPrank() {
		System.out.println(super.getName() + " " + super.getLastName() + " has done a phone call prank to a coworker.");
	}
}
