package ar.com.academia.softtek.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="plan")
public class Plan {
	
	@Id
	@Column(name="idPlan")
	private int idPlan;
	
	@Column(name="Descripcion")
	private String descripcion;
	
	@OneToMany(mappedBy="plan")
	private List<Paciente> paciente= new ArrayList<Paciente>();
	
	public Plan() {
	}

	public Plan(int idPlan, String descripcion) {
		super();
		this.idPlan = idPlan;
		this.descripcion = descripcion;
	}

	public int getIdPlan() {
		return idPlan;
	}

	public void setIdPlan(int idPlan) {
		this.idPlan = idPlan;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Plan [idPlan=" + idPlan + ", descripcion=" + descripcion + "]";
	}

}
