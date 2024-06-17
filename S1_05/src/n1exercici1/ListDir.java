package n1exercici1;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.StreamSupport;

public class ListDir {
	public static void list(String dirPath) {
		Path dir = Paths.get(dirPath);
		
		try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(dir)) {
			StreamSupport.stream(dirStream.spliterator(), false)
			.sorted()
			.forEach(path -> System.out.println(path.getFileName()));
		} catch (IOException | DirectoryIteratorException x) {
		    System.err.println(x);
		}
	}
}
