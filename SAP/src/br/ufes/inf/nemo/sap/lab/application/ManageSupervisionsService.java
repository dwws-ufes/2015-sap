package br.ufes.inf.nemo.sap.lab.application;

import javax.ejb.Local;

import br.ufes.inf.nemo.sap.lab.domain.Supervision;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;

/**
 * Local EJB interface for the component that implements the "Manage Supervisions" use case.
 * 
 * This use case consists of a CRUD for the class Supervision and uses the mini CRUD framework for EJB3.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Local
public interface ManageSupervisionsService extends CrudService<Supervision> {

}