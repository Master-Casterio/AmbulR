package fr.ambulR.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.ambulR.model.Patient;


public class patientDAO extends DAO<Patient> {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Patient find(int id) {
		return this.em.find(Patient.class, id);
	}

	@Override
	public List<Patient> findAll() {
		return this.em.createQuery("SELECT p FROM patient p", Patient.class).getResultList();
	}

	@Override
	public Patient save(Patient object) {
		return this.em.merge(object);
	}

	@Override
	public boolean delete(Patient object) {
		try {
			this.em.remove(this.em.merge(object));
			return true;
		}
		
		catch (Exception ex) {
			return false;
		}
	}

}
