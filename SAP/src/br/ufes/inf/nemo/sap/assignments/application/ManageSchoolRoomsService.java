package br.ufes.inf.nemo.sap.assignments.application;

import javax.ejb.Local;

import br.ufes.inf.nemo.sap.assignments.domain.SchoolRoom;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;

/**
 * Local EJB interface for the component that implements the "Manage Schoolrooms" use case.
 * 
 * This use case consists of a CRUD for the class SchoolRoom and uses the mini CRUD framework for EJB3.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Local
public interface ManageSchoolRoomsService extends CrudService<SchoolRoom> {

}