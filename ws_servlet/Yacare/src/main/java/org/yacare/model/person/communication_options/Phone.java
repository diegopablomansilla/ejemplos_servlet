package org.yacare.model.person.communication_options;

import org.yacare.model.Entity;
import org.yacare.model.geo.Country;

public class Phone extends Entity {

	private Country country;
	private String localCallingCode;
	private String number;
	private String comment;
	private String summary;

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getLocalCallingCode() {
		return localCallingCode;
	}

	public void setLocalCallingCode(String localCallingCode) {
		this.localCallingCode = localCallingCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getSummary() {
		summary = null;

		if (getCountry() != null && getCountry().getCallingCode() != null && getCountry().getCallingCode().trim().length() > 0) {
			if (summary == null) {
				summary = "";
			}

			summary += getCountry().getCallingCode().trim();
		}
		if (getLocalCallingCode() != null && getLocalCallingCode().trim().length() > 0) {
			if (summary == null) {
				summary = "";
				summary += getLocalCallingCode().trim();
			} else {
				summary += " " + getLocalCallingCode().trim();
			}
		}

		if (getNumber() != null && getNumber().trim().length() > 0) {
			if (summary == null) {
				summary = "";
				summary += getNumber().trim();
			} else {
				summary += " " + getNumber().trim();
			}
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
