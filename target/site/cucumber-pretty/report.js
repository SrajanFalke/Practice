$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/login.feature");
formatter.feature({
  "name": "To test login functinality with valid use case",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login data driven with valid case",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinations.i_am_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter userName \u0026 Password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinations.i_enter_userName_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinations.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see project dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinations.i_should_see_project_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login data driven with valid case",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter \u003cuserName\u003e \u0026 \u003cPassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "I should see project dashboard",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "Password"
      ]
    },
    {
      "cells": [
        "srajan.falkeabc@gmail.com",
        "srajan@abc"
      ]
    },
    {
      "cells": [
        "srajan.falkexyz@gmail.com",
        "srajan@xyz"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login data driven with valid case",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinations.i_am_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter srajan.falkeabc@gmail.com \u0026 srajan@abc",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinations.i_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see project dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinations.i_should_see_project_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Login data driven with valid case",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinations.i_am_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter srajan.falkexyz@gmail.com \u0026 srajan@xyz",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinations.i_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see project dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinations.i_should_see_project_dashboard()"
});
formatter.result({
  "status": "skipped"
});
});