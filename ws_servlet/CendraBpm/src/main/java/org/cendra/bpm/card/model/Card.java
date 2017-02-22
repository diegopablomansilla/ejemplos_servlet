package org.cendra.bpm.card.model;

public class Card {

	private String id;
	private Boolean erased;
	private CardType cardType;
	private CaseSubject caseSubject;

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

	public CardType getCardType() {
		return cardType;
	}

	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}

	public CaseSubject getCaseSubject() {
		return caseSubject;
	}

	public void setCaseSubject(CaseSubject caseSubject) {
		this.caseSubject = caseSubject;
	}

}
