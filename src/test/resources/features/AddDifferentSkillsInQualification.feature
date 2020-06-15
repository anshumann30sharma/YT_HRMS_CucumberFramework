#Author: your.email@your.domain.com  Feature: Add Different Skills 

Feature: Add Different Skills in Qualifications
Scenario: User logged in and navigates to skill
    Given user is  logged in HRMS with valid admin credentials
    When user clicks on Admin label and navigates to Qualification label
    And click on Skill label and click again on  Add Skill button
    Then user add "Computer Application" skill and "intermediary level computer skills"
    And click save button and vocational skill is saved
    