package org.cendra.servlet.chapter5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WeatherHtml extends HttpServlet {

	// Some static final variables to populate the page...

	// These would normally come from a database or

	// maybe another servlet that retrieved it as POST data.

	static final int currentTemp = 70;

	static final String currentImage = "/images/rainy.gif";

	static final String[] forecastDay = { "Thursday", "Friday", "Saturday" };

	static final String[] forecastImage = { "/images/sunny.gif",

	"/images/sunny.gif",

	"/images/rainy.gif" };

	static final int[] forecastHi = { 82, 82, 73 };

	static final int[] forecastLo = { 58, 65, 48 };

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");

		PrintWriter out = res.getWriter();

		// Set its title

		String title = "Sebastopol Weather Forecast";

		out.println("<HTML>");

		out.println("<HEAD>");

		out.println("<TITLE>" + title + "</TITLE>");

		out.println("</HEAD>");

		// Start on the body

		out.println("<BODY>");

		// Make a centered table

		out.println("<CENTER>");

		out.println("<TABLE BORDER=1 CELLPADDING=0 CELLSPACING=0 WIDTH=70%>");

		// First row

		out.println("<TR>");

		out.println("<TD><CENTER><B>");

		out.println("<FONT SIZE=+2>Current Conditions</FONT>");

		out.println("</B></CENTER></TD>");

		out.println("<TD><CENTEr>");

		out.println("<IMG WIDTH=48 HEIGHT=35 SRC=\"" + currentImage + "\">");

		out.println("</CENTER></TD>");

		out.println("<TD COLSPAN=2><CENTER><B><FONT SIZE=+2>");

		out.println(currentTemp + "&#176;");

		out.println("</FONT></B></CENTER></TD>");

		out.println("</TR>");

		// Second row

		out.println("<TR>");

		out.println("<TD COLSPAN=2><CENTER><B><FONT SIZE=+1>");

		out.println("Extended Forecast");

		out.println("</FONT></B></CENTER></TD>");

		out.println("<TD><CENTER><B><FONT SIZE=+1>");

		out.println("Hi");

		out.println("</FONT></B></CENTER></TD>");

		out.println("<TD><CENTER><B><FONT SIZE=+1>");

		out.println("Lo");

		out.println("</FONT></B></CENTER></TD>");

		out.println("</TR>");

		// Daily forecast rows

		for (int i = 0; i < forecastDay.length; i++) {

			out.println("<TR>");

			out.println("<TD>&nbsp;<FONT SIZE=+1>");

			out.println(forecastDay[i]);

			out.println("</FONT></TD>");

			out.println("<TD><CENTER>");

			out.println("<IMG WIDTH=48 HEIGHT=35 SRC=\"" + forecastImage[i] + "\">");

			out.println("</CENTER></TD>");

			out.println("<TD><CENTER><FONT SIZE=+1>");

			out.println(forecastHi[i]);

			out.println("</FONT></CENTER></TD>");

			out.println("<TD><CENTER><FONT SIZE=+1>");

			out.println(forecastLo[i]);

			out.println("</FONT></CENTER></TD>");

			out.println("</TR>");

		}

		// Close the still-open tags

		out.println("</TABLE>");

		out.println("</CENTER>");

		out.println("</BODY></HTML>");

	}

}