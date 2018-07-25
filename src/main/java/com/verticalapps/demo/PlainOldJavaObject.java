package com.verticalapps.demo;

/**
 * POJO for example app
 * 
 * @author Justin Lea
 *
 */
public class PlainOldJavaObject {
	private String thing1;
	private String thing2;

	/**
	 * Constructor to build this POJO
	 * 
	 * @param thang1 Does not matter, just send in a String
	 * @param thang2 Does not matter either, just send in a String
	 */
	public PlainOldJavaObject(String thing1, String thing2) {
		this.thing1 = thing1;
		this.thing2 = thing2;
	}

	/**
	 * @return Meaningless String that only exists for this example application
	 */
	public String getThing1() {
		return thing1;
	}

	/**
	 * @param thing1 Any String
	 */
	public void setThing1(String thing1) {
		this.thing1 = thing1;
	}

	/**
	 * @return Other meaningless String that only exists for this example
	 *         application
	 */
	public String getThing2() {
		return thing2;
	}

	/**
	 * @param thing2 Any String
	 */
	public void setThing2(String thing2) {
		this.thing2 = thing2;
	}

	@Override
	public boolean equals(Object pojo) {
		if (!(pojo instanceof PlainOldJavaObject))
			return false;
		else {
			PlainOldJavaObject other = (PlainOldJavaObject) pojo;
			return ((this.getThing1().equals(other.getThing1()) && this.getThing2().equals(other.getThing2())));
		}

	}

}
