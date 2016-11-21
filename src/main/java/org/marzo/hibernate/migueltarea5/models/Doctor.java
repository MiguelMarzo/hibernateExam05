package org.marzo.hibernate.migueltarea5.models;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

	private long id;
	private String name;
	private String area;
	private List<Patient> patients = new ArrayList<Patient>();

	public Doctor() {

	}
		
	public Doctor(long id, String name, String area) {
		this.id = id;
		this.name = name;
		this.area = area;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	
	public void addPatients(Patient pat) {
		this.patients.add(pat);
		pat.addDoctor(this);
	}


}
