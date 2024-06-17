package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OutOfBoundsTest {

	@Test
	void exceptionTesting() {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> OutOfBounds.exceptionThrower());
	}

}
