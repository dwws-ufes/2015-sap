package br.ufes.inf.nemo.sap.assignments.application;

import javax.ejb.*;

import br.ufes.inf.nemo.sap.assignments.domain.Period;
import br.ufes.inf.nemo.sap.assignments.persistence.PeriodDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

/**
 * Stateless session bean implementing the "Manage Periods" use case component. See the implemented interface
 * documentation for details.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Stateless
public class ManagePeriodsServiceBean 	extends CrudServiceBean<Period> 
										implements ManagePeriodsService {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private PeriodDAO periodDAO;

	@Override
	public BaseDAO<Period> getDAO() {
		// TODO Auto-generated method stub
		return periodDAO;
	}

	@Override
	protected Period createNewEntity() {
		// TODO Auto-generated method stub
		return new Period();
	}
}