package n2exercici1;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class Exercise {

	public static void main(String[] args) {
		Person person = new Person("Raquel", "Barrio");
		String folder;

		Class<Person> personClass = Person.class;

		try {
			JsonSerializable jsonAnnotation = personClass.getAnnotation(JsonSerializable.class);
			folder = jsonAnnotation.jsonFolder();
			FileWriter writer = new FileWriter(folder + "json.json");
			Gson gson = new Gson();
			gson.toJson(person, writer);
			writer.close();
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
	}
}
