package com.danielwatrous.testrestservlet;

import java.util.ArrayList;
import java.util.List;

public class DataClass {

	private int id = 1;

	private String name = "Test Class";

	private List<String> messages = new ArrayList<String>() {
		{
			add("msg 1");
			add("msg 2");
			add("msg 3");
		}
	};

	public String toString() {
		return "User [id=" + id + ", name=" + name + ", " + "messages=" + messages + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
}