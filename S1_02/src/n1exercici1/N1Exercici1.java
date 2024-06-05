package n1exercici1;

public class N1Exercici1 {
	public static void main(String[] args) {
		Purchase purchase1 = new Purchase();
		Product prod1 = new Product("patata", 1.25);

		purchase1.calculateTotalPrice(); // EmptyPurchaseException test

		purchase1.addProduct(prod1);
		System.out.println("\nPreu total abans d'afegir producte: " + purchase1.getTotalPrice());
		purchase1.calculateTotalPrice();
		System.out.println("Preu total després d'afegir producte: " + purchase1.getTotalPrice() + "\n");

		try {
			throw new ArrayIndexOutOfBoundsException();
			//String[] numbers = { "uno", "dos", "tres" };
			//System.out.println(numbers[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("La siguiente excepción ha sido lanzada: " + e); 
		}

	}
}
