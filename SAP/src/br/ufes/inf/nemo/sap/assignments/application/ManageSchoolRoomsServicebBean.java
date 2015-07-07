package br.ufes.inf.nemo.sap.assignments.application;

import javax.ejb.*;

import br.ufes.inf.nemo.sap.assignments.domain.SchoolRoom;
import br.ufes.inf.nemo.sap.assignments.persistence.SchoolRoomDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

/**
 * Stateless session bean implementing the "Manage Schoolrooms" use case component. See the implemented interface
 * documentation for details.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Stateless
public class ManageSchoolRoomsServicebBean 	extends CrudServiceBean<SchoolRoom>
											implements ManageSchoolRoomsService {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private SchoolRoomDAO schoolRoomDAO;
	
	
	@Override
	public BaseDAO<SchoolRoom> getDAO() {
		// TODO Auto-generated method stub
		return schoolRoomDAO;
	}

	@Override
	protected SchoolRoom createNewEntity() {
		// TODO Auto-generated method stub
		return new SchoolRoom();
	}
}