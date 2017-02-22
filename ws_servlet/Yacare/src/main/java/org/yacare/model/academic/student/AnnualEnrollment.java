package org.yacare.model.academic.student;

import org.yacare.model.Entity;
import org.yacare.model.academic.AcademicYear;
import org.yacare.model.academic.SchoolShift;
import org.yacare.model.academic.career.Period;

public class AnnualEnrollment extends Entity {

	private AcademicYear academicYear;
	private Period period;
	private AdmissionEnrollment admissionEnrollment;
	private SchoolShift mainSchoolShift;
	private AnnualEnrollmentState state;

	public AcademicYear getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(AcademicYear academicYear) {
		this.academicYear = academicYear;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public AdmissionEnrollment getAdmissionEnrollment() {
		return admissionEnrollment;
	}

	public void setAdmissionEnrollment(AdmissionEnrollment admissionEnrollment) {
		this.admissionEnrollment = admissionEnrollment;
	}

	public SchoolShift getMainSchoolShift() {
		return mainSchoolShift;
	}

	public void setMainSchoolShift(SchoolShift mainSchoolShift) {
		this.mainSchoolShift = mainSchoolShift;
	}

	public AnnualEnrollmentState getState() {
		return state;
	}

	public void setState(AnnualEnrollmentState state) {
		this.state = state;
	}

}
