package br.ufes.inf.nemo.sap.assignments.persistence;

import javax.ejb.Stateless;
import javax.persistence.*;

import br.ufes.inf.nemo.sap.assignments.domain.Discipline;

import br.ufes.inf.nemo.util.ejb3.persistence.BaseJPADAO;

/**
 * Stateless session bean implementing a DAO for objects of the Discipline domain class using JPA2.
 * 
 * Using a mini CRUD framework for EJB3, basic DAO operation implementations are inherited from the superclass, whereas
 * operations that are specific to the managed domain class (if any is defined in the implementing DAO interface) have
 * to be implemented in this class.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Stateless
public class DisciplineJPADAO 	extends BaseJPADAO<Discipline> 
								implements DisciplineDAO {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;	
	
	/** The application's persistent context provided by the application server. */
	@PersistenceContext 
	private EntityManager entityManager;
	
	
	@Override
	public Class<Discipline> getDomainClass() {
		// TODO Auto-generated method stub
		return Discipline.class;
	}
	

	public EntityManager getEntityManager() {
		return entityManager;
	}
}