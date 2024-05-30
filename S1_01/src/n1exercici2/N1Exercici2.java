package n1exercici2;

public class N1Exercici2 {
	public static void main(String[] args) {
		System.out.println("La marca de nuestros coches es: "+ Car.getBRAND() +".");
		Car car1 = new Car("Focus", 280);
		System.out.println("El modelo de car1 es "+ car1.getModel() +
				".\nIgual que el modelo de todos los Car: "+ Car.getModel() + 
				".\n(Y la potencia de car1 es: "+ car1.getHORSEPOWER() + ")");
		Car car2 = new Car("Fiesta", 200);
		System.out.println("Pero ahora el modelo de todos los Cotxe es: "+ Car.getModel() + ".");
		
		car1.accelerate();
		Car.brake();
	}
}
