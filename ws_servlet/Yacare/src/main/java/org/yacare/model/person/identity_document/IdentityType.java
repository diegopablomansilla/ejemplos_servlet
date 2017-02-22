package org.yacare.model.person.identity_document;

import org.yacare.model.EntityDomain;
import org.yacare.model.geo.Country;

public class IdentityType extends EntityDomain {

	private Country issuingCountry;

	public Country getIssuingCountry() {
		return issuingCountry;
	}

	public void setIssuingCountry(Country issuingCountry) {
		this.issuingCountry = issuingCountry;
	}

}
