package n2exercici2;

public class GenericMethods {
	public static <T> void printItems(T... items) {
		for(T item: items) {
			System.out.println(item);
		}
	}
}
