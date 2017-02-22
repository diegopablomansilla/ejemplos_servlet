package org.cendra.servlet.chapter5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;

@WebServlet(
        name = "HelloWorld5",
        description = "This is my first annotated servlet",
        urlPatterns = "/hello5"
)
public class HelloWorld5 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6849939797968555718L;

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