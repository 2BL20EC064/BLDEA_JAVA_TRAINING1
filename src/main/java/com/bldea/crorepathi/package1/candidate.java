package com.bldea.crorepathi.package1;

public class candidate {
	private String name;
	private int age;
	private String city;
	private String state;
	private static int amount;

/**
	 * @param name
	 * @param age
	 * @param city
	 * @param state
	 */
	public candidate(String name, int age, String city, String state) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.state = state;
		
	}
	public static void setAmount(int amt) {
		amount = amt;
	}
	public int getAmount() {
		return amount;
	}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public String getCity() {
	return city;
}
public String getState() {
	return state;
}



}

