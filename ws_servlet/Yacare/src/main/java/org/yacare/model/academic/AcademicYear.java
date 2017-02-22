package org.yacare.model.academic;

import java.sql.Date;

import org.yacare.model.Entity;

public class AcademicYear extends Entity {

	private Integer year;
	private Date start;
	private Date end;

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

}
