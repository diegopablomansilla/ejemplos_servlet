package org.yacare.model.geo;

public class GeoLocation {

	private Country country;
	private AdminAreaLevel1 adminAreaLevel1;
	private AdminAreaLevel2 adminAreaLevel2;
	private String locality;
	private String zipCode;
	private GeoCoordinates geoCoordinates;
	private String comment;
	private String summary;

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public AdminAreaLevel1 getAdminAreaLevel1() {
		return adminAreaLevel1;
	}

	public void setAdminAreaLevel1(AdminAreaLevel1 adminAreaLevel1) {
		this.adminAreaLevel1 = adminAreaLevel1;
	}

	public AdminAreaLevel2 getAdminAreaLevel2() {
		return adminAreaLevel2;
	}

	public void setAdminAreaLevel2(AdminAreaLevel2 adminAreaLevel2) {
		this.adminAreaLevel2 = adminAreaLevel2;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public GeoCoordinates getGeoCoordinates() {
		return geoCoordinates;
	}

	public void setGeoCoordinates(GeoCoordinates geoCoordinates) {
		this.geoCoordinates = geoCoordinates;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getSummary() {
		summary = null;
		
		if (getLocality() != null && getLocality().trim().length() > 0) {
			if (summary == null) {
				summary = "";
			}
			summary += getLocality().trim();
		}
		if (getZipCode() != null && getZipCode().trim().length() > 0) {
			if (summary == null) {
				summary = "";
				summary += getZipCode().trim();
			} else {
				summary += " (" + getZipCode().trim() + ")";
			}			
		}
		if (getAdminAreaLevel2() != null && getAdminAreaLevel2().getName() != null && getAdminAreaLevel2().getName().trim().length() > 0) {
			if (summary == null) {
				summary = "";
				summary += getAdminAreaLevel2().getName().trim();
			} else {
				summary += ", " + getAdminAreaLevel2().getName().trim();
			}			
		}
		if (getAdminAreaLevel1() != null && getAdminAreaLevel1().getName() != null &&  getAdminAreaLevel1().getName().trim().length() > 0) {
			if (summary == null) {
				summary = "";
				summary += getAdminAreaLevel1().getName().trim();
			} else {
				summary += ", " + getAdminAreaLevel1().getName().trim();
			}			
		}
		if (getCountry() != null && getCountry().getShortName() != null &&  getCountry().getShortName().trim().length() > 0) {
			if (summary == null) {
				summary = "";
				summary += getCountry().getShortName().trim();
			} else {
				summary += ", " + getCountry().getShortName().trim();
			}			
		}
		
		if (summary != null) {
			summary = summary.trim();
		} 	
		
		return summary;
	}

	public void setSummary(String summary) {
//		this.summary = summary;
	}

}
