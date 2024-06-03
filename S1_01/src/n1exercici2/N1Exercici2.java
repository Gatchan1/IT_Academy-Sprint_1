package n1exercici2;

public class N1Exercici2 {
	public static void main(String[] args) {
		System.out.println("La marca de nuestros coches es: "+ Car.getBRAND() +
				"\ny el modelo de los coches es "+ Car.getModel());
		Car car1 = new Car(280);
		System.out.println("La potencia de car1 es: "+ car1.getHorsepower());
		
		car1.accelerate();
		Car.brake();
	}
}
