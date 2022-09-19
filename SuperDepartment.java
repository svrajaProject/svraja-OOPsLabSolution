package com.gl.oopsassignment.shedular;

/**
 * @author svraja
 *
 */
public abstract class SuperDepartment {
	/**
	 * @param Not acceptable
	 * 
	 * @return String
	 */
	String departmentName() {
		return "Super Department";
	}
	/**
	 * @param Not acceptable
	 * 
	 * @return String
	 */
	String getTodaysWork() {
		return "No Work as of now";
	}
	/**
	 * @param Not acceptable
	 * 
	 * @return String
	 */
	String getWorkDeadline(){
		return "Nil";
	}
	/**
	 * @param Not acceptable
	 * 
	 * @return String
	 */
	String isTodayAHoliday(){
		return "Today is not a Holiday";
	}
}
