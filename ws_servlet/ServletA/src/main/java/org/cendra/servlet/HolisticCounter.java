package org.cendra.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HolisticCounter extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4170271061356625252L;

	static int classCount = 0; // shared by all instances

	int count = 0; // separate for each servlet

	@SuppressWarnings("rawtypes")
	static Hashtable instances = new Hashtable(); // also shared

	@SuppressWarnings("unchecked")
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/plain");

		PrintWriter out = res.getWriter();

		count++;

		out.println("Since loading, this servlet instance has been accessed " + count + " times.");

		// Keep track of the instance count by putting a reference to this

		// instance in a Hashtable. Duplicate entries are ignored.

		// The size() method returns the number of unique instances stored.

		instances.put(this, this);

		out.println("There are currently " + instances.size() + " instances.");

		classCount++;

		out.println("Across all instances, this servlet class has been accessed " + classCount + " times.");

	}

}
