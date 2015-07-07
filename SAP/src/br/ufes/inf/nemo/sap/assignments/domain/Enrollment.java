package br.ufes.inf.nemo.sap.assignments.domain;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import br.ufes.inf.nemo.sap.lab.domain.Supervision;
import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

/**
 * Domain class that represent the enrollment.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

/** Persist the class in the database. */
@Entity
public class Enrollment 	extends PersistentObjectSupport 
							implements Comparable<Enrollment> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	/** Number of the enrollment. */
	@Basic
	@NotNull
	private String number;

	/** Supervisions related to the enrollment. */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "enrollment")
	private Set<Supervision> supervision;
	
	/** Getter for number. */
	public String getNumber() {
		return number;
	}

	/** Setter for number. */
	public void setNumber(String number) {
		this.number = number;
	}

	/** Getter for supervision. */
	public Set<Supervision> getSupervision() {
		return supervision;
	}

	/** Setter for supervision. */
	public void setSupervision(Set<Supervision> supervision) {
		this.supervision = supervision;
	}

	/** The nemo-utils mini CRUD framework requires that classes managed by it be comparable for sorting. */
	@Override
	public int compareTo(Enrollment o) {
		// TODO Auto-generated method stub
		return 0;
	}
}