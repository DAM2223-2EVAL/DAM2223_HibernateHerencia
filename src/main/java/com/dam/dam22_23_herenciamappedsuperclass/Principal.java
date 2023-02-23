package com.dam.dam22_23_herenciamappedsuperclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Principal {

	public static void main(String[] args) {
		
		StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
		
		Session sesion = sf.openSession();
		
		sesion.beginTransaction();
		
		Alumno al1 = new Alumno("1111A", "Tomás", 19, "DAM");
		Alumno al2 = new Alumno("2222B", "Alberto", 28, "DAM");
		
		Profesor prof1 = new Profesor("3333C", "Yisus", 40, 2);
		Profesor prof2 = new Profesor("4444D", "Jose", 41, 2);
	
		
		sesion.persist(al1);
		sesion.persist(al2);
		sesion.persist(prof1);
		sesion.persist(prof2);
		
		sesion.getTransaction().commit();
		
		sesion.close();
		sf.close();

	}

}
