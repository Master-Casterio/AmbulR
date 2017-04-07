package fr.ambulR.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import fr.ambulR.model.Drone;

public class DroneDAO extends DAO<Drone>{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Drone find(int id) {
		return this.em.find(Drone.class, id);
	}

	@Override
	public List<Drone> findAll() {
		return this.em.createQuery("SELECT p FROM drone p", Drone.class).getResultList();
	}

	@Override
	public Drone save(Drone object) {
		return this.em.merge(object);
	}

	@Override
	public boolean delete(Drone object) {
		try {
			this.em.remove(this.em.merge(object));
			return true;
		}
		
		catch (Exception ex) {
			return false;
		}
	}

	

}
