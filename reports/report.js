$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/features/account.feature");
formatter.feature({
  "line": 1,
  "name": "Manager login options",
  "description": "",
  "id": "manager-login-options",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4971582334,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "these are back ground steps",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "Open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enter valid url \"http://demo.guru99.com/V4/\" to open application",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "After launching application enter username \"mngr259062\" and password \"UsuhagY\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "After that enter click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.open_chrome_browser()"
});
formatter.result({
  "duration": 643238859,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://demo.guru99.com/V4/",
      "offset": 17
    }
  ],
  "location": "steps.enter_valid_url_to_open_application(String)"
});
formatter.result({
  "duration": 4156237479,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mngr259062",
      "offset": 44
    },
    {
      "val": "UsuhagY",
      "offset": 70
    }
  ],
  "location": "steps.after_launching_application_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 125637842,
  "status": "passed"
});
formatter.match({
  "location": "steps.after_that_enter_click_on_login_button()"
});
formatter.result({
  "duration": 2965308760,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Deposit into account",
  "description": "",
  "id": "manager-login-options;deposit-into-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@execute"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Click on deposit link",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Add details of amount to be submitted",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click on deposit submit button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Close the application and browser",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.click_on_deposit_link()"
});
formatter.result({
  "duration": 1974045450,
  "status": "passed"
});
formatter.match({
  "location": "steps.add_details_of_amount_to_be_submitted()"
});
formatter.result({
  "duration": 217016788,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_deposit_submit_button()"
});
formatter.result({
  "duration": 3976438834,
  "status": "passed"
});
formatter.match({
  "location": "steps.close_the_application_and_browser()"
});
formatter.result({
  "duration": 1804991582,
  "status": "passed"
});
formatter.after({
  "duration": 28252,
  "status": "passed"
});
formatter.before({
  "duration": 3780953179,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "these are back ground steps",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "Open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enter valid url \"http://demo.guru99.com/V4/\" to open application",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "After launching application enter username \"mngr259062\" and password \"UsuhagY\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "After that enter click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.open_chrome_browser()"
});
formatter.result({
  "duration": 520024677,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://demo.guru99.com/V4/",
      "offset": 17
    }
  ],
  "location": "steps.enter_valid_url_to_open_application(String)"
});
formatter.result({
  "duration": 6589077896,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mngr259062",
      "offset": 44
    },
    {
      "val": "UsuhagY",
      "offset": 70
    }
  ],
  "location": "steps.after_launching_application_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 96734352,
  "status": "passed"
});
formatter.match({
  "location": "steps.after_that_enter_click_on_login_button()"
});
formatter.result({
  "duration": 2492162917,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Withdrawal from account",
  "description": "",
  "id": "manager-login-options;withdrawal-from-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@execute"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Click on withdrawal link",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Add details of amount to be withdraw",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Click on withdrawal submit button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Close the application and browser",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.clickOnWithdrawalLink()"
});
formatter.result({
  "duration": 2249842919,
  "status": "passed"
});
formatter.match({
  "location": "steps.addDetailsOfAmountToBeWithdraw()"
});
formatter.result({
  "duration": 170465090,
  "status": "passed"
});
formatter.match({
  "location": "steps.clickOnWithdrawalSubmitButton()"
});
formatter.result({
  "duration": 3091382732,
  "status": "passed"
});
formatter.match({
  "location": "steps.close_the_application_and_browser()"
});
formatter.result({
  "duration": 1842561529,
  "status": "passed"
});
formatter.after({
  "duration": 31582,
  "status": "passed"
});
});