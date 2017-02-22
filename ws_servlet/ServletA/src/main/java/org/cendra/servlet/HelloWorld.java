package org.cendra.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4425255842902724697L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");

		PrintWriter out = res.getWriter();

		out.println("<HTML>");

		out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");

		out.println("<BODY>");

		out.println("<BIG>Hello World</BIG>");

		out.println("</BODY></HTML>");

	}

}
