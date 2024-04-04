package Esercizio.S5L3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class S5L3ApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void testSomma() {
		int risultato = 2 + 2;
		assertEquals(4, risultato);
	}
	@Test
	void testConfrontoStringhe() {
		String stringa1 = "ciao";
		String stringa2 = "ciao";
		assertEquals(stringa1, stringa2);
	}


	@Test
	void testLunghezzaStringa() {
		String stringa = "Hello, world!";
		assertEquals(13, stringa.length());
	}

	@Test
	void testOrdinamentoLista() {
		int[] lista = {1, 2, 3, 4, 5};
		for (int i = 0; i < lista.length - 1; i++) {
			assertTrue(lista[i] < lista[i + 1]);
		}
	}


	@ParameterizedTest
	@CsvSource({"1, 2, 3", "-1, 1, 0", "1, 1, 2"})
	void testSommaParametrico(int num1, int num2, int risultatoAtteso) {
		int risultato = num1 + num2;
		assertEquals(risultatoAtteso, risultato);
	}

}
