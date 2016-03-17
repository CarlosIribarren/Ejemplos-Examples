package es.eurohelp.cursos.springmvc.beans;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.validation.annotation.Validated;

/*
 * NotEmpty to Integer is not a valid type for it to check. It's for Strings and collections. 
 * If you just want to make sure an Integer has some value, javax.validation.constraints.NotNull 
 * is all you need.
 */

public class Estudiante {

	private Integer id;
	
	@NotEmpty	//Nombre no puede ser vacio
	private String nombre;
	
	@NotNull	//Edad no puede ser null/vacio
	@Range(min = 1, max = 150) //Edad entre 1 y 150
	private Integer edad;

	//Cuando se quiere validar en las sub-clases.
	@Valid
	private Resultado resultado;

	
	
	public Estudiante() {
		resultado = new Resultado();
	}
	
	
	
	

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}



	 
	   
	   
	
	
	   
}
