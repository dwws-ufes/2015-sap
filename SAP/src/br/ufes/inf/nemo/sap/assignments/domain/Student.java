package br.ufes.inf.nemo.sap.assignments.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

/**
 * Domain class that represent the students.
 * 
 * @author Luiz Vitor Fran�a Lima / Worlen Augusto Gomes
 */

/** Persist the class in the database. */
@Entity
public class Student 	extends PersistentObjectSupport 
						implements Comparable<Student> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	/** Name of the student. */
	@Basic
	@NotNull
	private String name;
	
	/** Email of the student. */
	@Basic
	@NotNull
	private String email;
	
	/** Phone of the student. */
	@Basic
	@NotNull
	private String phone;

	@Basic
	@NotNull
	private String enrollment;
	
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

	/** Getter for phone. */
	public String getPhone() {
		return phone;
	}

	/** Setter for phone. */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}

	/** The nemo-utils mini CRUD framework requires that classes managed by it be comparable for sorting. */
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
}