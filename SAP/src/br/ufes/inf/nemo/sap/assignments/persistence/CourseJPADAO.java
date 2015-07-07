package br.ufes.inf.nemo.sap.assignments.persistence;

import javax.ejb.Stateless;
import javax.persistence.*;

import br.ufes.inf.nemo.sap.assignments.domain.Course;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseJPADAO;

/**
 * Stateless session bean implementing a DAO for objects of the Course domain class using JPA2.
 * 
 * Using a mini CRUD framework for EJB3, basic DAO operation implementations are inherited from the superclass, whereas
 * operations that are specific to the managed domain class (if any is defined in the implementing DAO interface) have
 * to be implemented in this class.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Stateless
public class CourseJPADAO 	extends BaseJPADAO<Course> 
							implements CourseDAO {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	/** The application's persistent context provided by the application server. */
	@PersistenceContext 
	private EntityManager entityManager;

	@Override
	public Class<Course> getDomainClass() {
		// TODO Auto-generated method stub
		return Course.class;
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return entityManager;
	}
}