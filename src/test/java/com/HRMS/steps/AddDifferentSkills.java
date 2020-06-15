package com.HRMS.steps;

import org.openqa.selenium.By;

import com.HRMS.utils.CommonMethods;
import com.HRMS.utils.ConfigsReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddDifferentSkills extends CommonMethods{

//	@Given("user is  logged in HRMS with valid admin credentials")
// public void user_logged_in_HRMS_with_valid_admin_credentials() {
//	sendText(login.username, ConfigsReader.getProperty("username"));
//	sendText(login.password, ConfigsReader.getProperty("password"));
//	 click(login.loginBtn);
// }
@And("user clicks on PIM label and navigates to Employee List label")
public void user_clicks_on_PIM_label_and_navigates_to_Employee_List_label() {
	jsClick(dashboard.PIM);
	   jsClick(dashboard.empListPage);
	   wait(4);
}
@And("user enters employee name {string} and ID {string} and click on search button")
public void user_enters_employee_name_and_ID_and_click_on_search_button(String uName,String uid) {
	
	 jsClick(dashboard.empName);
	 wait(10);
	sendText(dashboard.empName,uName );
	sendText(dashboard.empID,uid);
	click(dashboard.searchBtn);
}
@And("user clicks on employee name on the list")
public void user_clicks_on_employee_name_on_the_list() {
    jsClick(dashboard.searchedEmployee);
}

@When("user click on qualifications")
public void user_click_on_qualifications() {
	jsClick(dashboard.Qualif);
}

@When("user click on Add Skill and selects {string}  enter  {string} years of experience")
public void user_click_on_Add_Skill_and_selects_Accountancy_and_enter_years_of_experience(String skills,String year) {
	click(dashboard.SkAddbtn);
	selectDdValue(dashboard.skillN, skills);
	selectDdValue(dashboard.Experience,year);
}

@And("clicks on  save button")
public void clicks_on_add_save_button() {
	jsClick(dashboard.savebtn);
	
}
}
