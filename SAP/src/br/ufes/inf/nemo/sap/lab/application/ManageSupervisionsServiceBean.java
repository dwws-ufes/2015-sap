package br.ufes.inf.nemo.sap.lab.application;

import javax.ejb.*;

import br.ufes.inf.nemo.sap.lab.domain.Supervision;
import br.ufes.inf.nemo.sap.lab.domain.persistence.SupervisionDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

/**
 * Stateless session bean implementing the "Manage Supervisions" use case component. See the implemented interface
 * documentation for details.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Stateless
public class ManageSupervisionsServiceBean 	extends CrudServiceBean<Supervision>
											implements ManageSupervisionsService {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private SupervisionDAO supervisionDAO;

	@Override
	public BaseDAO<Supervision> getDAO() {
		// TODO Auto-generated method stub
		return supervisionDAO;
	}

	@Override
	protected Supervision createNewEntity() {
		// TODO Auto-generated method stub
		return new Supervision();
	}
}