package org.cendra.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleCounter extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2306732807013131359L;

	int count = 0;

	public synchronized void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/plain");

		PrintWriter out = res.getWriter();

		count++;

		out.println("Since loading, this servlet has been accessed " + count + " times.");

	}

}
