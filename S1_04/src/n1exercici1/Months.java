package n1exercici1;

import java.util.ArrayList;

public class Months {

	public static void main(String[] args) {
		ArrayList<String> months = new ArrayList<String>();
		insertMonths(months);
		System.out.println(months);
	}
	
	static void insertMonths(ArrayList<String> list) {
		list.add("Enero");
		list.add("Febrero");
		list.add("Marzo");
		list.add("Abril");
		list.add("Mayo");
		list.add("Junio");
		list.add("Julio");
		list.add("Agosto");
		list.add("Septiembre");
		list.add("Octubre");
		list.add("Noviembre");
		list.add("Diciembre");
	}

}
