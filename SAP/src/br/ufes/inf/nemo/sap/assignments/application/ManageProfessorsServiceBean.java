package br.ufes.inf.nemo.sap.assignments.application;

import javax.ejb.*;

import br.ufes.inf.nemo.sap.assignments.domain.Professor;
import br.ufes.inf.nemo.sap.assignments.persistence.ProfessorDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

/**
 * Stateless session bean implementing the "Manage Professors" use case component. See the implemented interface
 * documentation for details.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Stateless
public class ManageProfessorsServiceBean 	extends CrudServiceBean<Professor>
											implements ManageProfessorsService {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ProfessorDAO professorDAO;

	@Override
	public BaseDAO<Professor> getDAO() {
		// TODO Auto-generated method stub
		return professorDAO;
	}

	@Override
	protected Professor createNewEntity() {
		// TODO Auto-generated method stub
		return new Professor();
	}
}