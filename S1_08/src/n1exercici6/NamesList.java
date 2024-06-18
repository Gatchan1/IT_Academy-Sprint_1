package n1exercici6;

import java.util.Arrays;
import java.util.List;

public class NamesList {
	public static List<String> getList() {
		String[] namesArray = {"Alex","Luis","Rigoberto","Andrea","Isa","Leticia","Fernando"};
		List<String> names = Arrays.asList(namesArray);
		return names;
	}
}
