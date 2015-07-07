package br.ufes.inf.nemo.sap.assignments.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.sap.assignments.application.ManageProfessorsService;
import br.ufes.inf.nemo.sap.assignments.domain.Professor;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.application.filters.LikeFilter;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

/**
 * Controller class responsible for mediating the communication between user interface and application service for the
 * use case "Manage Professors".
 * 
 * This use case is a CRUD and, thus, the controller also uses the mini CRUD framework for EJB3.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Named
@SessionScoped
public class ManageProfessorsController extends CrudController<Professor> {	
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ManageProfessorsService manageProfessorsService;
	
	public ManageProfessorsController() {
	    viewPath = "/assignments/manageProfessors/";
	    bundleName = "msgs";
	}

	@Override
	protected Professor createNewEntity() {
		// TODO Auto-generated method stub
		return new Professor();
	}

	@Override
	protected CrudService<Professor> getCrudService() {
		// TODO Auto-generated method stub
		return manageProfessorsService;
	}

	@Override
	protected void initFilters() {
		addFilter(new LikeFilter("manageProfessors.filter.byName", "name", "Nome"));
		addFilter(new LikeFilter("manageProfessors.filter.byEmail", "email", "Email"));
	}
}