package n1exercici3;

import java.util.Scanner;

public class OutOfBounds {
	public static void chooseColor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu color favorito para jugar al parchís:" + "\n1. amarillo" + "\n2. rojo"
				+ "\n3. verde" + "\n4. azul");
		int indexColor = sc.nextInt();
		getColor(indexColor);
		sc.close();
	}

	public static void getColor(int index) throws ArrayIndexOutOfBoundsException {
		String[] colors = { "amarillo", "rojo", "verde", "azul" };
		String color = colors[index];
		System.out.println("Tu color elegido es el " + color);
	}
}
