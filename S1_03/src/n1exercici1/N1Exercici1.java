package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class N1Exercici1 {
	public static void main(String[] args) {
		ArrayList<Month> months = createMonthsArray();
		System.out.println("ArrayList sin agosto: \n"+ months + "\n");
		
		months.add(8, new Month("agosto"));
		System.out.println("ArrayList con agosto: \n"+ months);
		
		HashSet<Month> monthsSet = createHashSet(months);
		monthsSet.add(new Month("agosto"));
		
		System.out.println("\nHashSet iterando con for avanzado:");
		for (Month month:monthsSet) {
			System.out.print(month + ", ");
		}
		
		System.out.println("\n\nHashSet iterando con iterador:");
		Iterator<Month> monthsIt = monthsSet.iterator();
		while(monthsIt.hasNext()) {
			System.out.print(monthsIt.next() + ", ");
		}
	}
	
	static ArrayList<Month> createMonthsArray() {
		ArrayList<Month> months = new ArrayList<Month>();
		months.add(new Month("enero"));
		months.add(new Month("febrero"));
		months.add(new Month("marzo"));
		months.add(new Month("abril"));
		months.add(new Month("mayo"));
		months.add(new Month("junio"));
		months.add(new Month("julio"));
		months.add(new Month("septiembre"));
		months.add(new Month("octubre"));
		months.add(new Month("noviembre"));
		months.add(new Month("diciembre"));
		return months;
	}
	
	static HashSet<Month> createHashSet(ArrayList<Month> months) {
		HashSet<Month> monthsSet = new HashSet<Month>();
		for (Month month : months) {
			monthsSet.add(month);
		}
		return monthsSet;
	}
}
