package ar.com.academia.softtek.entidades;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Modificacion")
public class Modificacion {
	
	@Id
	@Column(name="Id_Modificacion")
	private int modificacion;
	
	@Column(name="FechaDeModificacion")
	private LocalDateTime fechaDeModificacion;
	
	@Column(name="Motivo")
	private String motivo;
	
	@Column(name="Id_Paciente")
	private int idPaciente;
	
	@Column(name="Observacion")
	private String observacion;
	
	public Modificacion() {
		super();
	}

	public Modificacion(int modificacion, LocalDateTime fechaDeModificacion, String motivo, int idPaciente,
			String observacion) {
		super();
		this.modificacion = modificacion;
		this.fechaDeModificacion = fechaDeModificacion;
		this.motivo = motivo;
		this.idPaciente = idPaciente;
		this.observacion = observacion;
	}

	public int getModificacion() {
		return modificacion;
	}

	public void setModificacion(int modificacion) {
		this.modificacion = modificacion;
	}

	public LocalDateTime getFechaDeModificacion() {
		return fechaDeModificacion;
	}

	public void setFechaDeModificacion(LocalDateTime fechaDeModificacion) {
		this.fechaDeModificacion = fechaDeModificacion;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Override
	public String toString() {
		return "Modificacion [modificacion=" + modificacion + ", fechaDeModificacion=" + fechaDeModificacion
				+ ", motivo=" + motivo + ", idPaciente=" + idPaciente + ", observacion=" + observacion + "]";
	}
	

}
