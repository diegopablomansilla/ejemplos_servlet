package org.yacare.model.person;

import org.yacare.model.Entity;
import org.yacare.model.person.communication_options.CommunicationOptions;

public class Person extends Entity {

	private String urlPhoto;
	private String[] names;
	private String[] lastNames;
	private Gender gender;
	private Birth birth;
	private Nationalities nationalities;
	private IdentityDocuments identityDocuments;
	private CommunicationOptions communicationOptions;
	private HealthData healthData;
	private String summary;

	public String getUrlPhoto() {
		return urlPhoto;
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public String[] getLastNames() {
		return lastNames;
	}

	public void setLastNames(String[] lastNames) {
		this.lastNames = lastNames;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Birth getBirth() {
		return birth;
	}

	public void setBirth(Birth birth) {
		this.birth = birth;
	}

	public Nationalities getNationalities() {
		return nationalities;
	}

	public void setNationalities(Nationalities nationalities) {
		this.nationalities = nationalities;
	}

	public IdentityDocuments getIdentityDocuments() {
		return identityDocuments;
	}

	public void setIdentityDocuments(IdentityDocuments identityDocuments) {
		this.identityDocuments = identityDocuments;
	}

	public CommunicationOptions getCommunicationOptions() {
		return communicationOptions;
	}

	public void setCommunicationOptions(CommunicationOptions communicationOptions) {
		this.communicationOptions = communicationOptions;
	}

	public HealthData getHealthData() {
		return healthData;
	}

	public void setHealthData(HealthData healthData) {
		this.healthData = healthData;
	}

	public String getSummary() {
		summary = null;

//		if (getMainPhone() != null && getMainPhone().getSummary() != null && getMainPhone().getSummary().trim().length() > 0) {
//			if (summary == null) {
//				summary = "";
//			} 
//
//			summary += getMainPhone().getSummary().trim();
//		}
//
//		if (summary != null) {
//			summary = summary.trim();
//		}
		return summary;
	}

	public void setSummary(String summary) {
		// this.summary = summary;
	}

}
