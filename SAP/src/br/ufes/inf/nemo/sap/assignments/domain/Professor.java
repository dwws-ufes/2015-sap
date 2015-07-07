package br.ufes.inf.nemo.sap.assignments.domain;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import br.ufes.inf.nemo.sap.lab.domain.Supervision;
import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

/**
 * Domain class that represent the professors.
 * 
 * @author Luiz Vitor Fran�a Lima / Worlen Augusto Gomes
 */

/** Persist the class in the database. */
@Entity
public class Professor 	extends PersistentObjectSupport 
						implements Comparable<Professor> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	/** Name of the professor. */
	@Basic
	@NotNull
	private String name;
	
	/** Email of the professor. */
	@Basic
	private String email;
	
	/** Identifies whether the professor is administrator. */
	@Basic
	private Boolean administrator;
	
	/** Schoolrooms related to the professor. */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "professor")
	private Set<SchoolRoom> schoolRooms;
	
	/** Supervision related to the advisor. */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "advisor")
	private Set<Supervision> supervision;
	
	/** Supervision related to the coadvisor. */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "advisor")
	private Set<Supervision> coadvisor;

	/** Getter for name. */
	public String getName() {
		return name;
	}

	/** Setter for name. */
	public void setName(String name) {
		this.name = name;
	}

	/** Getter for email. */
	public String getEmail() {
		return email;
	}

	/** Setter for email. */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/** Getter for administrator. */
	public Boolean getAdministrator() {
		return administrator;
	}
	
	/** Setter for administrator. */
	public void setAdministrator(Boolean administrator) {
		this.administrator = administrator;
	}
	
	/** Getter for schoolRooms. */
	public Set<SchoolRoom> getSchoolRooms() {
		return schoolRooms;
	}

	/** Setter for schoolRooms. */
	public void setSchoolRooms(Set<SchoolRoom> schoolRooms) {
		this.schoolRooms = schoolRooms;
	}

	/** Getter for supervision. */
	public Set<Supervision> getSupervision() {
		return supervision;
	}

	/** Setter for supervision. */
	public void setSupervision(Set<Supervision> supervision) {
		this.supervision = supervision;
	}

	/** Getter for coadvisor. */
	public Set<Supervision> getCoadvisor() {
		return coadvisor;
	}

	/** Setter for coadvisor. */
	public void setCoadvisor(Set<Supervision> coadvisor) {
		this.coadvisor = coadvisor;
	}
	
	public String isAdministrator()
	{
		if(this.administrator == true)
			return "Sim";
		else
			return "N�o";
	}
	
	/** Representation of class in text form. */
	@Override
	public String toString() {
		return name;
	}
	
	/** The nemo-utils mini CRUD framework requires that classes managed by it be comparable for sorting. */
	@Override
	public int compareTo(Professor o) {
		// TODO Auto-generated method stub
		return 0;
	}
}