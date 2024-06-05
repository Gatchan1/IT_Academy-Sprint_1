package n2exercici1;

public class N2Exercici1 {
	public static void main(String[] args) {
		Input.readByte("Introdueix la teva edat:");
		Input.readInt("Introduce un número entero:");
		Input.readFloat("Introduce un número, puede llevar decimales (float):");
		Input.readDouble("Introduce un número, puede llevar decimales (double):");
		Input.readChar("Introduce un char:");
		Input.readString("Introduce una string:");
		if (Input.readYesNo("Introduce 's' o 'n':")) {
			System.out.println("acepto");
		} else {
			System.out.println("rechazo");
		}
	}
}
