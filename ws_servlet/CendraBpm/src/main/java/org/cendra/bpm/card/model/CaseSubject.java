package org.cendra.bpm.card.model;

public class CaseSubject {

	private String id;
	private Boolean erased;
	private String code;
	private String title;
	private String description;
	private CaseSubjectType caseSubjectType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getErased() {
		return erased;
	}

	public void setErased(Boolean erased) {
		this.erased = erased;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CaseSubjectType getCaseSubjectType() {
		return caseSubjectType;
	}

	public void setCaseSubjectType(CaseSubjectType caseSubjectType) {
		this.caseSubjectType = caseSubjectType;
	}

}
