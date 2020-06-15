package com.HRMS.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRMS.testbase.BaseClass;
import com.HRMS.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods {

	@FindBy(id = "welcome")
	public WebElement welcome;
	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement empName;
	@FindBy(id = "empsearch_id")
	public WebElement empID;
	@FindBy(xpath = "//div[@id='branding']/a[1]/img")
	public WebElement logo;
	@FindBy(id = "menu_admin_Qualifications")
	public WebElement Qual;
	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmp;

	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement PIM;

	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement Admin;

	@FindBy(linkText = "Qualifications")
	public WebElement Qualif;
	@FindBy(xpath = "//*[@id=\"tblSkill\"]/div[1]/h1")
	public WebElement skill;
	
	@FindBy(xpath = "//input[@id='skill_name']")
	public WebElement skillName;
	@FindBy(name = "skill[description]")
	public WebElement descrip;
	@FindBy(id = "skill_code")
	public WebElement skillN;
	@FindBy(id = "skill_years_of_exp")
	public WebElement Experience;
	@FindBy(xpath = "//*[@id=\"btnSkillSave\"]")
	public WebElement savebtn;
	@FindBy(id = "addSkill")
	public WebElement SkAddbtn;

	@FindBy(id = "btnSave")
	public WebElement btnSave;

	@FindBy(xpath = "//div[@class='menu']/ul/li")
	public List<WebElement> dashMenu;

	@FindBy(xpath = "//*[@id='recordsListDiv']/div[1]/h1")
	public WebElement Skill;

	@FindBy(xpath= "//*[@id=\"menu_admin_viewSkills\"]")
	public WebElement viewSkill;

	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement empListPage;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;

	@FindBy(id = "btnAdd")
	public WebElement AddSkillBtn;

	@FindBy(xpath = "//*[@id='resultTable']//tr[1]/td[3]/a")
	public WebElement searchedEmployee;

	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);

	}

	public void navigateToAddEmployee() {
		jsClick(PIM);
		jsClick(addEmp);
	}

	public void navigateToAddSkills() {
		jsClick(savebtn);
	}

	public void navigateToAddSkillsToPerDet() {
		jsClick(btnSave);
	}

	public void navigateToPerDet() {
		jsClick(Qual);
	}

	public void navigateToSkills() {
		jsClick(skill);

	}
}