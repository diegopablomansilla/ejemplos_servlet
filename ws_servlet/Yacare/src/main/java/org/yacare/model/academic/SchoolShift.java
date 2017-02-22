package org.yacare.model.academic;

import java.sql.Time;

import org.yacare.model.EntityDomain;

public class SchoolShift extends EntityDomain {

	private Time start;
	private Time end;

	public Time getStart() {
		return start;
	}

	public void setStart(Time start) {
		this.start = start;
	}

	public Time getEnd() {
		return end;
	}

	public void setEnd(Time end) {
		this.end = end;
	}

}
