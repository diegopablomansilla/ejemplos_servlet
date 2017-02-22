package org.cendra.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld3 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4425255842902724697L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");

		PrintWriter out = res.getWriter();

		String name = req.getParameter("name");

		System.out.println(name);

		out.println("<HTML>");

		out.println("<HEAD>");

		out.println("<TITLE>Introductions</TITLE>");

		out.println("</HEAD>");

		out.println("<BODY>");

		out.println("<FORM METHOD=GET ACTION=\"/servleta/hello2\">If you don't mind me asking, what is your name?<INPUT TYPE=TEXT NAME=\"name\"><P>");

		out.println("<INPUT TYPE=SUBMIT>");

		out.println("</FORM>");

		out.println("</BODY>");

		out.println("</HTML>");

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		doGet(req, res);
	}

	public String getServletInfo() {

		return "A servlet that knows the name of the person to whom it's saying hello";

	}

}
