package n1exercici3;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Solo has de introducir un argumento: "
					+ "\nuna ruta de un directorio cuyos contenidos quieras ver listados"
					+ "\n(se recorrerá de forma recursiva, y mostrando información extra)."
					+ "\nEl listado será almacenado en el archivo "+ System.getProperty("user.home")
					+ "\\Documents\\walkFileTree.txt");
		} else {
			ListDir.walk(args[0]);
		}

	}

}
