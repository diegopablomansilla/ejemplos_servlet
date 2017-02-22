package org.yacare.model.person.communication_options;

public class Phones {

	private Phone mainPhone;
	private Phone[] alternativePhones;
	private String summary;

	public Phone getMainPhone() {
		return mainPhone;
	}

	public void setMainPhone(Phone mainPhone) {
		this.mainPhone = mainPhone;
	}

	public Phone[] getAlternativePhones() {
		return alternativePhones;
	}

	public void setAlternativePhones(Phone[] alternativePhones) {
		this.alternativePhones = alternativePhones;
	}

	public String getSummary() {
		summary = null;

		if (getMainPhone() != null && getMainPhone().getSummary() != null && getMainPhone().getSummary().trim().length() > 0) {
			if (summary == null) {
				summary = "";
			} 

			summary += getMainPhone().getSummary().trim();
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
