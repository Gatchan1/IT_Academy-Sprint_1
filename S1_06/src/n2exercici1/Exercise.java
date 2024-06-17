package n2exercici1;

import n1exercici2.Person;

public class Exercise {
	public static void main(String[] args) {
		Person person1 = new Person("Jose", "Arbizu", 34);
		
		GenericMethods.printItems(231, person1, "esto tiene que ser una String");		
	}
}
