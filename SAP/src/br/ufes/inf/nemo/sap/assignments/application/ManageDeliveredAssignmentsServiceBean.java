package br.ufes.inf.nemo.sap.assignments.application;

import javax.ejb.*;

import br.ufes.inf.nemo.sap.assignments.domain.DeliveredAssignment;
import br.ufes.inf.nemo.sap.assignments.persistence.DeliveredAssignmentDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

/**
 * Stateless session bean implementing the "Manage Delivered Assignments" use case component. See the implemented interface
 * documentation for details.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Stateless
public class ManageDeliveredAssignmentsServiceBean 	extends CrudServiceBean<DeliveredAssignment> 
													implements ManageDeliveredAssignmentsService {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private DeliveredAssignmentDAO deliveredAssignmentDAO;

	@Override
	public BaseDAO<DeliveredAssignment> getDAO() {
		// TODO Auto-generated method stub
		return deliveredAssignmentDAO;
	}

	@Override
	protected DeliveredAssignment createNewEntity() {
		// TODO Auto-generated method stub
		return new DeliveredAssignment();
	}

}
