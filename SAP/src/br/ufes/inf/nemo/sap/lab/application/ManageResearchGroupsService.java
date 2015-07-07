package br.ufes.inf.nemo.sap.lab.application;

import javax.ejb.Local;

import br.ufes.inf.nemo.sap.lab.domain.ResearchGroup;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;

/**
 * Local EJB interface for the component that implements the "Manage Research Groups" use case.
 * 
 * This use case consists of a CRUD for the class ResearchGroup and uses the mini CRUD framework for EJB3.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

@Local
public interface ManageResearchGroupsService extends CrudService<ResearchGroup> {

}