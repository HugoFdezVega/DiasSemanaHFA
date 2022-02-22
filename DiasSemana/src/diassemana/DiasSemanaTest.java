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
		assertEquals("ERROR: número incorrecto.",0);
		assertEquals("El día seleccionado es LUNES",1);
		assertEquals("El día seleccionado es MARTES",2);
		assertEquals("El día seleccionado es MIÉRCOLES",3);
		assertEquals("El día seleccionado es JUEVES",4);
		assertEquals("El día seleccionado es VIERNES",5);
		assertEquals("El día seleccionado es SÁBADO",6);
		assertEquals("El día seleccionado es DOMINGO",7);
		assertEquals("ERROR: número incorrecto.",8);
		
	}

}
