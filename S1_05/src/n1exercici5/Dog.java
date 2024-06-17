package n1exercici5;

import java.io.Serializable;

public class Dog implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int years;
	
	public Dog(String name, int years) {
		this.name = name;
		this.years = years;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", years=" + years + "]";
	}
}
