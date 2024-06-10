package n3exercici1;

import java.util.Comparator;
import java.util.Objects;

public class Person {
	private String name;
	private String surname;
	private String dni;

	public Person(String name, String surname, String dni) {
		this.name = name;
		this.surname = surname;
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getDni() {
		return dni;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", dni=" + dni + "]";
	}

	public static Comparator<Person> compareByName() {
		return new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
	}

	public static Comparator<Person> compareBySurname() {
		return new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getSurname().compareTo(o2.getSurname());
			}
		};
	}
	
	public static Comparator<Person> compareByDni() {
		return new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getDni().compareTo(o2.getDni());
			}
		};
	}
}
