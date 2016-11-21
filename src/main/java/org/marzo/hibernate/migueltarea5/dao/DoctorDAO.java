/**
 * 
 */
package org.marzo.hibernate.migueltarea5.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.marzo.hibernate.migueltarea5.HibernateSession;
import org.marzo.hibernate.migueltarea5.models.Doctor;

public class DoctorDAO implements DoctorDAOInterface {

	/* 
	 * selects one doctor by Id
	 * @param id
	 * @return doctor
	 */
	public Doctor selectById(Long id) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    Doctor doctor = (Doctor) session.get(Doctor.class, id);
	    
	    session.close();
	    return doctor;
	}

	/*
	 * retrieves all doctor from db
	 * @return List of doctor
	 */
	public List<Doctor> selectAll() {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<Doctor> doctor = session.createQuery("from Doctor").list();
	    
	    session.close();
	    return doctor;
	}

	/*
	 * inserts a new doctor in database
	 * retrieves generated id and sets to doctor instance
	 * @param new doctor
	 */
	public void insert(Doctor doctor) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.merge(doctor);
	         
	    session.getTransaction().commit();
	    session.close();

	}

	/*
	 * updates doctor
	 * @param doctor to update
	 */
	public void update(Doctor doctor) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		    Session session = sessionFactory.openSession();	 
		    session.beginTransaction();
		 
		    session.merge(doctor);
		 
		    session.getTransaction().commit();
		    session.close();
	}

	/*
	 * delete given doctor
	 * @param doctor to delete
	 */
	public void delete(Doctor doctor) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(doctor);
	 
	    session.getTransaction().commit();
	    session.close();
	}

}
