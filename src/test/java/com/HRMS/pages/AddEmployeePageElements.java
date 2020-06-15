package com.HRMS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRMS.utils.CommonMethods;
import com.HRMS.utils.ConfigsReader;

public class AddEmployeePageElements extends CommonMethods {

	public static final String empId = null;

	@FindBy(id = "firstName")
	public WebElement firstName;

	@FindBy(id = "lastName")
	public WebElement lastName;
	@FindBy(xpath="//input[@id='middleName']")
	public WebElement middleName;
	@FindBy(id = "employeeId")
	public WebElement employeeId;

	@FindBy(id = "chkLogin")
	public WebElement checkboxLoginDetails;

	@FindBy(id = "user_name")
	public WebElement username;

	@FindBy(id = "user_password")
	public WebElement password;
	@FindBy(id="re_password")
	public WebElement confirmPassword;
	@FindBy(id = "btnSave")
	public WebElement saveBtn;

	public AddEmployeePageElements() {
		PageFactory.initElements(driver, this);
	}

	public void CreateEmpLoginCR(String uid, String pwd) {
		sendText(username,uid);
		sendText(password,pwd);
		sendText(confirmPassword,ConfigsReader.getProperty("empPassword"));
		click(saveBtn);
	}
		
	}


