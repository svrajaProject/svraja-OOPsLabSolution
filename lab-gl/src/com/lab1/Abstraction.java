package com.lab1;

/**
 * @author svraja
 * 
 * These methods for creating user credentials
 */
public interface Abstraction {
	/**
	 * it contains number, capital letter, small letter & special character
	 * 
	 * @return password
	 */
	public String generatePassword();
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param department
	 * 
	 * @return email
	 */
	public String generateEmailAddress(String firstName,String lastName, String department);
	/**
	 * 
	 * @param firstName
	 * @param email
	 * @param password
	 */
	public void showCredentials(String firstName,String email,String password);
}
