package n1exercici2;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.stream.Stream;

public class ListDir {
	
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
	
	//Exercici 2
	public static void walk(String dirPath) {
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		try (Stream<Path> filepath = Files.walk(Paths.get(dirPath)))
		{
			filepath.forEach(path -> {
				if (path.toFile().isDirectory()) {
					System.out.print("(D) ");
				} else if (path.toFile().isFile()) {
					System.out.print("(F) ");
				}
				System.out.println("" + path + " " + sdf.format(path.toFile().lastModified()));
			});
		}
		catch (IOException e) {
			System.out.println("Directory Not Present!");
		}
	}
}
