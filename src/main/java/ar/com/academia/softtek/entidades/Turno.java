package ar.com.academia.softtek.entidades;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name ="turno")
public class Turno implements Serializable{
	
	@Id
	@Column(name="Nro_turno")
	private int nroTurno;
	
	@Column(name="FechaYHoraDeLlegada")
	private LocalDateTime fechaYHoraDeLlegada;
	
	@Column(name="FechaYHoraDeInicioAtencion")
	private LocalDateTime fechaYHoraInicioDeAtencion;
	
	@Column(name="Observaciones")
	private String Observaciones;
	
	@Column(name="activo")
	private boolean activo;
	
	@ManyToOne
	@JoinColumn(name="Id_Paciente")
	private Paciente paciente;
	
	@ManyToOne
	@Column(name="IdPrestador")
	private int idPrestador;
	
	
}
