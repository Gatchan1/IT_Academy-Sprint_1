package n1exercici1;

public class Exercise {
	public static void main(String[] args) {
		Worker normalWorker = new Worker("Luis", "Perez", 9);
		WorkerOnline onlineWorker = new WorkerOnline("Ana", "Rodriguez", 9);
		WorkerInPerson inPersonWorker = new WorkerInPerson("Jamie", "Adams", 9);
		
		System.out.println("Salario de un Worker: " + normalWorker.calculateWage(160));
		System.out.println("Salario de un WorkerOnline: " + onlineWorker.calculateWage(160));
		System.out.println("Salario de un WorkerInPerson: " + inPersonWorker.calculateWage(160));
	}
}
