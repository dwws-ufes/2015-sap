package br.ufes.inf.nemo.sap.lab.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

/**
 * Domain class that represent the ResearchGroup.
 * 
 * @author Luiz Vitor França Lima / Worlen Augusto Gomes
 */

/** Persist the class in the database. */
@Entity
public class ResearchGroup 	extends PersistentObjectSupport 
							implements Comparable<ResearchGroup> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	/** Name of the research group. */
	@Basic
	@NotNull
	private String name;
	
	/** The research group's web page address. */
	@Basic
	private String site;

	/** Getter for name. */
	public String getName() {
		return name;
	}
	
	/** Setter for name. */
	public void setName(String name) {
		this.name = name;
	}

	/** Getter for site. */
	public String getSite() {
		return site;
	}

	/** Setter for site. */
	public void setSite(String site) {
		this.site = site;
	}

	/** The nemo-utils mini CRUD framework requires that classes managed by it be comparable for sorting. */
	@Override
	public int compareTo(ResearchGroup o) {
		// TODO Auto-generated method stub
		return 0;
	}
}