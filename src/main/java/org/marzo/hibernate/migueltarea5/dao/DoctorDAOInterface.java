package org.marzo.hibernate.migueltarea5.dao;

import java.util.List;

import org.marzo.hibernate.migueltarea5.models.Doctor;

public interface DoctorDAOInterface {
	
	public Doctor selectById(Long id);
	public List<Doctor> selectAll ();
	public void insert (Doctor doctor);
	public void update (Doctor doctor);
	public void delete (Doctor doctor);

}
