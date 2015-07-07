package br.ufes.inf.nemo.sap.assignments.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.sap.assignments.application.ManageAssignmentGroupsService;
import br.ufes.inf.nemo.sap.assignments.domain.AssignmentGroup;
import br.ufes.inf.nemo.sap.assignments.persistence.AssignmentDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.application.filters.LikeFilter;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

/**
 * Controller class responsible for mediating the communication between user interface and application service for the
 * use case "Manage Assignment Groups".
 * 
 * This use case is a CRUD and, thus, the controller also uses the mini CRUD framework for EJB3.
 * 
 * @author Luiz Vitor Fran�a Lima / Worlen Augusto Gomes
 */

@Named
@SessionScoped
public class ManageAssignmentGroupsController extends CrudController<AssignmentGroup> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	/** The "Manage Assignment Groups" service. */
	@EJB
	private ManageAssignmentGroupsService manageAssignmentGroupsService;
	
	/** The DAO for Assignment objects. */
	@EJB
	private AssignmentDAO assignmentDAO;
	
	
	public ManageAssignmentGroupsController() {
	    viewPath = "/assignments/manageAssignmentGroups/";
	    bundleName = "msgs";
	}
	

	@Override
	protected AssignmentGroup createNewEntity() {
		// TODO Auto-generated method stub
		return new AssignmentGroup();
	}

	@Override
	protected CrudService<AssignmentGroup> getCrudService() {
		// TODO Auto-generated method stub
		return manageAssignmentGroupsService;
	}

	@Override
	protected void initFilters() {
		addFilter(new LikeFilter("manageAssignmentGroups.filter.byNumber", "number", "Número"));		
	}
}