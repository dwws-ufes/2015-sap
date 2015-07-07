package br.ufes.inf.nemo.sap.assignments.application;

import javax.ejb.Local;

import br.ufes.inf.nemo.sap.assignments.domain.Assignment;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;

/**
 * Local EJB interface for the component that implements the "Manage Assignments" use case.
 * 
 * This use case consists of a CRUD for the class Assignment and uses the mini CRUD framework for EJB3.
 * 
 * @author Luiz Vitor Fran�a Lima / Worlen Augusto Gomes
 */

@Local
public interface ManageAssignmentsService extends CrudService<Assignment> {

}