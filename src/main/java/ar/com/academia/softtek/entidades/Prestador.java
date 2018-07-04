package ar.com.academia.softtek.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="Prestador")
public class Prestador implements Serializable{

	@Id
	@Column(name="IdPrestador",unique = true)
	private int idPrestador;
	
	@Column(name="NombreYApellido")
	private String nombreYApellido;
	
	@Column(name="Filial")
	private String filial;
	
	@Column(name="Especialidad")
	private String especialidad;
	
	@Column(name="Domicilio")
	private String domicilio;
	
	@Column(name="Localidad")
	private String localidad;
	
	@Column(name="Telefono")
	private int telefono;
	
	@OneToOne(cascade = { CascadeType.ALL})
	@JoinColumn(name="Codigo")
	private Practica practica;
	

	public Prestador() {
	}

	public Prestador(int idPrestador, String nombreYApellido, String filial, String especialidad, String domicilio,
			String localidad, int telefono) {
		this.idPrestador = idPrestador;
		this.nombreYApellido = nombreYApellido;
		this.filial = filial;
		this.especialidad = especialidad;
		this.domicilio = domicilio;
		this.localidad = localidad;
		this.telefono = telefono;
	}

	public int getIdPrestador() {
		return idPrestador;
	}

	public void setIdPrestador(int idPrestador) {
		this.idPrestador = idPrestador;
	}

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	

	public Practica getPractica() {
		return practica;
	}

	public void setPractica(Practica practica) {
		this.practica = practica;
	}

	@Override
	public String toString() {
		return "Prestador [idPrestador=" + idPrestador + ", nombreYApellido=" + nombreYApellido + ", filial=" + filial
				+ ", especialidad=" + especialidad + ", domicilio=" + domicilio + ", localidad=" + localidad
				+ ", telefono=" + telefono + ", practica=" + practica + "]";
	}
	
	
	
}
