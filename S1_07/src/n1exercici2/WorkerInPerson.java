package n1exercici2;

public class WorkerInPerson extends Worker {
	private static double gas = 60.5;

	public WorkerInPerson(String name, String lastName, double hourPrice) {
		super(name, lastName, hourPrice);
	}

	public static void setGas(double gas) {
		WorkerInPerson.gas = gas;
	}

	@Override
	public double calculateWage(int workedHours) {
		return workedHours * super.getHourPrice() + gas;
	}
	
	@Deprecated
	public void prank() {
		System.out.println(super.getName() + " " + super.getLastName() + " has done a prank to a coworker.");
	}
}
