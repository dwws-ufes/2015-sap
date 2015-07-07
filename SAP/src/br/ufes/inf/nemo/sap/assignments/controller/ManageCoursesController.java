package br.ufes.inf.nemo.sap.assignments.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.sap.assignments.application.ManageCoursesService;
import br.ufes.inf.nemo.sap.assignments.domain.Course;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.application.filters.LikeFilter;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

/**
 * Controller class responsible for mediating the communication between user interface and application service for the
 * use case "Manage Courses".
 * 
 * This use case is a CRUD and, thus, the controller also uses the mini CRUD framework for EJB3.
 * 
 * @author Luiz Vitor Fran�a Lima / Worlen Augusto Gomes
 */

@Named
@SessionScoped
public class ManageCoursesController extends CrudController<Course> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ManageCoursesService manageCoursesService;
	
	public ManageCoursesController() {
	    viewPath = "/assignments/manageCourses/";
	    bundleName = "msgs";
	}

	@Override
	protected Course createNewEntity() {
		// TODO Auto-generated method stub
		return new Course();
	}

	@Override
	protected CrudService<Course> getCrudService() {
		// TODO Auto-generated method stub
		return manageCoursesService;
	}

	@Override
	protected void initFilters() {
		addFilter(new LikeFilter("manageCourses.filter.byCode", "code", "Código"));
		addFilter(new LikeFilter("manageCourses.filter.byName", "name", "Nome"));	
	}
}