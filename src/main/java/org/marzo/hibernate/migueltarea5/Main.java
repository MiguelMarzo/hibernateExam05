package org.marzo.hibernate.migueltarea5;

import org.hibernate.Session;
import org.marzo.hibernate.migueltarea5.dao.DoctorDAO;
import org.marzo.hibernate.migueltarea5.dao.PatientDAO;
import org.marzo.hibernate.migueltarea5.models.Patient;
import org.marzo.hibernate.migueltarea5.models.Doctor;

public class Main {

	public static void main(String[] args) {
		
		Doctor doc1 = new Doctor();
		doc1.setName("DOC1");
		doc1.setArea("Area1");
		Doctor doc2 = new Doctor();
		doc2.setName("DOC2");
		doc2.setArea("Area2");
		
		
		Patient pat1 = new Patient();
		pat1.setName("PAT1");
		pat1.setSex("Male");
		Patient pat2 = new Patient();
		pat2.setName("PAT2");
		pat2.setSex("Female");
		
		doc1.addPatients(pat1);
		doc1.addPatients(pat2);
		doc2.addPatients(pat1);
		doc2.addPatients(pat2);
		
		DoctorDAO doctorDAO = new DoctorDAO();
		doctorDAO.insert(doc1);
		doctorDAO.insert(doc2);
		
		//System.out.println(doctorDAO.selectAll().toString());
		
		
	}

}
