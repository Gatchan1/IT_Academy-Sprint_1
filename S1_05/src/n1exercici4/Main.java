package n1exercici4;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Solo has de introducir un argumento: "
					+ "\nla ruta de un archivo cuyo contenido quieras ver mostrado por consola.");
		} else {
			ListDir.readFile(args[0]);
		}

	}

}
