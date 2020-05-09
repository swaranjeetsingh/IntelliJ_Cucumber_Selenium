$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/account.feature");
formatter.feature({
  "name": "Manager login options",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "login steps",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepsDefinitions.steps.open_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid url \"http://demo.guru99.com/V4/\" to open application",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsDefinitions.steps.enter_valid_url_to_open_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "After launching application enter username \"mngr259062\" and password \"UsuhagY\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepsDefinitions.steps.after_launching_application_enter_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "After that enter click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefinitions.steps.after_that_enter_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Withdrawal from account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@execute"
    }
  ]
});
formatter.step({
  "name": "Click on withdrawal link",
  "keyword": "When "
});
formatter.match({
  "location": "stepsDefinitions.steps.clickOnWithdrawalLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add details of amount to be withdraw",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsDefinitions.steps.addDetailsOfAmountToBeWithdraw()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on withdrawal submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefinitions.steps.clickOnWithdrawalSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});