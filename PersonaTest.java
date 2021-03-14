package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {
	
	Persona p = new Persona("123456789Z", "Pepe", "Villuela");

	@Test
	void testPersonaStringStringString() throws Exception {
		p.setApellido1("Villuela");
		p.setDni("123456789Z");
		p.setNombre("Pepe");
	}

	@Test
	void testGetDni() {
		assertEquals("123456789Z", p.getDni());
	}

	@Test
	void testSetDni() {
		try {
			p.setDni("123456757");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//assertEquals("123456757O", p.getDni());
	
	boolean exclanzada=false;
	try {
		p.setDni("123456757");
	} catch (Exception e) {
		
		exclanzada=true;
		// TODO Auto-generated catch block
	}
		assertTrue(exclanzada);
	}
	
	
	@Test
	void testGetNombre() {
		assertEquals("Pepe", p.getNombre());
	}

	@Test
	void testSetNombre() {
		p.setNombre("Alan");
		assertEquals("Alan", p.getNombre());
	}

	@Test
	void testGetApellido1() {
		p.setNombre("Alan");
		assertEquals("Alan", p.getNombre());
	}

	@Test
	void testSetApellido1() {
		p.setApellido1("Roman");
		assertEquals("Roman", p.getApellido1());
	}

}
