package ar.com.academia.softtek.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Practica")
public class Practica implements Serializable {
	
	@Id
	@Column(name="Codigo")
	private int codigo;
	
	@Column(name="Practica")
	private String practica;
	
	@OneToOne(mappedBy = "practica", fetch = FetchType.LAZY)
	private Prestador prestador;
	
	public Practica() {
	}

	public Practica(int codigo, String practica) {
		this.codigo = codigo;
		this.practica = practica;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPractica() {
		return practica;
	}

	public void setPractica(String practica) {
		this.practica = practica;
	}

	public Prestador getPrestador() {
		return prestador;
	}

	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}

	@Override
	public String toString() {
		return "Practica [codigo=" + codigo + ", practica=" + practica + ", prestador=" + prestador + "]";
	}
	
	
	
}
