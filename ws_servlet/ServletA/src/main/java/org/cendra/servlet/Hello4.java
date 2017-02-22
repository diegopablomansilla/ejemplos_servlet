package org.cendra.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello4 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1504086730050032644L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// Set the Content-Type header

		res.setContentType("text/html");
		// Return early if this is a HEAD

		if (req.getMethod().equals("HEAD"))
			return;

		// Proceed otherwise

		PrintWriter out = res.getWriter();

		String name = req.getParameter("name");

		out.println("<HTML>");

		out.println("<HEAD><TITLE>Hello, " + name + "</TITLE></HEAD>");

		out.println("<BODY>");

		out.println("Hello, " + name);

		out.println("</BODY></HTML>");

	}

}
