package org.yacare.model.person.communication_options;

import org.yacare.model.geo.Address;

public class Addresses {

	private Address mainAddress;
	private Address[] alternativeAddresses;
	private String summary;

	public Address getMainAddress() {
		return mainAddress;
	}

	public void setMainAddress(Address mainAddress) {
		this.mainAddress = mainAddress;
	}

	public Address[] getAlternativeAddresses() {
		return alternativeAddresses;
	}

	public void setAlternativeAddresses(Address[] alternativeAddresses) {
		this.alternativeAddresses = alternativeAddresses;
	}

	public String getSummary() {
		summary = null;

		if (getMainAddress() != null && getMainAddress().getSummary() != null && getMainAddress().getSummary().trim().length() > 0) {
			if (summary == null) {
				summary = "";
			} 

			summary += getMainAddress().getSummary().trim();
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
