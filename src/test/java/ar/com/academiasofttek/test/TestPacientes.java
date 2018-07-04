package ar.com.academiasofttek.test;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.com.academia.softtek.entidades.Paciente;

public class TestPacientes {

	private static EntityManager manager;
	
	private static EntityManagerFactory emf;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		emf = Persistence.createEntityManagerFactory("Persistencia");
		
		manager = emf.createEntityManager();
		
		manager.getTransaction().begin();
		Paciente p = manager.find(Paciente.class, 10L);
		p.setNombreYApellido("Roberto Gonzales");
		manager.getTransaction().commit();
		
		insertInicial();
		
		imprimirTodo();
		manager.close();
		
	}
	
	@SuppressWarnings("unchecked")
	public static void insertInicial() {
		/*
		Paciente p = new Paciente(,"","", LocalDate.of(1980, 2, 5));
		Paciente p2 = new Paciente(,"","",LocalDate.of(1979, 6, 1));
		Paciente p3 = new Paciente(,"","", LocalDate.of(1979, 6, 2));
		Paciente p4 = new Paciente(,"","", LocalDate.of(1979, 6, 3));
		*/
	}
	
	@SuppressWarnings("unchecked")
	public static void imprimirTodo() {
		List<Paciente> pacs = (List<Paciente>) manager.createQuery("FROM Paciente").getResultList();
		System.out.println("Hay "+ pacs.size()+ " pacientes en el sistema.");
		for (Paciente pac : pacs) {
			System.out.println(pac.toString());
		}
		
	}

}
