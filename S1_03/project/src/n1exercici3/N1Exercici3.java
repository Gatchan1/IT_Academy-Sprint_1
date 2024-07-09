package n1exercici3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class N1Exercici3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		String homeDir = System.getProperty("user.home");
		capitalCities = readToHashMap(homeDir + "/Documents/countries.txt");

		if (capitalCities.size() != 0) {
			String result = runCountriesGame(capitalCities);
			System.out.println("This is your score: " + result);
			writeToFile(homeDir + "/Documents/game_results.txt", result);
		} else {
			System.out.println("There is no available countries data.");
		}
	}

	private static HashMap<String, String> readToHashMap(String filePath) {
		HashMap<String, String> pairs = new HashMap<String, String>();

		try {
			FileReader reader = new FileReader(filePath);
			BufferedReader myBuffer = new BufferedReader(reader);

			String line = myBuffer.readLine();
			while (line != null) {
				String[] pair = line.split(" ");
				if (pair.length == 2) {
					pairs.put(pair[0], pair[1]);
				}
				line = myBuffer.readLine();
			}
			myBuffer.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		return pairs;
	}

	private static String runCountriesGame(HashMap<String, String> capitalCities) {
		int numCountries = capitalCities.size();
		String[] countries = capitalCities.keySet().toArray(new String[numCountries]);

		System.out.println("Please enter your name:");
		String name = sc.nextLine();
		int points = 0;

		for (int i = 1; i <= 10; i++) {
			int randomIndex = (int) Math.floor(Math.random() * numCountries);
			//System.out.println("answer is " + capitalCities.get(countries[randomIndex]));
			System.out.println("Question number " + i + ": Enter the capital city of " + countries[randomIndex] + ":");
			String answer = sc.nextLine();
			if (answer.equals(capitalCities.get(countries[randomIndex]))) {
				points++;
				System.out.println("Good!");
			} else {
				System.out.println("Not sure about that...");
			}
		}
		return (name + " " + points);
	}

	private static void writeToFile(String filePath, String line) {
		try {
			FileWriter writer = new FileWriter(filePath, true);
			writer.write(line + "\n");
			writer.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
