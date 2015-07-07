package br.ufes.inf.nemo.sap.assignments.application;

import java.io.Serializable;
import java.util.*;

import javax.ejb.*;
import javax.inject.Named;

import br.ufes.inf.nemo.sap.assignments.domain.SchoolRoom;
import br.ufes.inf.nemo.sap.assignments.persistence.SchoolRoomDAO;


/**
 * Singleton bean that stores in memory information that is useful for the entire application, i.e., read-only
 * information shared by all users. This bean stores information for the assignment package.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Singleton
@Named
public class AssignmentInformation implements Serializable {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;

	/** The DAO for SchoolRoom objects. */
	@EJB
	private SchoolRoomDAO schoolRoomDAO;
	
	/** The list of schoolRooms */
	private SortedSet<SchoolRoom> schoolRooms;
	
	/** Getter for institutionTypes. */
	public SortedSet<SchoolRoom> getInstitutionTypes() {
		// If the institution types haven't yet been loaded, load them.
		if (schoolRooms == null) {			
			schoolRooms = new TreeSet<SchoolRoom>();
			schoolRooms.addAll(schoolRoomDAO.retrieveAll());			
		}
		return schoolRooms;
	}
}