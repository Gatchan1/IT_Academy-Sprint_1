package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class MonthsTest {
	ArrayList<String> months;
	
	@BeforeEach
	void setUp() {
		months = new ArrayList<String>();
		Months.insertMonths(months);
	}

	@Test
	void testNumberPositions() {
		assertEquals(12, months.size());
	}
	
	@Test
	void testNotNull() {
		assertNotNull(months);
	}
	
	@Test
	void testAugustPosition() {
		assertTrue(months.get(7).equals("Agosto"));
	}

}
