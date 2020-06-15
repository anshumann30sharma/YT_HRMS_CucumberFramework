#Author: your.email@your.domain.com
Feature: Add Different Skills and experience

  Scenario: User logged in and navigates to personal details
    Given user is  logged in HRMS with valid admin credentials
    And user clicks on PIM label and navigates to Employee List label
    And user enters employee name "Anshumann Sharma" and ID "7040" and click on search button
    And user clicks on employee name on the list
    When user click on qualifications
    And user click on Add Skill and selects "Accountancy"  enter  "5" years of experience
    And clicks on  save button
