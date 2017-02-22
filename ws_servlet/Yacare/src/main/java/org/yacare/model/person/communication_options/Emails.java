package org.yacare.model.person.communication_options;

public class Emails {

	private Email mainEmail;
	private Email[] alternativeEmails;
	private String summary;

	public Email getMainEmail() {
		return mainEmail;
	}

	public void setMainEmail(Email mainEmail) {
		this.mainEmail = mainEmail;
	}

	public Email[] getAlternativeEmails() {
		return alternativeEmails;
	}

	public void setAlternativeEmails(Email[] alternativeEmails) {
		this.alternativeEmails = alternativeEmails;
	}

	public String getSummary() {
		summary = null;

		if (getMainEmail() != null && getMainEmail().getEmail() != null && getMainEmail().getEmail().trim().length() > 0) {
			if (summary == null) {
				summary = "";
			} 

			summary += getMainEmail().getEmail().trim();
		}

		if (summary != null) {
			summary = summary.trim();
		}
		return summary;
	}

	public void setSummary(String summary) {
		// this.summary = summary;
	}


}
