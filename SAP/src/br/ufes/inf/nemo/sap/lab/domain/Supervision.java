package br.ufes.inf.nemo.sap.lab.domain;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import br.ufes.inf.nemo.sap.assignments.domain.*;
import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

/**
 * Domain class that represent the Supervision.
 * 
 * @author Luiz Vitor Fran�a Lima / Worlen Augusto Gomes
 */

/** Persist the class in the database. */
@Entity
public class Supervision 	extends PersistentObjectSupport 
							implements Comparable<Supervision> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	/** Theme of the supervision. */
	@Basic
	@NotNull
	private String theme;
	
	/** Type of the supervision. */
	@Basic
	@NotNull
	private Integer type;
	
	/** Starting date of the supervision. */
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date startDate;
	
	/** The end date of the supervision. */
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date endDate;
	
	/** Enrollment associated with the supervision. */
	@ManyToOne(cascade = CascadeType.ALL)
	private Enrollment enrollment;
	
	/** Advisor associated with the supervision. */
	@ManyToOne(cascade = CascadeType.ALL)
	private Professor advisor;
	
	/** Coadvisor associated with the supervision. */
	@ManyToOne(cascade = CascadeType.ALL)
	private Professor coadvisor;
	
	/** Getter for theme. */
	public String getTheme() {
		return theme;
	}

	/** Setter for theme. */
	public void setTheme(String theme) {
		this.theme = theme;
	}

	/** Getter for type. */
	public Integer getType() {
		return type;
	}

	/** Setter for type. */
	public void setType(Integer type) {
		this.type = type;
	}
	
	/** Getter for startDate. */
	public Date getStartDate() {
		return startDate;
	}

	/** Setter for startDate. */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/** Getter for endDate. */
	public Date getEndDate() {
		return endDate;
	}

	/** Setter for endDate. */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/** Getter for enrollment. */
	public Enrollment getEnrollment() {
		return enrollment;
	}

	/** Setter for enrollment. */
	public void setEnrollment(Enrollment enrollment) {
		this.enrollment = enrollment;
	}

	/** Getter for advisor. */
	public Professor getAdvisor() {
		return advisor;
	}

	/** Setter for advisor. */
	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}

	/** Getter for coadvisor. */
	public Professor getCoadvisor() {
		return coadvisor;
	}

	/** Setter for coadvisor. */
	public void setCoadvisor(Professor coadvisor) {
		this.coadvisor = coadvisor;
	}

	/** The nemo-utils mini CRUD framework requires that classes managed by it be comparable for sorting. */	
	@Override
	public int compareTo(Supervision o) {
		// TODO Auto-generated method stub
		return 0;
	}
}