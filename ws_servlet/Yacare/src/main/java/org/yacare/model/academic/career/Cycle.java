package org.yacare.model.academic.career;

import org.yacare.model.EntityDomain;

public class Cycle extends EntityDomain {

	private Integer number;
	private Period[] periods;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Period[] getPeriods() {
		return periods;
	}

	public void setPeriods(Period[] periods) {
		this.periods = periods;
	}

}
