package n3exercici1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class N3Exercici1 {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Person> persons = parseCsvToPersonArray("c:/Users/grake/OneDrive/Escritorio/personas.csv");

	public static void main(String[] args) {
		boolean sortir = false;

		do {
			switch (menu()) {
			case 1:
				inputPerson();
				break;
			case 2:
				sortAndPrint(Person.compareByName());
				break;
			case 3:
				sortAndPrint(Collections.reverseOrder(Person.compareByName()));
				break;
			case 4:
				sortAndPrint(Person.compareBySurname());
				break;
			case 5:
				sortAndPrint(Collections.reverseOrder(Person.compareBySurname()));
				break;
			case 6:
				sortAndPrint(Person.compareByDni());
				break;
			case 7:
				sortAndPrint(Collections.reverseOrder(Person.compareByDni()));
				break;
			case 0:
				System.out.println("Gràcies per utilitzar l'aplicació");
				sortir = true;
				break;
			}
		} while (!sortir);
	}

	public static byte menu() {
		byte option;
		final byte min = 0;
		final byte max = 7;

		do {
			System.out.println("\nMENÚ PRINCIPAL" + "\n1. Introducir persona."
					+ "\n2. Mostrar las personas ordenadas por nombre (A-Z)."
					+ "\n3. Mostrar las personas ordenadas por nombre (Z-A)."
					+ "\n4. Mostrar las personas ordenadas por apellido (A-Z)."
					+ "\n5. Mostrar las personas ordenadas por apellido (Z-A)."
					+ "\n6. Mostrar las personas ordenadas por DNI (1-9)."
					+ "\n7. Mostrar las personas ordenadas por DNI (9-1)." + "\n0. Salir de la aplicación.\n");
			option = input.nextByte();
			input.nextLine();
			if (option < min || option > max) {
				System.out.println("Escoge una opción válida.");
			}
		} while (option < min || option > max);
		return option;
	}

	static void inputPerson() {
		System.out.println("Introduce el nombre de la persona:");
		String name = input.nextLine();
		System.out.println("Introduce su apellido:");
		String surname = input.nextLine();
		System.out.println("Introduce su DNI:");
		String dni = input.nextLine();
		Person newPerson = new Person(name, surname, dni);
		try {
			for (Person p : persons) {
				if (p.equals(newPerson)) {
					throw new ExceptionSameDni("Ya existe una persona en el sistema con el DNI introducido.");
				}
			}
			persons.add(newPerson);
			System.out.println("Persona añadida exitosamente.");
		} catch (ExceptionSameDni e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void sortAndPrint(Comparator<Person> comparator) {
		persons.sort(comparator);

		System.out.println("___Nom___ _____Cognoms_____ ___NIF___ ");
		for (Person p : persons) {
			System.out.println(formatPerson(p));
		}
	}

	static ArrayList<Person> parseCsvToPersonArray(String filePath) {
		ArrayList<Person> persons = new ArrayList<Person>();
		try (BufferedReader myBuffer = new BufferedReader(new FileReader(filePath))) {

			String line = myBuffer.readLine();
			while (line != null) {
				String[] person = line.split(",");
				persons.add(new Person(person[0], person[1], person[2]));
				line = myBuffer.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		return persons;
	}
	
	static String formatPerson(Person person) {
		String name = person.getName();
		int nameLength = name.length();
		String surname = person.getSurname();
		int surnameLength = surname.length();
		String dni = person.getDni();
		char space = ' ';
		for (int i = 0; i < (9 - nameLength); i++) {
			name += space;
		}
		for (int i = 0; i < (17 - surnameLength); i++) {
			surname += space;
		}
		return name + " " + surname + " " + dni;
	}
}