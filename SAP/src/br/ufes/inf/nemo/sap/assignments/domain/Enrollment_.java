package br.ufes.inf.nemo.sap.assignments.domain;

import javax.persistence.metamodel.*;

import br.ufes.inf.nemo.sap.lab.domain.Supervision;
import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport_;

/**
 * Meta-model for the Enrollment domain class, which allows DAOs to perform programmatic queries involving this class
 * using JPA2's Criteria API.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */
@StaticMetamodel(Enrollment.class)
public class Enrollment_ extends PersistentObjectSupport_ {	
	public static volatile SingularAttribute<Enrollment, String> number;
	public static volatile SetAttribute<Enrollment, Supervision> supervision;	
}