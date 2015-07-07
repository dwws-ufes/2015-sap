package br.ufes.inf.nemo.sap.assignments.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.convert.Converter;
import javax.inject.Named;

import br.ufes.inf.nemo.sap.assignments.domain.*;
import br.ufes.inf.nemo.sap.assignments.persistence.*;
import br.ufes.inf.nemo.util.ejb3.controller.PersistentObjectConverterFromId;


/**
 * Application-scoped bean that centralizes controller information for the assignment package. This bean differs from the
 * singleton EJB CoreInformation by containing data relative to the presentation layer (controller and view, i.e., the
 * web).
 * 
 * @author Luiz Vitor Fran�a Lima / Worlen Augusto Gomes
 */

@Named
@ApplicationScoped
public class AssignmentController implements Serializable {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;
	
	/** The DAO for SchoolRoom objects. */
	@EJB
	private SchoolRoomDAO schoolRoomDAO;
	
	/** The DAO for Course objects. */
	@EJB
	private CourseDAO courseDAO;
	
	/** The DAO for Discipline objects. */
	@EJB
	private DisciplineDAO disciplineDAO;
	
	/** The DAO for Period objects. */
	@EJB
	private PeriodDAO periodDAO;

	/** The DAO for Professor objects. */
	@EJB
	private ProfessorDAO professorDAO;
	
	/** The DAO for Assignment objects. */
	@EJB
	private AssignmentDAO assignmentDAO;
	
	/** JSF Converter for Course objects. */
	private PersistentObjectConverterFromId<Course> courseConverter;
	
	/** JSF Converter for Course objects. */
	private PersistentObjectConverterFromId<Discipline> disciplineConverter;
	
	/** JSF Converter for Period objects. */
	private PersistentObjectConverterFromId<Period> periodConverter;
	
	/** JSF Converter for Professor objects. */
	private PersistentObjectConverterFromId<Professor> professorConverter;
	
	/** JSF Converter for SchoolRoom objects. */
	private PersistentObjectConverterFromId<SchoolRoom> schoolRoomConverter;
	
	/** JSF Converter for Assignment objects. */
	private PersistentObjectConverterFromId<Assignment> assignmentConverter;	
	
	/** Getter for professorConverter. */
	public Converter getProfessorConverter() {
		// Lazily create the converter.
		if (professorConverter == null) {
			professorConverter = new PersistentObjectConverterFromId<Professor>(professorDAO);
		}
		return professorConverter;
	}
	
	/** Getter for periodConverter. */
	public Converter getPeriodConverter() {
		// Lazily create the converter.
		if (periodConverter == null) {
			periodConverter = new PersistentObjectConverterFromId<Period>(periodDAO);
		}
		return periodConverter;
	}	
	
	/** Getter for disciplineConverter. */
	public Converter getDisciplineConverter() {
		// Lazily create the converter.
		if (disciplineConverter == null) {
			disciplineConverter = new PersistentObjectConverterFromId<Discipline>(disciplineDAO);
		}
		return disciplineConverter;
	}	
	
	/** Getter for courseConverter. */
	public Converter getCourseConverter() {
		// Lazily create the converter.
		if (courseConverter == null) {
			courseConverter = new PersistentObjectConverterFromId<Course>(courseDAO);
		}
		return courseConverter;
	}
	
	/** Getter for schoolRoomConverter. */
	public Converter getSchoolRoomConverter() {
		if (schoolRoomConverter == null) {
			schoolRoomConverter = new PersistentObjectConverterFromId<SchoolRoom>(schoolRoomDAO);
		}
		return schoolRoomConverter;
	}
	
	/** Getter for AssignmentConverter. */
	public Converter getAssignmentConverter() {
		if (assignmentConverter == null) {
			assignmentConverter = new PersistentObjectConverterFromId<Assignment>(assignmentDAO);
		}
		return assignmentConverter;
	}
}