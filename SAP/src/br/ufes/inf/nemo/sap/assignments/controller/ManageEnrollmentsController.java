package br.ufes.inf.nemo.sap.assignments.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.sap.assignments.application.ManageEnrollmentsService;
import br.ufes.inf.nemo.sap.assignments.domain.Enrollment;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

/**
 * Controller class responsible for mediating the communication between user interface and application service for the
 * use case "Manage Enrollments".
 * 
 * This use case is a CRUD and, thus, the controller also uses the mini CRUD framework for EJB3.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Named
@SessionScoped
public class ManageEnrollmentsController extends CrudController<Enrollment> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ManageEnrollmentsService manageEnrollmentsService;
	
	public ManageEnrollmentsController() {
	    viewPath = "/assignments/manageEnrollments/";
	    bundleName = "msgs";
	}

	@Override
	protected Enrollment createNewEntity() {
		// TODO Auto-generated method stub
		return new Enrollment();
	}

	@Override
	protected CrudService<Enrollment> getCrudService() {
		// TODO Auto-generated method stub
		return manageEnrollmentsService;
	}

	@Override
	protected void initFilters() {
		// TODO Auto-generated method stub
	}
}