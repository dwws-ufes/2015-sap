package br.ufes.inf.nemo.sap.assignments.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.sap.assignments.application.ManageStudentsService;
import br.ufes.inf.nemo.sap.assignments.domain.Student;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.application.filters.LikeFilter;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

/**
 * Controller class responsible for mediating the communication between user interface and application service for the
 * use case "Manage Students".
 * 
 * This use case is a CRUD and, thus, the controller also uses the mini CRUD framework for EJB3.
 * 
 * @author Luiz Vitor Fran�a Lima / Worlen Augusto Gomes
 */

@Named
@SessionScoped
public class ManageStudentsController extends CrudController<Student> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ManageStudentsService manageStudentsService;
	
	public ManageStudentsController() {
	    viewPath = "/assignments/manageStudents/";
	    bundleName = "msgs";
	}

	@Override
	protected Student createNewEntity() {
		// TODO Auto-generated method stub
		return new Student();
	}

	@Override
	protected CrudService<Student> getCrudService() {
		// TODO Auto-generated method stub
		return manageStudentsService;
	}

	@Override
	protected void initFilters() {
		addFilter(new LikeFilter("manageStudents.filter.byEnrollment", "enrollment", "Matrícula"));
		addFilter(new LikeFilter("manageStudents.filter.byName", "name", "Nome"));
		addFilter(new LikeFilter("manageStudents.filter.byEmail", "email", "Email"));
		addFilter(new LikeFilter("manageStudents.filter.byPhone", "phone", "Telefone"));
	}
}