package org.marzo.hibernate.migueltarea5.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.marzo.hibernate.migueltarea5.HibernateSession;
import org.marzo.hibernate.migueltarea5.models.Patient;

public class PatientDAO implements PatientDAOInterface {

	/* 
	 * selects one patient by Id
	 * @param id
	 * @return patient
	 */
	public Patient selectById(Long id) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    Patient patient = (Patient) session.get(Patient.class, id);
	    
	    session.close();
	    return patient;
	}

	/*
	 * retrieves all patients from db
	 * @return List of patients
	 */
	public List<Patient> selectAll() {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<Patient> patients = session.createQuery("from Patient").list();
	    
	    session.close();
	    return patients;
	}

	/*
	 * inserts a new patient in database
	 * @param new patient
	 */
	public void insert(Patient patient) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	 
	    session.merge(patient);    
	    
	    session.getTransaction().commit();	         
	    session.close();

	}

	/*
	 * updates patient
	 * @param patient to update
	 */
	public void update(Patient patient) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		    Session session = sessionFactory.openSession();	 
		    session.beginTransaction();
		 
		    session.merge(patient); 
		    
		    session.getTransaction().commit();		 
		    session.close();
	}

	/*
	 * delete given patient
	 * @param patient to delete
	 */
	public void delete(Patient patient) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(patient);
	 
	    session.getTransaction().commit();
	    session.close();
	}

}
