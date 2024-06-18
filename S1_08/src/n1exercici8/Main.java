package n1exercici8;

public class Main {

	public static void main(String[] args) {
		Reverter reverter1 =  str -> new StringBuilder(str).reverse().toString();
		
		System.out.println(reverter1.reverse("viva"));
		System.out.println(reverter1.reverse("zorglub"));

	}

}
