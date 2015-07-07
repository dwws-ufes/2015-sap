package br.ufes.inf.nemo.sap.assignments.application;

import javax.ejb.*;

import br.ufes.inf.nemo.sap.assignments.domain.Course;
import br.ufes.inf.nemo.sap.assignments.persistence.CourseDAO;

import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

/**
 * Stateless session bean implementing the "Manage Courses" use case component. See the implemented interface
 * documentation for details.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Stateless
public class ManageCoursesServiceBean 	extends CrudServiceBean<Course> 
										implements ManageCoursesService {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private CourseDAO courseDAO;
	
	@Override
	public BaseDAO<Course> getDAO() {
		// TODO Auto-generated method stub
		return courseDAO;
	}

	@Override
	protected Course createNewEntity() {
		// TODO Auto-generated method stub
		return new Course();
	}
}