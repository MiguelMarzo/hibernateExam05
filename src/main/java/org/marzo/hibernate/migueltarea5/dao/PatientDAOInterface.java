package org.marzo.hibernate.migueltarea5.dao;

import java.util.List;

import org.marzo.hibernate.migueltarea5.models.Patient;

/**
 * interface for RoleDAO clas
 */
public interface PatientDAOInterface {
	
	public Patient selectById(Long id);
	public List<Patient> selectAll ();
	public void insert (Patient role);
	public void update (Patient role);
	public void delete (Patient role);

}
