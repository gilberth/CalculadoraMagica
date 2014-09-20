package pe.edu.ulima.calculadoramagia.model;

import java.util.ArrayList;
import java.util.List;

public class GestorAlumnos {
	
	public static List<Alumno> dameAlumnos(){
		
		List<Alumno> alumnos = new ArrayList<Alumno>();
		
		Alumno alumno = new Alumno();
		alumno.setCodigo("20070283");
		alumno.setNombre("Gilberth Cordova");
		alumnos.add(alumno);
		
		alumno = new Alumno();
		alumno.setCodigo("20080870");
		alumno.setNombre("Gianina Rivera");
		alumnos.add(alumno);
		
		
		return alumnos;
		
	}

}
