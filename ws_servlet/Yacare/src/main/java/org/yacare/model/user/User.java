package org.yacare.model.user;

import org.yacare.model.person.Person;

public class User extends Person {

	private String userPass;
	private UserState userState;

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public UserState getUserState() {
		return userState;
	}

	public void setUserState(UserState userState) {
		this.userState = userState;
	}

}
