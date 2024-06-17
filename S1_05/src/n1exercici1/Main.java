package n1exercici1;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Solo has de introducir un argumento: "
					+ "\nuna ruta de un directorio cuyos contenidos quieras ver listados.");
		} else {
			ListDir.list(args[0]);
		}
	}

}
