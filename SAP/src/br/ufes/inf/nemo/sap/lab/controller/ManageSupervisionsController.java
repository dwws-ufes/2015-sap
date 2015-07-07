package br.ufes.inf.nemo.sap.lab.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.sap.lab.application.ManageSupervisionsService;
import br.ufes.inf.nemo.sap.lab.domain.Supervision;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.application.filters.LikeFilter;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

/**
 * Controller class responsible for mediating the communication between user interface and application service for the
 * use case "Manage Supervisions".
 * 
 * This use case is a CRUD and, thus, the controller also uses the mini CRUD framework for EJB3.
 * 
 * @author Luiz Vitor Fran�a Lima / Worlen Augusto Gomes
 */

@Named
@SessionScoped
public class ManageSupervisionsController extends CrudController<Supervision> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ManageSupervisionsService manageSupervisionsService;

	
	public ManageSupervisionsController() {
	    viewPath = "/labs/manageSupervisions/";
	    bundleName = "msgs";
	}
	
	@Override
	protected Supervision createNewEntity() {
		// TODO Auto-generated method stub
		return new Supervision();
	}

	@Override
	protected CrudService<Supervision> getCrudService() {
		// TODO Auto-generated method stub
		return manageSupervisionsService;
	}

	@Override
	protected void initFilters() {
		addFilter(new LikeFilter("manageSchoolRooms.filter.byTheme", "theme", "Tema"));
	}
}