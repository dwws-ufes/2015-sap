package br.ufes.inf.nemo.sap.assignments.domain;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

/**
 * Domain class that represent the assignments.
 * 
 * @author Luiz Vitor Fran�a Lima / Worlen Augusto Gomes
 */

/** Persist the class in the database. */
@Entity
public class Assignment 	extends PersistentObjectSupport  
							implements Comparable<Assignment> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	/** Subject of the assignment. */
	@Basic
	@NotNull
	private String subject;
	
	/** Value of the assignment. */
	@Basic
	@NotNull
	private Float value;
	
	/** Delivery date of the assignment. */
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date deliveryDate;
	
	/** Description detail of the assignment. */
	@Basic
	@NotNull
	private String description;
	
	/** Number max of participants by group of the assignment. */
	@Basic
	@NotNull
	private String numMaxParticipants;
	
	/** Discount value by day of delay in the assignment submission. */
	@Basic
	@NotNull
	private Float valueDiscountDelay;
	
	/** Groups related to the assignment. */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "assignment")
	private Set<AssignmentGroup> assignmentGroups;
	
	/** SchoolRoom associated with the Assignment. */
	@ManyToOne
	private SchoolRoom schoolRoom;

	/** Getter for subject. */
	public String getSubject() {
		return subject;
	}

	/** Setter for subject. */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/** Getter for value. */
	public Float getValue() {
		return value;
	}

	/** Setter for value. */
	public void setValue(Float value) {
		this.value = value;
	}

	/** Getter for deliveryDate. */
	public Date getDeliveryDate() {
		return deliveryDate;
	}

	/** Setter for deliveryDate. */
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	/** Getter for description. */
	public String getDescription() {
		return description;
	}

	/** Setter for description. */
	public void setDescription(String description) {
		this.description = description;
	}

	/** Getter for numMaxParticipants. */
	public String getNumMaxParticipants() {
		return numMaxParticipants;
	}

	/** Setter for numMaxParticipants. */
	public void setNumMaxParticipants(String numMaxParticipants) {
		this.numMaxParticipants = numMaxParticipants;
	}

	/** Getter for valueDiscountDelay. */
	public Float getValueDiscountDelay() {
		return valueDiscountDelay;
	}

	/** Setter for valueDiscountDelay. */
	public void setValueDiscountDelay(Float valueDiscountDelay) {
		this.valueDiscountDelay = valueDiscountDelay;
	}
	
	
	/** Getter for assignmentGroups. */
	public Set<AssignmentGroup> getAssignmentGroups() {
		return assignmentGroups;
	}

	/** Setter for assignmentGroups. */
	public void setAssignmentGroups(Set<AssignmentGroup> assignmentGroups) {
		this.assignmentGroups = assignmentGroups;
	}
	
	/** Getter for schoolRoom. */
	public SchoolRoom getSchoolRoom() {
		return schoolRoom;
	}

	/** Setter for schoolRoom. */
	public void setSchoolRoom(SchoolRoom schoolRoom) {
		this.schoolRoom = schoolRoom;
	}
	
	/** Representation of class in text form. */
	@Override
	public String toString() {
		return subject;
	}

	/** The nemo-utils mini CRUD framework requires that classes managed by it be comparable for sorting. */
	@Override
	public int compareTo(Assignment o) {
		// TODO Auto-generated method stub
		return 0;
	}
}