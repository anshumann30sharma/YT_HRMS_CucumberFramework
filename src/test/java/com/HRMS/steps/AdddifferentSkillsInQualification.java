package com.HRMS.steps;

import java.awt.Desktop.Action;

import org.openqa.selenium.interactions.Actions;

import com.HRMS.utils.CommonMethods;
import com.HRMS.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdddifferentSkillsInQualification extends CommonMethods {
	@Given("user is  logged in HRMS with valid admin credentials")
	public void user_logged_in_HRMS_with_valid_admin_credentials() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
	}

	@When("user clicks on Admin label and navigates to Qualification label")
	public void user_navigates_to_qualifications_Page() {
		jsClick(dashboard.Admin);
		jsClick(dashboard.Qualif);
		wait(4);
	}

	@When("click on Skill label and click again on  Add Skill button")
	public void click_on_Skill_label_and_click_again_on_Add_Skill_button() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(dashboard.Qualif).clickAndHold().perform();
		act.moveToElement(dashboard.viewSkill).click().perform();
		Thread.sleep(3000);
		click(dashboard.AddSkillBtn);

	}

	@Then("user add {string} skill and {string}")
	public void i_add_name_of_the_vocational_skill(String skills, String description) {
		sendText(dashboard.skillName, skills);
		sendText(dashboard.descrip, description);
	}

	@Then("click save button and vocational skill is saved")
	public void add_save_button_and_vocational_skill_is_saved() {
		jsClick(dashboard.btnSave);
	}
}
