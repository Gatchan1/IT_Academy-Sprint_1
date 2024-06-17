package n1exercici2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculateDniTest {

	@ParameterizedTest
	@CsvSource({
		"12345678, Z",
		"71452761, H",
		"00000000, T",
		"00000001, R",
		"12222222, E",
		"10000000, Z",
		"99999999, R",
		"70849298, Y",
		"9848413, C",
		"72930012, W"
	})
	void testCorrectResults(int number, char letter) {
		Assertions.assertEquals(letter, CalculateDni.calculateDni(number));
	}

}
