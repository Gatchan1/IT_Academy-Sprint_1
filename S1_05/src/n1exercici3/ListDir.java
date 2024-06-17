package n1exercici3;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.stream.Stream;

public class ListDir extends SimpleFileVisitor<Path> {
	private static String fileNameWrite = System.getProperty("user.home") + "/Documents/walkFileTree.txt";

	// (Esto era del ejercicio 1)
	public static void list(String dirPath) {
		Path dir = Paths.get(dirPath);

		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
			for (Path file : stream) {
				System.out.println(file.getFileName());
			}
		} catch (IOException | DirectoryIteratorException x) {
			System.err.println(x);
		}
	}

	// Ejercicio 3
	private static void writeToFile(String str) {
		try(FileWriter writer = new FileWriter(fileNameWrite, true)) {
			writer.write(str);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	// Ejercicio 3 (modificado a partir del ejercicio 2)
	public static void walk(String dirPath) {
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		try (Stream<Path> filepath = Files.walk(Paths.get(dirPath))) {
			filepath.forEach(path -> {
				if (path.toFile().isDirectory()) {
					writeToFile("(D) ");
				} else if (path.toFile().isFile()) {
					writeToFile("(F) ");
				}
				writeToFile("" + path + " " + sdf.format(path.toFile().lastModified()) + "\n");
			});
		} catch (IOException e) {
			System.out.println("Directory Not Present!");
		}
	}
}
