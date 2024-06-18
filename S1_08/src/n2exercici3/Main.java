package n2exercici3;

public class Main {

	public static void main(String[] args) {
		Operator sum = (num1, num2) -> num1 + num2;
		Operator subtract = (num1, num2) -> num1 - num2;
		Operator multiply = (num1, num2) -> num1 * num2;
		Operator divide = (num1, num2) -> (float)num1 / num2;

		System.out.println("Sum: " + sum.operation(6,4));
		System.out.println("Subtract: " + subtract.operation(6,4));
		System.out.println("Multiply: " + multiply.operation(6,4));
		System.out.println("Divide: " + divide.operation(6,4));
	}

}
