package org.yacare.model.academic.student;

import org.yacare.model.Entity;
import org.yacare.model.academic.career.Career;
import org.yacare.model.academic.student.family_group.EmergencyContact;
import org.yacare.model.academic.student.family_group.ResponsibleFamily;
import org.yacare.model.org.Org;
import org.yacare.model.person.Person;

public class Student extends Entity {

	private Person personalInformation;
	private Org institution;
	// private String fileNumber;
	private Career career;
	private StudentState state;
	private InscriptionInstitution inscriptionInstitution;
	private AdmissionInstitution admissionInstitution;
	private GraduationInstitution graduationInstitution;
	private AnnualEnrollment[] annualEnrollmentList;
	private ResponsibleFamily[] responsibleFamily;
	private EmergencyContact[] emergencyContacts;

	public Person getPersonalInformation() {
		return personalInformation;
	}

	public void setPersonalInformation(Person personalInformation) {
		this.personalInformation = personalInformation;
	}

	public Org getInstitution() {
		return institution;
	}

	public void setInstitution(Org institution) {
		this.institution = institution;
	}

	public Career getCareer() {
		return career;
	}

	public void setCareer(Career career) {
		this.career = career;
	}

	public StudentState getState() {
		return state;
	}

	public void setState(StudentState state) {
		this.state = state;
	}

	public InscriptionInstitution getInscriptionInstitution() {
		return inscriptionInstitution;
	}

	public void setInscriptionInstitution(InscriptionInstitution inscriptionInstitution) {
		this.inscriptionInstitution = inscriptionInstitution;
	}

	public AdmissionInstitution getAdmissionInstitution() {
		return admissionInstitution;
	}

	public void setAdmissionInstitution(AdmissionInstitution admissionInstitution) {
		this.admissionInstitution = admissionInstitution;
	}

	public GraduationInstitution getGraduationInstitution() {
		return graduationInstitution;
	}

	public void setGraduationInstitution(GraduationInstitution graduationInstitution) {
		this.graduationInstitution = graduationInstitution;
	}

	public AnnualEnrollment[] getAnnualEnrollmentList() {
		return annualEnrollmentList;
	}

	public void setAnnualEnrollmentList(AnnualEnrollment[] annualEnrollmentList) {
		this.annualEnrollmentList = annualEnrollmentList;
	}

	public ResponsibleFamily[] getResponsibleFamily() {
		return responsibleFamily;
	}

	public void setResponsibleFamily(ResponsibleFamily[] responsibleFamily) {
		this.responsibleFamily = responsibleFamily;
	}

	public EmergencyContact[] getEmergencyContacts() {
		return emergencyContacts;
	}

	public void setEmergencyContacts(EmergencyContact[] emergencyContacts) {
		this.emergencyContacts = emergencyContacts;
	}

}
