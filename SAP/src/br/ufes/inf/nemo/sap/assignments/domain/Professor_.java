package br.ufes.inf.nemo.sap.assignments.domain;

import javax.persistence.metamodel.*;

import br.ufes.inf.nemo.sap.lab.domain.Supervision;
import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport_;

/**
 * Meta-model for the Professor domain class, which allows DAOs to perform programmatic queries involving this class
 * using JPA2's Criteria API.
 * 
 * @author Luiz Vitor Fran�a Lima / Worlen Augusto Gomes
 */
@StaticMetamodel(Professor.class)
public class Professor_ extends PersistentObjectSupport_ {	
	public static volatile SingularAttribute<Professor, String> name;
	public static volatile SingularAttribute<Professor, String> email;
	public static volatile SingularAttribute<Professor, Boolean> administrator;
	public static volatile SetAttribute<Professor, SchoolRoom> schoolRooms;
	public static volatile SetAttribute<Professor, Supervision> supervision;
	public static volatile SetAttribute<Professor, Supervision> coadvisor;
}