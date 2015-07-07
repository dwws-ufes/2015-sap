package br.ufes.inf.nemo.sap.assignments.persistence;

import javax.ejb.Local;

import br.ufes.inf.nemo.sap.assignments.domain.Student;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

/**
 * Interface for a DAO for objects of the Student domain class.
 * 
 * Using a mini CRUD framework for EJB3, basic DAO operation definitions are inherited from the superclass, whereas
 * operations that are specific to the managed domain class (if any) are specified in this class. 
 * 
 * @author Luiz Vitor Fran�a Lima / Worlen Augusto Gomes
 */

@Local
public interface StudentDAO extends BaseDAO<Student> {

}