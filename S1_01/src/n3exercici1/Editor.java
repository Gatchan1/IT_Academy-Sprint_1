package n3exercici1;

import java.util.ArrayList;

public class Editor {
	private final String DNI;
	private String name;
	private static int wage = 1500;
	private ArrayList<News> news;

	public Editor(String DNI, String name) {
		this.DNI = DNI;
		this.name = name;
		news = new ArrayList<News>();
	}

	public String getDNI() {
		return DNI;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getWage() {
		return wage;
	}

	public static void setWage(int wage) {
		Editor.wage = wage;
	}
	
	public ArrayList<News> getNews() {
		return news;
	}
	
	public void addNews(News newNews) {
		news.add(newNews);
	}
	
	public void removeNews(News NewsToDelete) {
		news.remove(NewsToDelete);
	}

}
