package ch04.rc;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.Request;

class ClientRC {

	// private static final String url = "http://localhost:8080/rc/fib";
	private static final String url = "http://localhost:8080/servleta/fib";

	public static void main(String[] args) {
		new ClientRC().send_requests();
	}

	private void send_requests() {

		try {

	
			
			
			HttpURLConnection conn = null;
			
			//------------------------------------------------------------------

			System.out.println("\n\nPOST request to create some Fibonacci numbers.\n");		
			
			List<Integer> nums = new ArrayList<Integer>();
			for (int i = 1; i < 15; i++) {
				nums.add(i);
			}
			System.out.println("The POST:\t" + nums);	
			
			String payload = URLEncoder.encode("nums", "UTF-8") + "=" + URLEncoder.encode(nums.toString(), "UTF-8");
			
			// Send the request
			conn = get_connection(url, "POST");
			conn.setRequestProperty("accept", "text/xml");
			DataOutputStream out = new DataOutputStream(conn.getOutputStream());
			System.out.println("The POST:\t" + payload);			
			out.writeBytes(payload);
			out.flush();
			get_response(conn);
			
			//------------------------------------------------------------------
			
			System.out.println("\n\nGET to test whether POST worked.\n");

			// GET to test whether POST worked
			conn = get_connection(url, "GET");
			conn.addRequestProperty("accept", "text/xml");
			conn.connect();
			get_response(conn);
			
			conn = get_connection(url + "?num=12", "GET");
			conn.addRequestProperty("accept", "text/plain");
			conn.connect();
			get_response(conn);
			
			//------------------------------------------------------------------

			
			System.out.println("\n\nDELETE request.\n");
			conn = get_connection(url + "?num=12", "DELETE");
			conn.addRequestProperty("accept", "text/xml");
			conn.connect();
			get_response(conn);

			System.out.println("\n\nGET request to test whether DELETE worked.\n");
			conn = get_connection(url + "?num=12", "GET");
			conn.addRequestProperty("accept", "text/html");
			conn.connect();
			get_response(conn);
			
			System.out.println("\n\nGET request to test whether DELETE worked.\n");
			conn = get_connection(url + "?num=2", "GET");
			conn.addRequestProperty("accept", "text/html");
			conn.connect();
			get_response(conn);
			
			conn = get_connection(url + "?num=2", "GET");
			conn.addRequestProperty("accept", "text/plain");
			conn.connect();
			get_response(conn);
			
			//------------------------------------------------------------------
			
		} catch (IOException e) {
			System.err.println(e);
		} catch (NullPointerException e) {
			System.err.println(e);
		}
	}

	private HttpURLConnection get_connection(String url_string, String verb) {

		HttpURLConnection conn = null;

		try {
			URL url = new URL(url_string);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod(verb);
			conn.setDoInput(true);
			conn.setDoOutput(true);
		} catch (MalformedURLException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}

		return conn;
	}

	private void get_response(HttpURLConnection conn) {

		try {

			String xml = "";
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String next = null;
			while ((next = reader.readLine()) != null) {
				xml += next;
			}
			System.out.println("The response:\t" + xml);
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
