package com.distance.jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DistanceAdd {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		Distance distance = new Distance();
		double dmtrs=0;
		double dMtrs =0;
		System.out.println("Enter DistanceId: ");
		distance.setDistance_id(sc.nextInt());
		System.out.println("Enter Source : ");
		distance.setSource(sc.next());
		System.out.println("Enter Destination : ");
		distance.setDestination(sc.next());
		System.out.println("Enter Distance in KM: ");
		distance.setDist_in_km(sc.nextInt());
		System.out.println("Enter Distance in Meters");
		dMtrs = sc.nextInt();
		
		dMtrs=1.61*(distance.getDist_in_km());
		distance.setDist_in_miles(dMtrs);
		
		em.getTransaction().begin();
		
		em.persist(distance);
	
		em.getTransaction().commit();
		System.out.println("DAta Added ");
		
		
	}
}







