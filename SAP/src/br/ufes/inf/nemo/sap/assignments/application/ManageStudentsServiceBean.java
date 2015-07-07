package br.ufes.inf.nemo.sap.assignments.application;

import javax.ejb.*;

import br.ufes.inf.nemo.sap.assignments.domain.Student;
import br.ufes.inf.nemo.sap.assignments.persistence.StudentDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

/**
 * Stateless session bean implementing the "Manage Students" use case component. See the implemented interface
 * documentation for details.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Stateless
public class ManageStudentsServiceBean 	extends CrudServiceBean<Student>
										implements ManageStudentsService {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private StudentDAO studentDAO;
	
	@Override
	public BaseDAO<Student> getDAO() {
		// TODO Auto-generated method stub
		return studentDAO;
	}

	@Override
	protected Student createNewEntity() {
		// TODO Auto-generated method stub
		return new Student();
	}
}