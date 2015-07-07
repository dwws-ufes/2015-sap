package br.ufes.inf.nemo.sap.assignments.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.sap.assignments.application.ManageDisciplinesService;
import br.ufes.inf.nemo.sap.assignments.domain.Discipline;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.application.filters.LikeFilter;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

/**
 * Controller class responsible for mediating the communication between user interface and application service for the
 * use case "Manage Disciplines".
 * 
 * This use case is a CRUD and, thus, the controller also uses the mini CRUD framework for EJB3.
 * 
 * @author Luiz Vitor Fran�a Lima / Worlen Augusto Gomes
 */

@Named
@SessionScoped
public class ManageDisciplinesController extends CrudController<Discipline> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB 
	private ManageDisciplinesService manageDisciplinesService;
	
	
	public ManageDisciplinesController() {
	    viewPath = "/assignments/manageDisciplines/";
	    bundleName = "msgs";
	}

	@Override
	protected CrudService<Discipline> getCrudService() {		
		return manageDisciplinesService;
	}

	@Override
	protected Discipline createNewEntity() {
		return new Discipline();
	}

	@Override
	protected void initFilters() {		
		addFilter(new LikeFilter("manageDisciplines.filter.byCode", "code", "Código"));
		addFilter(new LikeFilter("manageDisciplines.filter.byName", "name", "Nome"));
	}
}