package br.ufes.inf.nemo.sap.assignments.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.sap.assignments.application.ManageAssignmentsService;
import br.ufes.inf.nemo.sap.assignments.domain.Assignment;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.application.filters.LikeFilter;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

/**
 * Controller class responsible for mediating the communication between user interface and application service for the
 * use case "Manage Assignments".
 * 
 * This use case is a CRUD and, thus, the controller also uses the mini CRUD framework for EJB3.
 * 
 * @author Luiz Vitor Fran�a Lima / Worlen Augusto Gomes
 */

@Named
@SessionScoped
public class ManageAssignmentsController extends CrudController<Assignment> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB 
	private ManageAssignmentsService manageAssignmentsService;
	
	public ManageAssignmentsController() {
	    viewPath = "/assignments/manageAssignments/";
	    bundleName = "msgs";
	}
	
	@Override
	protected CrudService<Assignment> getCrudService() {		
		return manageAssignmentsService;
	}

	@Override
	protected Assignment createNewEntity() {

		return new Assignment();
	}

	@Override
	protected void initFilters() {		
		addFilter(new LikeFilter("manageResearchGroups.filter.bySubject", "subject", "Assunto"));
		addFilter(new LikeFilter("manageResearchGroups.filter.byDescription", "description", "Descrição"));
		addFilter(new LikeFilter("manageResearchGroups.filter.byMumMaxParticipants", "numMaxParticipants", "Número máximo de participantes"));
	}
}