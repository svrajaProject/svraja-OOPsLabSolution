package com.lab1;

import java.util.Scanner;

/**
 * @author svraja
 *
 */
public class Driver {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Employee emp = new Employee("raja","tinku");
	CredentialService cs = new CredentialService();
	String fName = emp.getFirstName();
	String lName = emp.getLastName();
	String department;
	System.out.println("Please enter the department from the following \n"
			+ "1.Technical \n"
			+ "2.Admin \n"
			+ "3.Human Resource \n"
			+ "4.Legal \n");
	int option = sc.nextInt();
	switch(option) {
	case 1:
		department="tech";
		break;
	case 2:
		department="admin";		
		break;
	case 3:
		department="hr";
		break;
	case 4:
		department="lgl";
		break;
	default: throw new IllegalArgumentException();
	
	}
	String email = cs.generateEmailAddress(fName,lName,department);
	String password = cs.generatePassword();
	cs.showCredentials(fName,email,password);
	sc.close();

	}

}
	