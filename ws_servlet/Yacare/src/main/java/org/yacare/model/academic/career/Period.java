package org.yacare.model.academic.career;

import org.yacare.model.EntityDomain;

public class Period extends EntityDomain {

	private Integer number;
	private Cycle cycle;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Cycle getCycle() {
		return cycle;
	}

	public void setCycle(Cycle cycle) {
		this.cycle = cycle;
	}

}
