package n1exercici1;

import java.util.Objects;

public class Month {
	private String name;
	
	public Month(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Month otherMonth = (Month) obj;
		return name.equals(otherMonth.name);
	}

	@Override
	public String toString() {
		return "Month " + name;
	}
	
	
}
