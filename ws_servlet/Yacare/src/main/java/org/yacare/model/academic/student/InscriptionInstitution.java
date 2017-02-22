package org.yacare.model.academic.student;

import java.sql.Timestamp;

import org.yacare.model.org.Org;

public class InscriptionInstitution {

	private Timestamp date;
	private Org fromInstitution;

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Org getFromInstitution() {
		return fromInstitution;
	}

	public void setFromInstitution(Org fromInstitution) {
		this.fromInstitution = fromInstitution;
	}

}
