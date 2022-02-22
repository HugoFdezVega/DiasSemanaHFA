/**
 * 
 */
package diassemana;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Hugo
 *Comprobamos el funcionamiento del test
 */
class DiasSemanaTest {

	@Test
	void test() {
		assertEquals("ERROR: n�mero incorrecto.",0);
		assertEquals("El d�a seleccionado es LUNES",1);
		assertEquals("El d�a seleccionado es MARTES",2);
		assertEquals("El d�a seleccionado es MI�RCOLES",3);
		assertEquals("El d�a seleccionado es JUEVES",4);
		assertEquals("El d�a seleccionado es VIERNES",5);
		assertEquals("El d�a seleccionado es S�BADO",6);
		assertEquals("El d�a seleccionado es DOMINGO",7);
		assertEquals("ERROR: n�mero incorrecto.",8);
		
	}

}
