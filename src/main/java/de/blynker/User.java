package de.blynker;

public class User {
	String name;
	String firstname;
	public User(String name, String firstname) {
		this.firstname = firstname;
		this.name = name;
	}
	@Override
	public String toString() {
		return firstname + " " + name ;
	}
	
}
