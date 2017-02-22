package org.yacare.model.academic.student.family_group;

import org.yacare.model.person.Person;

public class ResponsibleFamily {

	private Person person;
	private FamilyRelationshipType familyRelationshipType;
	private EducationLevel educationLevel;
	private String comment;
	private String summary;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public FamilyRelationshipType getFamilyRelationshipType() {
		return familyRelationshipType;
	}

	public void setFamilyRelationshipType(FamilyRelationshipType familyRelationshipType) {
		this.familyRelationshipType = familyRelationshipType;
	}

	public EducationLevel getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(EducationLevel educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

}
