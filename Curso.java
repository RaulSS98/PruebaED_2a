package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raul Santamaria
 * Documentada clase Curso
 */
public class Curso {
	
	/**
	 * creamos una lista
	 */
	private List<Persona> listaAlumnos;

	
	/**
	 * @param dni
	 * @throws Exception
	 * aqui comprueba si el formato del dni introducido es el correcto
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	
	/**
	 * @param p
	 * añade una persona a la lista
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	
	/**
	 * @param dni
	 * @return
	 * comprueba si el dni de la persona ya existe en la lista
	 * en ese caso no dejara introducirlo
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	
	/**
	 * creamos un nuevo arraylist a partir de la lista que habiamos creado ya
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	
	/**
	 * @return
	 * devuelve el numero de alumnos que hay 
	 */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	/**
	 * muestra la persona de la lista
	 */
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
