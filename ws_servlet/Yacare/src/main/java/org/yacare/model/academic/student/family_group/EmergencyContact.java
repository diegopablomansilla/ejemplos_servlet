package org.yacare.model.academic.student.family_group;

import org.yacare.model.Entity;
import org.yacare.model.person.communication_options.Phone;

public class EmergencyContact extends Entity {

	private String name;
	private String lastName;
	//private Email email;
	private Phone phone;
	private String comment;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//	public Email getEmail() {
//		return email;
//	}
//
//	public void setEmail(Email email) {
//		this.email = email;
//	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

//	public String getSummary() {
//		return summary;
//	}
//
//	public void setSummary(String summary) {
//		this.summary = summary;
//	}

}
