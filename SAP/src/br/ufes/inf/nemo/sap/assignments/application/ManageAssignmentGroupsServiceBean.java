package br.ufes.inf.nemo.sap.assignments.application;

import javax.ejb.*;

import br.ufes.inf.nemo.sap.assignments.domain.AssignmentGroup;
import br.ufes.inf.nemo.sap.assignments.persistence.AssignmentGroupDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

/**
 * Stateless session bean implementing the "Manage Assignment Groups" use case component. See the implemented interface
 * documentation for details.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Stateless
public class ManageAssignmentGroupsServiceBean 	extends CrudServiceBean<AssignmentGroup>
												implements ManageAssignmentGroupsService {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB 
	private AssignmentGroupDAO assignmentGroupDAO;

	@Override
	public BaseDAO<AssignmentGroup> getDAO() {
		// TODO Auto-generated method stub
		return assignmentGroupDAO;
	}

	@Override
	protected AssignmentGroup createNewEntity() {
		// TODO Auto-generated method stub
		return new AssignmentGroup();
	}
}