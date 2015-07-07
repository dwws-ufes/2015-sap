package br.ufes.inf.nemo.sap.assignments.application;

import javax.ejb.*;

import br.ufes.inf.nemo.sap.assignments.domain.Discipline;
import br.ufes.inf.nemo.sap.assignments.persistence.DisciplineDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

/**
 * Stateless session bean implementing the "Manage Disciplines" use case component. See the implemented interface
 * documentation for details.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Stateless
public class ManageDisciplinesServiceBean 	extends CrudServiceBean<Discipline>
											implements ManageDisciplinesService {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB 
	private DisciplineDAO disciplineDAO;

	@Override
	public BaseDAO<Discipline> getDAO() {
		// TODO Auto-generated method stub
		return disciplineDAO;
	}

	@Override
	protected Discipline createNewEntity() {
		// TODO Auto-generated method stub
		return new Discipline();
	}
}