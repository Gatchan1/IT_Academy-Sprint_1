package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class MonthsTest {

	@Test
	void testNumberPositions() {
		ArrayList<String> months = new ArrayList<String>();
		Months.insertMonths(months);
		assertEquals(12, months.size());
	}
	
	@Test
	void testNotNull() {
		ArrayList<String> months = new ArrayList<String>();
		Months.insertMonths(months);
		assertNotNull(months);
	}
	
	@Test
	void testAugustPosition() {
		ArrayList<String> months = new ArrayList<String>();
		Months.insertMonths(months);
		assertTrue(months.get(7).equals("Agosto"));
	}

}
