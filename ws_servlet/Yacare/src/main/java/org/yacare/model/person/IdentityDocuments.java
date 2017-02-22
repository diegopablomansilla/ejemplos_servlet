package org.yacare.model.person;

import org.yacare.model.person.identity_document.IdentityDocument;

public class IdentityDocuments {

	private IdentityDocument mainIdentity;
	private IdentityDocument[] identities;
	private String summary;

	public IdentityDocument getMainIdentity() {
		return mainIdentity;
	}

	public void setMainIdentity(IdentityDocument mainIdentity) {
		this.mainIdentity = mainIdentity;
	}

	public IdentityDocument[] getIdentities() {
		return identities;
	}

	public void setIdentities(IdentityDocument[] identities) {
		this.identities = identities;
	}
	
	public String getSummary() {
		summary = null;

		if (getMainIdentity() != null && getMainIdentity().getSummary() != null && getMainIdentity().getSummary().trim().length() > 0) {
			if (summary == null) {
				summary = "";
			} 

			summary += getMainIdentity().getSummary().trim();
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
