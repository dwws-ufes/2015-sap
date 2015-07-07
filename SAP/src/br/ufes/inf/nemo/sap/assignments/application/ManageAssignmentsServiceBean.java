package br.ufes.inf.nemo.sap.assignments.application;

import javax.ejb.*;

import br.ufes.inf.nemo.sap.assignments.domain.Assignment;
import br.ufes.inf.nemo.sap.assignments.persistence.AssignmentDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

/**
 * Stateless session bean implementing the "Manage Assignments" use case component. See the implemented interface
 * documentation for details.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Stateless
public class ManageAssignmentsServiceBean 	extends CrudServiceBean<Assignment>
											implements ManageAssignmentsService {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private AssignmentDAO AssignmentDAO;

	@Override
	public BaseDAO<Assignment> getDAO() {
		// TODO Auto-generated method stub
		return AssignmentDAO;
	}

	@Override
	protected Assignment createNewEntity() {
		// TODO Auto-generated method stub
		return new Assignment();
	}
}