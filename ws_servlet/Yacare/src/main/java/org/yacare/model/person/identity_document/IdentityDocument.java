package org.yacare.model.person.identity_document;

public class IdentityDocument {

	private String identityNumber;
	private IdentityType identityType;
	private String summary;

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public IdentityType getIdentityType() {
		return identityType;
	}

	public void setIdentityType(IdentityType identityType) {
		this.identityType = identityType;
	}
	
	public String getSummary() {
		summary = "";
		if (this.getIdentityType() != null && getIdentityType().getName() != null && getIdentityType().getName().trim().length() > 0) {
			summary += "(" + this.getIdentityType().getName() + ")";
		}
		if (this.getIdentityNumber() != null) {
			summary += " " + this.getIdentityNumber();
		}

		summary = summary.trim();
		if (summary.trim().length() == 0) {
			summary = null;
		}

		return summary;
	}

	public void setSummary(String summary) {
		// this.summary = summary;
	}

}
