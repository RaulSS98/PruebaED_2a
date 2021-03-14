package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	Curso c = new Curso();
	
	@Test
	void testEliminarAlumno() {
		boolean lanzaExcepcion=false;
		try {
			c.eliminarAlumno("123456789");
		} catch (Exception e) {
			lanzaExcepcion=true;
		}
		assertFalse(lanzaExcepcion);
		
		try {
			c.eliminarAlumno("123456");
		} catch (Exception e) {
			lanzaExcepcion=true;
		}
		
		assertFalse(lanzaExcepcion);
	}

	@Test
	void testAniadirAlumno() {
		Persona p = new Persona("123456789Z", "Pepe", "Villuela");
		int sizeBefore=c.numeroAlumnos();
		c.aniadirAlumno(p);
		int sizeAfter=c.numeroAlumnos();
		
		assertEquals(sizeBefore, sizeAfter);
	}

	@Test
	void testEstaRegistrado() {
		fail("Not yet implemented");
	}

	@Test
	void testCurso() {
		Persona p = new Persona("123456734R", "Pepe", "Villuela");
		Persona p1 = new Persona("167456789Z", "Juan", "Covos");
		Persona p2 = new Persona("123487889Z", "Luis", "Rivera");
		
		c.aniadirAlumno(p);
		c.aniadirAlumno(p1);
		c.aniadirAlumno(p2);
		
		int numAlumCurso = c.numeroAlumnos();
	}

	@Test
	void testNumeroAlumnos() {
		Persona p = new Persona("123456789Z", "Pepe", "Villuela");
		int numAlumAnt = c.numeroAlumnos();
		c.aniadirAlumno(p);
		int numAlumDesp = c.numeroAlumnos();
		
		assertEquals(numAlumAnt, numAlumDesp -1);
	}

}
