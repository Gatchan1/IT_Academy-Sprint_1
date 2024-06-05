package n1exercici1;

import java.util.ArrayList;

public class Purchase {
	private ArrayList<Product> products;
	private double totalPrice;
	
	public Purchase() {
		this.products = new ArrayList<Product>();
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}

	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void calculateTotalPrice() {
		try {
			if (products.size() == 0) {
				throw new EmptyPurchaseException("Per fer una venda primer has d’afegir productes");
			} else {
				double sum = 0;
				for(Product p : products) {
					sum += p.getPrice();
				}
				totalPrice = sum;
			}
		}
		catch(EmptyPurchaseException exception) {
			System.out.println(exception.getMessage());
		}
	}
}
