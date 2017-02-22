package org.cendra.bpm.card.svr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cendra.bpm.card.bo.CardBo;

// http://www.javaworld.com/article/2072592/using-restclient-with-java-s-httpservlet.html

/**
 * 
 * 
 * @author dmansilla (Diego Pablo Mansilla)
 */
public class CardServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2207080821993281751L;

	/**
	 * Servlet method responding to HTTP GET methods calls.
	 *
	 * @param request
	 *            HTTP request.
	 * @param response
	 *            HTTP response.
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// final PrintWriter out = response.getWriter();
		// out.write("GET method (retrieving data) was invoked!");

		CardBo cardBo = new CardBo();

		PrintWriter out = response.getWriter();
		// out.println(cardBo.getCardJsonById(""));
		out.write(cardBo.getAllCardJson());
		out.close();
	}

	/**
	 * Servlet method responding to HTTP POST methods calls.
	 *
	 * @param request
	 *            HTTP request.
	 * @param response
	 *            HTTP response.
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		final PrintWriter out = response.getWriter();
		out.write("POST method (changing data) was invoked!");
	}

	/**
	 * Servlet method responding to HTTP PUT methods calls.
	 *
	 * @param request
	 *            HTTP request.
	 * @param response
	 *            HTTP response.
	 */
	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// final PrintWriter out = response.getWriter();
		// out.write("PUT method (inserting data) was invoked!");

		CardBo cardBo = new CardBo();
		PrintWriter out = response.getWriter();
		out.write(cardBo.createCardJsonByCardJson(request.getReader()));
		out.close();
	}

	/**
	 * Servlet method responding to HTTP DELETE methods calls.
	 *
	 * @param request
	 *            HTTP request.
	 * @param response
	 *            HTTP response.
	 */
	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		final PrintWriter out = response.getWriter();
		out.write("DELETE method (removing data) was invoked!");
	}

	@Override
	public String getServletInfo() {
		return "Server-side application demonstrating HTTP methods.";
	}
}