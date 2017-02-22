package org.yacare.model.health;

import org.yacare.model.EntityDomain;

public class BloodFactor extends EntityDomain {

	private String summary;

	public String getSummary() {
		summary = "";
		
		if (this.getName() != null) {
			summary += " " + this.getName();
		}

		summary = summary.trim();
		if (summary.trim().length() == 0) {
			summary = null;
		}

		return summary;
	}

	public void setSummary(String summary) {
		// this.summary = summary;
	}

}
