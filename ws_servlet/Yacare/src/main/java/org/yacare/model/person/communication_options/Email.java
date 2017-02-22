package org.yacare.model.person.communication_options;

import org.yacare.model.Entity;

public class Email extends Entity {

	private String email;
	private String comment;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
