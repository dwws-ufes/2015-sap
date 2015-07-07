package br.ufes.inf.nemo.sap.assignments.application;

import javax.ejb.Local;

import br.ufes.inf.nemo.sap.assignments.domain.Professor;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;

/**
 * Local EJB interface for the component that implements the "Manage Professors" use case.
 * 
 * This use case consists of a CRUD for the class Professor and uses the mini CRUD framework for EJB3.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Local
public interface ManageProfessorsService extends CrudService<Professor> {

}