package org.marzo.hibernate.migueltarea5.models;

import java.util.ArrayList;
import java.util.List;

public class Patient {

	private long id;
	private String name;
	private String sex;
	private List<Doctor> doctors = new ArrayList<Doctor>();

	public Patient() {

	}

	public Patient(long id, String name,String sex) {
		this.sex = sex;
		this.id = id;
		this.name = name;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public void addDoctor(Doctor doc) {
		this.doctors.add(doc);
	}
}
