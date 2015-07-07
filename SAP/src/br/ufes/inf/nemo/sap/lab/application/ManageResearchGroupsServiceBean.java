package br.ufes.inf.nemo.sap.lab.application;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.sap.lab.domain.ResearchGroup;
import br.ufes.inf.nemo.sap.lab.domain.persistence.ResearchGroupDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

/**
 * Stateless session bean implementing the "Manage Research Groups" use case component. See the implemented interface
 * documentation for details.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Stateless
public class ManageResearchGroupsServiceBean 	extends CrudServiceBean<ResearchGroup> 
												implements ManageResearchGroupsService {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ResearchGroupDAO researchGroupDAO;

	@Override
	public BaseDAO<ResearchGroup> getDAO() {
		// TODO Auto-generated method stub
		return researchGroupDAO;
	}

	@Override
	protected ResearchGroup createNewEntity() {
		// TODO Auto-generated method stub
		return new ResearchGroup();
	}
}