
package com.lab1;

import java.util.Random;

/**
 * @author svraja
 *
 */
public class CredentialService implements Abstraction{

	@Override
	public String generatePassword() {
		
		int first,last,i,randomNumber;
		first  = (int) '!';
		last = (int) '~';
		
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		
		for(i = 0;i < 8; i++) {
			randomNumber = random.nextInt(last-first); //0 93
			randomNumber = randomNumber+first;
			
			char randomChar = (char) randomNumber;
			sb.append(randomChar);
		}
		return sb.toString();
	}

	@Override
	public String generateEmailAddress(String firstName,String lastName, String department) {
		
		String email = firstName+lastName+"@"+department+".company"+".com";
		return email;
	}

	@Override
	public void showCredentials(String firstName,String email,String password) {
		System.out.printf("Dear %s your generated credentials are as follows \n"
				+ "Email: %s \n"
				+ "Password: %s",firstName,email,password);
	
	}

}
