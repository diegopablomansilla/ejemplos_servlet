package org.yacare.model.academic.student;

import java.sql.Timestamp;

public class AdmissionEnrollment {

	private Timestamp admissionDate;
	private Timestamp enrollmentDate;

	public Timestamp getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Timestamp admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Timestamp getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(Timestamp enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

}
