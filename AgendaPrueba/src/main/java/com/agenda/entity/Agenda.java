package com.agenda.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	private double telefono;
	private String[] addressLines;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTelefono() {
		return telefono;
	}
	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}
	public String[] getAddressLines() {
		return addressLines;
	}
	public void setAddressLines(String[] addressLines) {
		this.addressLines = addressLines;
	}
	public Agenda() {
		super ();
	}
	

}
