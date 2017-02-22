package org.yacare.model.person;

import java.sql.Date;

import org.yacare.model.geo.GeoLocation;

public class Birth {

	private Date birthDate;
	private Integer age;
	private String fullAge;
	private GeoLocation geoLocation;
	private String summary;

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFullAge() {
		return fullAge;
	}

	public void setFullAge(String fullAge) {
		if (fullAge != null && fullAge.trim().length() > 0) {
			String[] t = fullAge.trim().split(" ");
			for (int i = 0; i < t.length; i++) {
				if (i == 0) {
					fullAge = t[i];
				} else if (i == 1) {
					fullAge += " " + t[i];
				} else if (i == 2) {
					if (i == t.length - 2) {
						fullAge += " y " + t[i];
					} else {
						fullAge += ", " + t[i];
					}
				} else if (i == 3) {
					fullAge += " " + t[i];
				} else if (i == 4) {
					if (i == t.length - 2) {
						fullAge += " y " + t[i];
					} else {
						fullAge += ", " + t[i];
					}
				} else if (i == 5) {
					fullAge += " " + t[i];
				}
			}

			// System.out.println(fullAge.split(" ").length);

		}
		this.fullAge = fullAge;

	}

	public GeoLocation getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}

	public String getSummary() {
		summary = null;
		
		if (getFullAge() != null && getFullAge().trim().length() > 0) {
			if (summary == null) {
				summary = "";
			}
			summary += "edad " + getFullAge().trim();
		}
		if (getBirthDate() != null) {
			if (summary == null) {
				summary = "";
			} else {
				summary += ", ";
			}
			summary += "nacido el " + getBirthDate().toLocaleString().split(" ")[0];
		}

		if (getGeoLocation() != null && getGeoLocation().getSummary() != null && getGeoLocation().getSummary().trim().length() > 0) {
			if (summary == null) {
				summary = "nacido en ";
			} else {
				summary += ", en ";
			}
			summary += getGeoLocation().getSummary();
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
