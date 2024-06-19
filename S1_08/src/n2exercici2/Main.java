package n2exercici2;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int[] numsArray = { 2, 23, 44, 5, 10, 8 };
		List<Integer> numbers = Arrays.stream(numsArray).boxed().toList();

		eONumbers(numbers).forEach(System.out::println);
	}

	private static List<String> eONumbers(List<Integer> nums) {
		List<String> str = nums.stream().map(num -> {
			char ch = num % 2 == 0 ? 'e' : 'o';
			return ch + String.valueOf(num);
		}).toList();
		return str;
	}

}
