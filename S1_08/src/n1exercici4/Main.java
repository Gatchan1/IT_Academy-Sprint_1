package n1exercici4;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		String[] monthsStatic = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" };
		List<String> months = Arrays.asList(monthsStatic);

		months.forEach(System.out::println);
	}
}
