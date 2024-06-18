package n2exercici4;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] strArray = { "Alex", "Ada", "34", "Andrea", "5", "23", "Fernanda" };
		List<String> strings = Arrays.asList(strArray);

		strings.sort((str1, str2) -> str1.charAt(0) - str2.charAt(0));

		System.out.println("Alfabèticament pel primer caràcter:");
		strings.forEach(System.out::println);

		strings.sort((str1, str2) -> {
			if (str1.contains("e")) {
				return -1;
			}
			return 0;
		});
		System.out.println("\nLes cadenes que contenen una \"e\" primer, la resta de cadenes després:");
		strings.forEach(System.out::println);

		System.out.println(
				"\nModifica tots els elements de la llista que tenen una ‘a’." + " Modifica la ‘a’ per un ‘4’.");
		strings = strings.stream().map(str1 -> str1.replace("a", "4")).toList();
		strings.forEach(System.out::println);

		System.out.println("\nMostra només els elements que són numèrics.");
		strings.stream().filter(str -> str.matches("-?[0-9]+")).forEach(System.out::println);
	}

}
