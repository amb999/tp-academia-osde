package ar.com.academia.softtek.entidades;

import java.time.LocalDate;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fechaDeNacimiento;

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String apellido, int edad, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	

}