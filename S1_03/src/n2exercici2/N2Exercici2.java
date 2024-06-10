package n2exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

import n2exercici1.Restaurant;

public class N2Exercici2 {
	public static void main(String[] args) {
		ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
		
		restaurants.add(new Restaurant("Burger King", 5));		
		restaurants.add(new Restaurant("Tagliatella", 5));		
		restaurants.add(new Restaurant("Burger King", 4));	
		restaurants.add(new Restaurant("Burger King", 3));	
		restaurants.add(new Restaurant("Burger King", 3));		
		restaurants.add(new Restaurant("Tagliatella", 6));		
		
		for(Restaurant r:restaurants) {
			System.out.println(r);
		}
		
		restaurants.sort(Collections.reverseOrder());
		
		System.out.println("\nAfter sorting:");
		for(Restaurant r:restaurants) {
			System.out.println(r);
		}
		
		System.out.println("\nAfter creating a linked set:");
		LinkedHashSet<Restaurant> restaurantsSet = createOrderedSet(restaurants);
		for(Restaurant r: restaurantsSet) {
			System.out.println(r);
		}
	}
	
	static LinkedHashSet<Restaurant> createOrderedSet(ArrayList<Restaurant> restaurants){
		LinkedHashSet<Restaurant> restaurantsSet = new LinkedHashSet<Restaurant>();
		for(Restaurant r:restaurants) {
			restaurantsSet.add(r);
		}
		return restaurantsSet;
	}
}
