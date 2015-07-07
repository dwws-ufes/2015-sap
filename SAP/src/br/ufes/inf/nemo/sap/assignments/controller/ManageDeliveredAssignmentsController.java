package br.ufes.inf.nemo.sap.assignments.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.sap.assignments.application.ManageDeliveredAssignmentsService;
import br.ufes.inf.nemo.sap.assignments.domain.DeliveredAssignment;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

/**
 * Controller class responsible for mediating the communication between user interface and application service for the
 * use case "Manage Delivered Assignments".
 * 
 * This use case is a CRUD and, thus, the controller also uses the mini CRUD framework for EJB3.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Named
@SessionScoped
public class ManageDeliveredAssignmentsController extends CrudController<DeliveredAssignment> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ManageDeliveredAssignmentsService manageDeliveredAssignmentsService;

	
	public ManageDeliveredAssignmentsController() {
	    viewPath = "/assignments/manageDeliveredAssignments/";
	    bundleName = "msgs";
	}
	
	@Override
	protected DeliveredAssignment createNewEntity() {
		// TODO Auto-generated method stub
		return new DeliveredAssignment();
	}

	@Override
	protected CrudService<DeliveredAssignment> getCrudService() {
		// TODO Auto-generated method stub
		return manageDeliveredAssignmentsService;
	}

	@Override
	protected void initFilters() {
		// TODO Auto-generated method stub
	}
}