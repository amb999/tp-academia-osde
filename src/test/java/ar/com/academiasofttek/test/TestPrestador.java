package ar.com.academiasofttek.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.com.academia.softtek.entidades.Paciente;
import ar.com.academia.softtek.entidades.Practica;
import ar.com.academia.softtek.entidades.Prestador;

public class TestPrestador {
	
	private static EntityManager manager;
	
	private static EntityManagerFactory emf;

	public static void main(String[] args) {

		emf = Persistence.createEntityManagerFactory("Persistencia");
		
		manager = emf.createEntityManager();
		
		manager.getTransaction().begin();
		Prestador pre = manager.find(Prestador.class, 10L);
		pre.setNombreYApellido("Roberto Gonzales");
		manager.getTransaction().commit();
		
		insertInicial();
		
		imprimirTodo();
		manager.close();
		
	}
	
	@SuppressWarnings("unchecked")
	public static void insertInicial() {
		Prestador p = new Prestador(10, "Roberto Gonzales", "Capital Federal", "", "",
				"", 84654);
		manager.getTransaction().begin();
		manager.persist(p);
		manager.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public static void imprimirTodo() {
		List<Prestador> pres = (List<Prestador>) manager.createQuery("FROM Prestador").getResultList();
		System.out.println("Hay "+ pres.size()+ " prestadores en el sistema.");
		for (Prestador pre : pres) {
			System.out.println(pre.toString());
		}
		
	}

}
