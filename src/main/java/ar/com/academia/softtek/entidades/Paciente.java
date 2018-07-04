package ar.com.academia.softtek.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="Paciente")
public class Paciente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="Id_Paciente")
	private int nroDeAfiliado;
	
	@Column(name="NombreYApellido")
	private String nombreYApellido;
	
	@Column(name="edad")
	private int edad;
	
	@Column(name="TipoDni")
	private String tipoDNI;
	
	@Column(name="DNI")
	private int DNI;
	
	@Column(name="FechaNacimiento")
	private LocalDate fechaDeNacimiento;
	
	@Column(name="Sexo")
	private String sexo;
	
	@Column(name="TELEFONO")
	private int telefono;

	@Column(name="Direccion")
	private String direccion;
	
	@Column(name="EstadoCivil")
	private String estadoCivil;
	
	@Column(name="CantidadDeHijosACargo")
	private int cantidaDeHijosACargo;
	
	@Column(name="activo")
	private boolean activo;
	
	
	private Paciente paciente;
	/*
	@OneToMany(mappedBy="")
	private List<Paciente> Pacientes;
	*/
	public Paciente() {
		
	}

	public Paciente(int nroDeAfiliado, String nombreYApellido, int edad, String tipoDNI, int dNI,
			LocalDate fechaDeNacimiento, String sexo, int telefono, String direccion, String estadoCivil,
			int cantidaDeHijosACargo, boolean activo, Paciente paciente) {
		this.nroDeAfiliado = nroDeAfiliado;
		this.nombreYApellido = nombreYApellido;
		this.edad = edad;
		this.tipoDNI = tipoDNI;
		DNI = dNI;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sexo = sexo;
		this.telefono = telefono;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.cantidaDeHijosACargo = cantidaDeHijosACargo;
		this.activo = activo;
		this.paciente = paciente;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getNroDeAfiliado() {
		return nroDeAfiliado;
	}

	public void setNroDeAfiliado(int nroDeAfiliado) {
		this.nroDeAfiliado = nroDeAfiliado;
	}

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTipoDNI() {
		return tipoDNI;
	}

	public void setTipoDNI(String tipoDNI) {
		this.tipoDNI = tipoDNI;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getCantidaDeHijosACargo() {
		return cantidaDeHijosACargo;
	}

	public void setCantidaDeHijosACargo(int cantidaDeHijosACargo) {
		this.cantidaDeHijosACargo = cantidaDeHijosACargo;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
