package com.distance.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="distance_calculator")
public class Distance implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	private int distance_id;
	private String source;
	private String destination;
	private double dist_in_km;
	private double dist_in_miles;
	public int getDistance_id() {
		return distance_id;
	}
	public void setDistance_id(int distance_id) {
		this.distance_id = distance_id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getDist_in_km() {
		return dist_in_km;
	}
	public void setDist_in_km(int dist_in_km) {
		this.dist_in_km = dist_in_km;
	}
	public double getDist_in_miles() {
		return dist_in_miles;
	}
	public void setDist_in_miles(double distanceMiles) {
		this.dist_in_miles = distanceMiles;
	}
	
	
	
	
	
	
	
}
