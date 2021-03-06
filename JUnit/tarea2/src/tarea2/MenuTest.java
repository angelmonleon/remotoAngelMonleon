package tarea2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MenuTest {

	@ParameterizedTest
	@CsvSource({"5","2","3","4"})
	
	void testSeleccionaMenu(int opc) {
		Menu mn = new Menu();
		String resultado = mn.SeleccionaMenu(opc);
		assertTrue(opc>0 && opc<5, "Error. Solo numeros entre 1 y 4");
	}

}
