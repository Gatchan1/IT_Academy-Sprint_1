package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	static Scanner sc = new Scanner(System.in);

	// capturing InputMismatchException class exceptions:
	public static byte readByte(String missatge) {
		byte reading = 0;
		boolean askUser = true;
		while (askUser) {
			try {
				System.out.println(missatge);
				reading = sc.nextByte();
				sc.nextLine();
				askUser = false;
			} catch (InputMismatchException e) {
				System.out.println("Error en la introducción del dato.");
				sc.nextLine();
			}
		}
		return reading;
	}

	public static int readInt(String missatge) {
		int reading = 0;
		boolean askUser = true;
		while (askUser) {
			try {
				System.out.println(missatge);
				reading = sc.nextInt();
				sc.nextLine();
				askUser = false;
			} catch (InputMismatchException e) {
				System.out.println("Error en la introducción del dato.");
				sc.nextLine();
			}
		}
		return reading;
	}

	public static float readFloat(String message) {
		float reading = 0;
		boolean askUser = true;
		while (askUser) {
			try {
				System.out.println(message);
				reading = sc.nextFloat();
				sc.nextLine();
				askUser = false;
			} catch (InputMismatchException e) {
				System.out.println("Error en la introducción del dato.");
				sc.nextLine();
			}
		}
		return reading;
	}

	public static double readDouble(String message) {
		double reading = 0;
		boolean askUser = true;
		while (askUser) {
			try {
				System.out.println(message);
				reading = sc.nextDouble();
				sc.nextLine();
				askUser = false;
			} catch (InputMismatchException e) {
				System.out.println("Error en la introducción del dato.");
				sc.nextLine();
			}
		}
		return reading;
	}

	// capturing WrongFormatException class exceptions:
	public static char readChar(String message) {
		char result = 'a';
		String reading;
		boolean askUser = true;
		while (askUser) {
			try {
				System.out.println(message);
				reading = sc.nextLine();
				if (reading.length() == 1) {
					result = reading.charAt(0);
					askUser = false;					
				} else {
					throw new WrongFormatException("Ha de introducirse un solo caracter.");
				}
			} catch (WrongFormatException e) {
				System.out.println(e.getMessage());
			}
		}
		return result;
	}

	public static String readString(String message) {
		String reading = "a";
		boolean askUser = true;
		while (askUser) {
			try {
				System.out.println(message);
				reading = sc.nextLine();
				askUser = false;
			} catch (RuntimeException e) {
				System.out.println("Error en la introducción del dato.");
			}
		}
		return reading;
	}

	public static boolean readYesNo(String message) {
		String reading;
		boolean result = false;
		boolean askUser = true;
		while (askUser) {
			try {
				reading = readString(message);
				if (reading.equalsIgnoreCase("s")) {
					result = true;
					askUser = false;
				} else if (reading.equalsIgnoreCase("n")){
					askUser = false;
				} else {
					throw new WrongFormatException("Caracter no válido.");
				}
			} catch (WrongFormatException e) {
				System.out.println(e.getMessage());
			}
		}
		return result;
	}
}
