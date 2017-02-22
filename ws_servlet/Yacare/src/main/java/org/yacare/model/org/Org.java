package org.yacare.model.org;

import org.yacare.model.Entity;
import org.yacare.model.geo.Country;

public class Org extends Entity {

	private String shortName;
	private String name;
	private String urlPhoto;
	private String webSite;
	private String description;
	private Country country;

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrlPhoto() {
		return urlPhoto;
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getComment() {
		return description;
	}

	public void setComment(String comment) {
		this.description = comment;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
