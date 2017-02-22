package org.yacare.model.geo;


public class Nationality {

	private Country country;
	private String comment;
	private String summary;

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getSummary() {
		summary = null;
		
		if (getCountry() != null && getCountry().getNationalityName() != null &&  getCountry().getNationalityName().trim().length() > 0) {
			if (summary == null) {
				summary = "";
				summary += getCountry().getNationalityName().trim();
			} else {
				summary += ", " + getCountry().getNationalityName().trim();
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
