package n1exercici2;

public class GenericMethods {
	public static <T, U, V> void printItems(T item1, U item2, V item3) {
		System.out.println(item1);
		System.out.println(item2);
		System.out.println(item3);
	}
}
