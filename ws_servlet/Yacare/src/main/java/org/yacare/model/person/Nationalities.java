package org.yacare.model.person;

import org.yacare.model.geo.Nationality;

public class Nationalities {

	private Nationality mainNationality;
	private Nationality[] nationalities;
	private String summary;

	public Nationality getMainNationality() {
		return mainNationality;
	}

	public void setMainNationality(Nationality mainNationality) {
		this.mainNationality = mainNationality;
	}

	public Nationality[] getNationalities() {
		return nationalities;
	}

	public void setNationalities(Nationality[] nationalities) {
		this.nationalities = nationalities;
	}

	public String getSummary() {
		summary = null;

		if (getMainNationality() != null && getMainNationality().getSummary() != null && getMainNationality().getSummary().trim().length() > 0) {
			if (summary == null) {
				summary = "";
			} 

			summary += getMainNationality().getSummary().trim();
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
