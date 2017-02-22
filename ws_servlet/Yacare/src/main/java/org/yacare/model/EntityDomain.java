package org.yacare.model;

public class EntityDomain extends Entity {

	private String code;
	private String name;
	private String description;
	private String summary;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSummary() {
		summary = "";
		if (this.getCode() != null) {
			summary += "(" + this.getCode() + ")";
		}
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

	@Override
	public String toString() {
		return getSummary();
	}

}
