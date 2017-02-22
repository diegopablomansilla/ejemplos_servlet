package org.cendra.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitCounter extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6652098416902832965L;
	int count;

	public void init(ServletConfig config) throws ServletException {

		super.init(config);

		String initial = config.getInitParameter("initial");

		try {

			count = Integer.parseInt(initial);

		}

		catch (NumberFormatException e) {

			count = 0;

		}

	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/plain");

		PrintWriter out = res.getWriter();

		count++;

		out.println("Since loading (and with a possible initialization");

		out.println("parameter figured in), this servlet has been accessed");

		out.println(count + " times.");

	}

}
