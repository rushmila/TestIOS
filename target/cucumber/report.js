$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/login/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to OpenSimSim App",
  "description": "In order to use the OpenSimSim app\nAs a registered user\nI want to successfully login to the system",
  "id": "login-to-opensimsim-app",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10065486173,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Validate login window",
  "description": "",
  "id": "login-to-opensimsim-app;validate-login-window",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is in get started page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user gets the User name text box",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user gets the Password text box",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user gets the Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_in_get_started_page()"
});
formatter.result({
  "duration": 807904111,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_gets_the_User_name_text_box()"
});
formatter.result({
  "duration": 503590761,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_gets_the_Password_text_box()"
});
formatter.result({
  "duration": 467851253,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_gets_the_Login_button()"
});
formatter.result({
  "duration": 447501982,
  "status": "passed"
});
formatter.after({
  "duration": 1610985264,
  "status": "passed"
});
});