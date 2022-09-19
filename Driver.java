package com.gl.oopsassignment.shedular;

/**
 * @author svraja
 *
 */
public class Driver extends SuperDepartment{

	public static void main(String[] args) {
		
//		Here I have created object for "SuperDepartment" abstract class with help of non-static class "Driver"
		Driver sd = new Driver();
		String deptName = sd.departmentName();
		String todaysWork = sd.getTodaysWork();
		String workDeadline = sd.getWorkDeadline();
		String isTodayHoliday = sd.isTodayAHoliday();
		System.out.println("Welcome to "
				+deptName+"\n"
				+todaysWork+"\n"
				+workDeadline+"\n"
				+isTodayHoliday+"\n");
		
//		Creating object for AminDepartment class and calling all the methods including 1 superDepartment class method
		AdminDepartment ad = new AdminDepartment();
		String deptName1 = ad.departmentName();
		String todaysWork1 = ad.getTodaysWork();
		String workDeadline1 = ad.getWorkDeadline();
		
//		SuperDepartment method "isTodayHoliday" is calling with help of AdminDepartment object "ad"
//		Because AdminDepartment class already extends SuperDepartment class
		String isTodayHoliday1 = ad.isTodayAHoliday();
		
		System.out.println("Welcome to "
				+deptName1+"\n"
				+todaysWork1+"\n"
				+workDeadline1+"\n"
				+isTodayHoliday1+"\n");
		
//		Creating object for HrDepartment class and calling all the methods including 1 superDepartment class  method
		HrDepartment hd = new HrDepartment(); 
		String deptName2 = hd.departmentName();
		String todaysWork2 = hd.getTodaysWork();
		String workDeadline2 = hd.getWorkDeadline();
		String doActivity = hd.doActivity();
		
//		SuperDepartment method "isTodayHoliday" is calling with help of HrDepartment object "hd"
//		Because HrDepartment class already extends SuperDepartment class
		String isTodayHoliday2 = ad.isTodayAHoliday();
		System.out.println("Welcome to "
				+deptName2+"\n"
				+doActivity+"\n"
				+todaysWork2+"\n"
				+workDeadline2+"\n"
				+isTodayHoliday2+"\n"); 
		
//		Creating object for TechDepartment class and calling all the methods including 1 superDepartment class  method
		TechDepartment td = new TechDepartment();
		String deptName3 = td.departmentName();
		String todaysWork3 = td.getTodaysWork();
		String workDeadline3 = td.getWorkDeadline();
		String techInfo = td.getTechStackInformation();
//		SuperDepartment method "isTodayHoliday" is calling with help of TechDepartment object "td"
//		Because TechDepartment class already extends SuperDepartment class	
		String isTodayHoliday3 = ad.isTodayAHoliday();
		System.out.println("Welcome to "
				+deptName3+"\n"
				+todaysWork3+"\n"
				+workDeadline3+"\n"
				+techInfo+"\n"
				+isTodayHoliday3+"\n"); 
	}

}
