package br.ufes.inf.nemo.sap.assignments.application;

import javax.ejb.*;

import br.ufes.inf.nemo.sap.assignments.domain.Enrollment;
import br.ufes.inf.nemo.sap.assignments.persistence.EnrollmentDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

/**
 * Stateless session bean implementing the "Manage Enrollments" use case component. See the implemented interface
 * documentation for details.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Stateless
public class ManageEnrollmentsServiceBean 	extends CrudServiceBean<Enrollment>
											implements ManageEnrollmentsService {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private EnrollmentDAO enrollmentDAO;
	
	@Override
	public BaseDAO<Enrollment> getDAO() {
		// TODO Auto-generated method stub
		return enrollmentDAO;
	}

	@Override
	protected Enrollment createNewEntity() {
		// TODO Auto-generated method stub
		return new Enrollment();
	}
}