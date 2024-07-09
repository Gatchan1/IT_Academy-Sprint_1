package n2exercici1;

import java.util.HashSet;

public class N2Exercici1 {
	public static void main(String[] args) {
		Restaurant restaurant1 = new Restaurant("Burger King", 5);
		Restaurant restaurant2 = new Restaurant("Burger King", 3);
		Restaurant restaurant3 = new Restaurant("Burger King", 3);
		Restaurant restaurant4 = new Restaurant("Tagliatella", 6);
		
		HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
		restaurants.add(restaurant1);
		restaurants.add(restaurant2);
		restaurants.add(restaurant3);
		restaurants.add(restaurant4);
		
		for(Restaurant r:restaurants) {
			System.out.println(r);
		}
	}
}
