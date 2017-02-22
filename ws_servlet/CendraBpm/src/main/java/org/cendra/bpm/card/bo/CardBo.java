package org.cendra.bpm.card.bo;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.UUID;

import org.cendra.bpm.card.model.Card;
import org.cendra.bpm.card.model.CardType;
import org.cendra.bpm.card.model.CaseSubject;
import org.cendra.bpm.card.model.CaseSubjectType;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class CardBo {

	public String getCardJsonById(String id) {

		ObjectMapper mapper = new ObjectMapper();

		String json;
		try {
			json = mapper.writeValueAsString(getCardById(id));
			return json;
		} catch (JsonGenerationException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} catch (JsonMappingException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}

	}

	public Card getCardById(String id) {

		Card card = new Card();
		card.setId(UUID.randomUUID().toString());

		CardType cardType = new CardType();
		cardType.setId(UUID.randomUUID().toString());

		card.setCardType(cardType);

		return card;
	}

	public String getAllCardJson() {

		ObjectMapper mapper = new ObjectMapper();

		String json;
		try {
			json = mapper.writeValueAsString(getAllCard());
			return json;
		} catch (JsonGenerationException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} catch (JsonMappingException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}

	}

	public Card[] getAllCard() {

		Card[] cards = new Card[2];

		Card card = new Card();
		card.setId(UUID.randomUUID().toString());

		CardType cardType = new CardType();
		cardType.setId(UUID.randomUUID().toString());
		cardType.setCode("34");
		cardType.setTitle("Verificación de CUIT");
		cardType.setDescription("Debe verificar la constancia de CUIT y CUIL del contrato en el sitio web de AFIP y ANSES. Además debe adjuntar las constancias.");
		cardType.setErased(false);
		card.setCardType(cardType);

		CaseSubject caseSubject = new CaseSubject();
		caseSubject.setId(UUID.randomUUID().toString());
		caseSubject.setCode("456/56/2016");
		caseSubject.setTitle("27656133 Diego Pablo Mansilla");
		caseSubject.setDescription("Contrato de Diego Pablo Mansilla.");
		caseSubject.setErased(false);

		CaseSubjectType caseSubjectType = new CaseSubjectType();
		caseSubjectType.setId(UUID.randomUUID().toString());
		caseSubjectType.setCode("34");
		caseSubjectType.setTitle("Verificación de CUIT");
		caseSubjectType.setDescription("Debe verificar la constancia de CUIT y CUIL del contrato en el sitio web de AFIP y ANSES. Además debe adjuntar las constancias.");
		caseSubjectType.setErased(false);
		caseSubject.setCaseSubjectType(caseSubjectType);

		card.setCaseSubject(caseSubject);

		cards[0] = card;

		Card card2 = new Card();
		card2.setId(UUID.randomUUID().toString());

		CardType cardType2 = new CardType();
		card2.setId(UUID.randomUUID().toString());

		card2.setCardType(cardType);

		cards[1] = card2;

		return cards;
	}

	public String createCardJsonByCardJson(BufferedReader cardJsonReader) {
		ObjectMapper mapper = new ObjectMapper();

		try {

			Card card = createCard(mapper.readValue(cardJsonReader, Card.class));
			String cardJson = mapper.writeValueAsString(card);
			return cardJson;

		} catch (JsonGenerationException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} catch (JsonMappingException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public String createCardJsonByCardJson(String cardJson) {

		ObjectMapper mapper = new ObjectMapper();

		try {

			Card card = createCard(mapper.readValue(cardJson, Card.class));
			cardJson = mapper.writeValueAsString(card);
			return cardJson;

		} catch (JsonGenerationException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} catch (JsonMappingException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}

	public Card createCardByCardJson(String cardJson) {

		ObjectMapper mapper = new ObjectMapper();

		try {

			return createCard(mapper.readValue(cardJson, Card.class));

		} catch (JsonGenerationException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} catch (JsonMappingException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}

	public Card createCard(Card card) {

		return card;
	}

}
