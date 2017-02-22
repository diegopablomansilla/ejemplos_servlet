package org.yacare.model.academic.career;

import org.yacare.model.EntityDomain;

public class Career extends EntityDomain {

	private Integer yearOfImplementation;
	private Cycle[] cycles;

	public Integer getYearOfImplementation() {
		return yearOfImplementation;
	}

	public void setYearOfImplementation(Integer yearOfImplementation) {
		this.yearOfImplementation = yearOfImplementation;
	}

	public Cycle[] getCycles() {
		return cycles;
	}

	public void setCycles(Cycle[] cycles) {
		this.cycles = cycles;
	}

}
