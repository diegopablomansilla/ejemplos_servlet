package org.yacare.model.person.communication_options;

public class CommunicationOptions {

	private Addresses addresses;
	private Emails emails;
	private Phones phones;
	private String comment;

	public Addresses getAddresses() {
		return addresses;
	}

	public void setAddresses(Addresses addresses) {
		this.addresses = addresses;
	}

	public Emails getEmails() {
		return emails;
	}

	public void setEmails(Emails emails) {
		this.emails = emails;
	}

	public Phones getPhones() {
		return phones;
	}

	public void setPhones(Phones phones) {
		this.phones = phones;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
