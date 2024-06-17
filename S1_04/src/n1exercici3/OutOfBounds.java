package n1exercici3;

public class OutOfBounds {

	public static int exceptionThrower() throws ArrayIndexOutOfBoundsException {
		//throw new ArrayIndexOutOfBoundsException();
		int[] numbers = {1, 2};
		return numbers[2];
	}
}
