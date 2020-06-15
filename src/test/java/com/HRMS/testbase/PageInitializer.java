package com.HRMS.testbase;

import com.HRMS.pages.AddEmployeePageElements;
import com.HRMS.pages.DashboardPageElements;
import com.HRMS.pages.LoginPageElements;
import com.HRMS.pages.PersonalDetailsPageElements;

//initializes all pages class and stores references in static varibales
//that will called/used in test classes
public class PageInitializer extends BaseClass{

	public static com.HRMS.pages.LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static com.HRMS.pages.DashboardPageElements dashboard;
	public static com.HRMS.pages.PersonalDetailsPageElements pdetails;
	public static void initialize() {
	
		login=new com.HRMS.pages.LoginPageElements();
		dashboard=new com.HRMS.pages.DashboardPageElements();
		addEmp=new AddEmployeePageElements();
		pdetails=new com.HRMS.pages.PersonalDetailsPageElements();
		
	}
}
