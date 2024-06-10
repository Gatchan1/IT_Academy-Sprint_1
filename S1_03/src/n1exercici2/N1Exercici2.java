package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N1Exercici2 {
	public static void main(String[] args){
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(13);
		numbers.add(4);
		numbers.add(7);
		numbers.add(10);
		numbers.add(2);
		
		for(int i:numbers) {
			System.out.println(i);
		}
		
		List<Integer> numbersInverted = new ArrayList<Integer>();
		ListIterator<Integer> numbersListIt = numbers.listIterator(numbers.size());
		
		System.out.println("\nIntroduciendo datos en la lista de números en orden inverso:");
		while(numbersListIt.hasPrevious()) {
			int i = numbersListIt.previous();
			System.out.println(i);
			numbersInverted.add(i);
		}
	}
}
