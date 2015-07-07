package br.ufes.inf.nemo.sap.assignments.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.sap.assignments.application.ManagePeriodsService;
import br.ufes.inf.nemo.sap.assignments.domain.Period;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.application.filters.LikeFilter;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

/**
 * Controller class responsible for mediating the communication between user interface and application service for the
 * use case "Manage Periods".
 * 
 * This use case is a CRUD and, thus, the controller also uses the mini CRUD framework for EJB3.
 * 
 * @author Luiz Vitor Fran�a Lima / Worlen Augusto Gomes
 */

@Named
@SessionScoped
public class ManagePeriodsController extends CrudController<Period> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ManagePeriodsService managePeriodsService;

	public ManagePeriodsController() {
	    viewPath = "/assignments/managePeriods/";
	    bundleName = "msgs";
	}
	
	@Override
	protected Period createNewEntity() {
		// TODO Auto-generated method stub
		return new Period();
	}

	@Override
	protected CrudService<Period> getCrudService() {
		// TODO Auto-generated method stub
		return managePeriodsService;
	}

	@Override
	protected void initFilters() {
		addFilter(new LikeFilter("manageSchoolRooms.filter.byNumber", "number", "Número"));
	}
}