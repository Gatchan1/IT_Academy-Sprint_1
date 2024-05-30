package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class N3Exercici1 {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Editor> editors = new ArrayList<Editor>();

	public static void main(String[] args) {

		boolean exit = false;

		do {
			switch (menu()) {
			case 1:
				createEditor();
				break;
			case 2:
				removeEditor();
				break;
			case 3:
				enterNews();
				break;
			case 4:
				removeNews();
				break;
			case 5:
				showNews();
				break;
			case 6:
				calculateScore();
				break;
			case 7:
				calculatePrice();
				break;
			case 0:
				System.out.println("Gràcies per utilitzar l'aplicació");
				exit = true;
				break;
			}
		} while (!exit);
	}

	public static byte menu() {

		byte option;
		final byte MIN = 0;
		final byte MAX = 7;

		do {
			System.out.println("\nMENú PRINCIPAL\n"
					+ "1. Introducir redactor.\n"
					+ "2. Eliminar redactor.\n"
					+ "3. Introducir noticia a un redactor.\n"
					+ "4. Eliminar noticia.\n"
					+ "5. Mostrar todas las noticias de un redactor.\n"
					+ "6. Calcular puntuación de una noticia.\n"
					+ "7. Calcular precio de una noticia.\n"
					+ "0. Sortir de l'aplicació.\n");
			option = input.nextByte();
			input.nextLine();
			if (option < MIN || option > MAX) {
				System.out.println("Escull una opció vàlida");
			}
		} while (option < MIN || option > MAX);
		return option;
	}

	public static void createEditor() {
		System.out.println("Introduce el DNI del redactor:");
		String dni = input.nextLine();
		
		if (findEditor(dni)==null) {
			System.out.println("Introduce el nombre del redactor:");
			String name = input.nextLine();
			editors.add(new Editor(dni, name));
			System.out.println("Redactor creado satisfactoriamente.");
		} else {
			System.out.println("Ya existe un redactor con ese DNI.");
		}
	}
	
	public static Editor findEditor(String dni) {
		Editor foundEditor = null;
		for(int i = 0; i < editors.size() && foundEditor == null; i++) {
			if(dni.equals(editors.get(i).getDNI())) {
				foundEditor = editors.get(i);
			}
		}
		return foundEditor;
	}

	public static void removeEditor() {
		System.out.println("Introduce el DNI del redactor:");
		String dni = input.nextLine();
		
		Editor foundEditor = findEditor(dni);
		if (foundEditor!=null) {
			editors.remove(foundEditor);
			System.out.println("Redactor eliminado satisfactoriamente.");
		} else {
			System.out.println("No existe un redactor con ese DNI.");
		}
	}

	public static void enterNews() {
		News newNews = null;
		
		System.out.println("¿Qué deporte trata la noticia? Introduce el número que corresponda:\n"
				+ "1. Fútbol\n"
				+ "2. Básquet\n"
				+ "3. Tenis\n"
				+ "4. F1\n"
				+ "5. Motociclismo");
		int sport = input.nextInt();
		input.nextLine();
		
		switch(sport) {
		case 1:
			newNews = createSoccerNews();
			break;
		case 2:
			newNews = createBasketNews();
			break;
		case 3:
			newNews = createTennisNews();
			break;
		case 4:
			newNews = createF1News();
			break;
		case 5:
			newNews = createMotorcyclingNews();
			break;
		default:
			System.out.println("La opción introducida no es válida.");
		}
		
		if (newNews != null) {
			System.out.println("Introduce el DNI del redactor que se va a encargar de esta noticia:");
			String dni = input.nextLine();
			Editor foundEditor = findEditor(dni);
			if (foundEditor != null) {
				foundEditor.addNews(newNews);
				System.out.println("Noticia asignada satisfactoriamente.");
			} else {
				System.out.println("No se ha encontrado ningún redactor con el dni introducido.");
			}
		}
	}
	
	public static NewsSoccer createSoccerNews() {
		System.out.println("Introduce el titular de la noticia:");
		String headline = input.nextLine();
		System.out.println("Introduce la competición a la que se hace referencia:");
		String competition = input.nextLine();
		System.out.println("Introduce el club al que se hace referencia:");
		String club = input.nextLine();
		System.out.println("Introduce el jugador al que se hace referencia:");
		String player = input.nextLine();
		return new NewsSoccer(headline, competition, club, player);
	}
	
	public static NewsBasket createBasketNews() {
		System.out.println("Introduce el titular de la noticia:");
		String headline = input.nextLine();
		System.out.println("Introduce la competición a la que se hace referencia:");
		String competition = input.nextLine();
		System.out.println("Introduce el club al que se hace referencia:");
		String club = input.nextLine();
		return new NewsBasket(headline, competition, club);
	}
	
	public static NewsTennis createTennisNews() {
		System.out.println("Introduce el titular de la noticia:");
		String headline = input.nextLine();
		System.out.println("Introduce la competición a la que se hace referencia:");
		String competition = input.nextLine();
		System.out.println("Introduce los tenistas a los que se hace referencia:");
		String players = input.nextLine();
		return new NewsTennis(headline, competition, players);
	}
	
	public static NewsF1 createF1News() {
		System.out.println("Introduce el titular de la noticia:");
		String headline = input.nextLine();
		System.out.println("Introduce la escudería a la que se hace referencia:");
		String squad = input.nextLine();
		return new NewsF1(headline, squad);
	}
	
	public static NewsMotorcycling createMotorcyclingNews() {
		System.out.println("Introduce el titular de la noticia:");
		String headline = input.nextLine();
		System.out.println("Introduce el equipo a la que se hace referencia:");
		String team = input.nextLine();
		return new NewsMotorcycling(headline, team);
	}

	public static void removeNews() {
		System.out.println("Introduce el DNI del redactor responsable de esta noticia:");
		String dni = input.nextLine();
		Editor foundEditor = findEditor(dni);
		if (foundEditor!=null) {
			System.out.println("Introduce el titular de la noticia:");
			String headline = input.nextLine();
			News foundNews = findNews(headline, foundEditor.getNews());
			if (foundNews != null) {
				foundEditor.removeNews(foundNews);
				System.out.println("Noticia eliminada satisfactoriamente.");
			} else {
				System.out.println("No se ha encontrado una noticia con ese titular.");
			}
		} else {
			System.out.println("No existe un redactor con ese DNI.");
		}
	}
	
	public static News findNews(String titular, ArrayList<News> newsArray) {
		News foundNews = null;
		for(int i = 0; i < newsArray.size() && foundNews == null; i++) {
			if (titular.equals(newsArray.get(i).getHeadline())) {
				foundNews = newsArray.get(i);
			}
		}
		return foundNews;
	}

	public static void showNews() {
		System.out.println("Introduce el DNI del redactor:");
		String dni = input.nextLine();
		
		Editor foundEditor = findEditor(dni);
		if (foundEditor!=null) {
			for(News news : foundEditor.getNews()) {
				System.out.println(news);
			}
		} else {
			System.out.println("No existe un redactor con ese DNI.");
		}
	}

	public static void calculateScore() {
		System.out.println("Introduce el DNI del redactor responsable de esta noticia:");
		String dni = input.nextLine();
		Editor foundEditor = findEditor(dni);
		if (foundEditor!=null) {
			System.out.println("Introduce el titular de la noticia:");
			String headline = input.nextLine();
			News foundNews = findNews(headline, foundEditor.getNews());
			if (foundNews != null) {
				foundNews.calculateNewsScore();
				System.out.println("La puntuación de esta noticia es "+foundNews.getScore());
			} else {
				System.out.println("No se ha encontrado una noticia con ese titular.");
			}
		} else {
			System.out.println("No existe un redactor con ese DNI.");
		}
	}

	public static void calculatePrice() {
		System.out.println("Introduce el DNI del redactor responsable de esta noticia:");
		String dni = input.nextLine();
		Editor foundEditor = findEditor(dni);
		if (foundEditor!=null) {
			System.out.println("Introduce el titular de la noticia:");
			String headline = input.nextLine();
			News foundNews = findNews(headline, foundEditor.getNews());
			if (foundNews != null) {
				foundNews.calculateNewsPrice();
				System.out.println("El precio de esta noticia es de "+foundNews.getPrice()+"€.");
			} else {
				System.out.println("No se ha encontrado una noticia con ese titular.");
			}
		} else {
			System.out.println("No existe un redactor con ese DNI.");
		}
	}

}
