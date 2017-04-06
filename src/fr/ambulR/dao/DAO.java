package fr.ambulR.dao;
import java.util.List;

public abstract class DAO<T> {

		public abstract T find(int id);
		public abstract List<T> findAll();
		public abstract T save(T object);
		public abstract boolean delete(T object);

	
	
	
}
