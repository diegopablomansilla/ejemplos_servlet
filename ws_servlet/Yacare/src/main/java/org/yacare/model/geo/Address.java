package org.yacare.model.geo;

import org.yacare.model.Entity;

public class Address extends Entity {

	private Country country;
	private AdminAreaLevel1 adminAreaLevel1;
	private AdminAreaLevel2 adminAreaLevel2;
	private String locality;
	private String zipCode;
	private String neightbourhood;
	private String street;
	private String streetNumber;
	private String floor;
	private String room;
	private String building;
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

	public String getNeightbourhood() {
		return neightbourhood;
	}

	public void setNeightbourhood(String neightbourhood) {
		this.neightbourhood = neightbourhood;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
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

		if (getStreet() != null && getStreet().trim().length() > 0) {
			if (summary == null) {
				summary = "";
			}
			summary += getStreet().trim();
			if (getStreetNumber() != null && getStreetNumber().trim().length() > 0) {
				summary += " " + getStreetNumber().trim();
			}
		} else {
			if (getStreetNumber() != null && getStreetNumber().trim().length() > 0) {
				if (summary == null) {
					summary = "";
					summary += getStreetNumber().trim();
				} else {
					summary += ", " + getStreetNumber().trim();
				}
			}
		}

		if (getRoom() != null && getRoom().trim().length() > 0) {
			if (summary == null) {
				summary = "";
				summary += getRoom().trim();
			} else {
				summary += " " + getRoom().trim();
			}
			if (getFloor() != null && getFloor().trim().length() > 0) {
				summary += "" + getFloor().trim();
			}
		} else {
			if (getFloor() != null && getFloor().trim().length() > 0) {
				if (summary == null) {
					summary = "";
					summary += getFloor().trim();
				} else {
					summary += " " + getFloor().trim();
				}
			}
		}

		if (getBuilding() != null && getBuilding().trim().length() > 0) {
			if (summary == null) {
				summary = "";
				summary += getBuilding().trim();
			} else {
				summary += ", " + getBuilding().trim();
			}
		}
		if (getNeightbourhood() != null && getNeightbourhood().trim().length() > 0) {
			if (summary == null) {
				summary = "";
				summary += getNeightbourhood().trim();
			} else {
				summary += ", " + getNeightbourhood().trim();
			}
		}
		if (getLocality() != null && getLocality().trim().length() > 0) {
			if (summary == null) {
				summary = "";
				summary += getLocality().trim();
			} else {
				summary += ", " + getLocality().trim();
			}

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
		if (getAdminAreaLevel1() != null && getAdminAreaLevel1().getName() != null && getAdminAreaLevel1().getName().trim().length() > 0) {
			if (summary == null) {
				summary = "";
				summary += getAdminAreaLevel1().getName().trim();
			} else {
				summary += ", " + getAdminAreaLevel1().getName().trim();
			}
		}
		if (getCountry() != null && getCountry().getShortName() != null && getCountry().getShortName().trim().length() > 0) {
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
		// this.summary = summary;
	}

}
