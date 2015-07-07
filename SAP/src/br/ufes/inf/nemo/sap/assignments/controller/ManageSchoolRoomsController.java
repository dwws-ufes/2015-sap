package br.ufes.inf.nemo.sap.assignments.controller;


import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.sap.assignments.application.ManageSchoolRoomsService;
import br.ufes.inf.nemo.sap.assignments.domain.*;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.application.filters.LikeFilter;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

/**
 * Controller class responsible for mediating the communication between user interface and application service for the
 * use case "Manage Schoolrooms".
 * 
 * This use case is a CRUD and, thus, the controller also uses the mini CRUD framework for EJB3.
 * 
 * @author Luiz Vitor Fran�a Lima / Worlen Augusto Gomes
 */

@Named
@SessionScoped
public class ManageSchoolRoomsController extends CrudController<SchoolRoom> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ManageSchoolRoomsService manageSchoolRoomsService;

	public ManageSchoolRoomsController() {
	    viewPath = "/assignments/manageSchoolRooms/";
	    bundleName = "msgs";
	}

	@Override
	protected SchoolRoom createNewEntity() {
		// TODO Auto-generated method stub
		return new SchoolRoom();
	}

	@Override
	protected CrudService<SchoolRoom> getCrudService() {
		// TODO Auto-generated method stub
		return manageSchoolRoomsService;
	}

	@Override
	protected void initFilters() {
		addFilter(new LikeFilter("manageSchoolRooms.filter.byNumber", "number", "Número"));
	}
}