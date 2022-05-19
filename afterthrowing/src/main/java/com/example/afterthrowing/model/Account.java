package com.example.afterthrowing.model;

public class Account {
	
	private String aNumber;
	private String aType;
	
	public Account(String aNumber, String aType) {
		super();
		this.aNumber = aNumber;
		this.aType = aType;
	}

	public String getaNumber() {
		return aNumber;
	}

	public void setaNumber(String aNumber) {
		this.aNumber = aNumber;
	}

	public String getaType() {
		return aType;
	}

	public void setaType(String aType) {
		this.aType = aType;
	}

	@Override
	public String toString() {
		return "Account [aNumber=" + aNumber + ", aType=" + aType + "]";
	}
	
	
	

}
