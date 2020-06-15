$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddDifferentSkills.feature");
formatter.feature({
  "name": "Add Different Skills in qualification",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User looged in and navigates to personal details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is  logged in HRMS with valid admin credentials",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on PIM label and navigates to Employee List label",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user selects  Employee and navigates to Personal Details",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user click on qualifications",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user adds \"\u003cname\u003e\"  of skill and \"\u003cyears\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicks on add save button and skill and years of experience are saved",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});