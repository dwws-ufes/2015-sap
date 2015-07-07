package br.ufes.inf.nemo.sap.lab.domain.persistence;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufes.inf.nemo.sap.lab.domain.Supervision;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseJPADAO;

/**
 * Stateless session bean implementing a DAO for objects of the Supervision domain class using JPA2.
 * 
 * Using a mini CRUD framework for EJB3, basic DAO operation implementations are inherited from the superclass, whereas
 * operations that are specific to the managed domain class (if any is defined in the implementing DAO interface) have
 * to be implemented in this class.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Stateless
public class SupervisionJPADAO 	extends BaseJPADAO<Supervision> 
								implements SupervisionDAO {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;

	/** The application's persistent context provided by the application server. */
	@PersistenceContext 
	private EntityManager entityManager;
	
	@Override
	public Class<Supervision> getDomainClass() {
		// TODO Auto-generated method stub
		return Supervision.class;
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return entityManager;
	}
}