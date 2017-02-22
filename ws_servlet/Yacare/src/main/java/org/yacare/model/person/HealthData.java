package org.yacare.model.person;

import org.yacare.model.health.BloodFactor;
import org.yacare.model.health.BloodGroup;
import org.yacare.model.health.HealthCoverage;

public class HealthData {

	private BloodFactor bloodFactor;
	private BloodGroup bloodGroup;
	private HealthCoverage healthCoverage;

	public BloodFactor getBloodFactor() {
		return bloodFactor;
	}

	public void setBloodFactor(BloodFactor bloodFactor) {
		this.bloodFactor = bloodFactor;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public HealthCoverage getHealthCoverage() {
		return healthCoverage;
	}

	public void setHealthCoverage(HealthCoverage healthCoverage) {
		this.healthCoverage = healthCoverage;
	}

}
