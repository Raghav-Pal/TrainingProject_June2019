$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Login.feature");
formatter.feature({
  "name": "feature to test login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "check login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Clicks login button",
  "keyword": "And "
});
formatter.step({
  "name": "User is navigated to home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Admin",
        "hUKwJTbofgPU9eVlw/CnDQ\u003d\u003d"
      ]
    }
  ]
});
formatter.scenario({
  "name": "check login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.navigateToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Admin and hUKwJTbofgPU9eVlw/CnDQ\u003d\u003d",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.enterCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyHomePage()"
});
formatter.result({
  "status": "passed"
});
});