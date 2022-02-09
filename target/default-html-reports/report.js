$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginAsDDt.feature");
formatter.feature({
  "name": "Login as Usertype",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login with Different Accounts",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "The user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters the \"\u003cusertype\u003e\" information",
  "keyword": "When "
});
formatter.step({
  "name": "User navigates to \"\u003ctab\u003e\" \"\u003cmodule\u003e\" on top of menu",
  "keyword": "And "
});
formatter.step({
  "name": "The title should contain \"\u003ctitle\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "usertype",
        "tab",
        "module",
        "title"
      ]
    },
    {
      "cells": [
        "driver",
        "Activities",
        "Calendar Events",
        "Calendar Events - Activities"
      ]
    },
    {
      "cells": [
        "sales manager",
        "Customers",
        "Accounts",
        "Accounts - Customers"
      ]
    },
    {
      "cells": [
        "store manager",
        "Customers",
        "Contacts",
        "Contacts - Customers"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with Different Accounts",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"driver\" information",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginAsUsertypeDefs.user_enters_the_information(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to \"Activities\" \"Calendar Events\" on top of menu",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.navigateStepDefinitions.userNavigatesToOnTopOfMenu(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The title should contain \"Calendar Events - Activities\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefinitions.theTitleShouldContain(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with Different Accounts",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"sales manager\" information",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginAsUsertypeDefs.user_enters_the_information(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to \"Customers\" \"Accounts\" on top of menu",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.navigateStepDefinitions.userNavigatesToOnTopOfMenu(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The title should contain \"Accounts - Customers\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefinitions.theTitleShouldContain(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with Different Accounts",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"store manager\" information",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginAsUsertypeDefs.user_enters_the_information(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to \"Customers\" \"Contacts\" on top of menu",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.navigateStepDefinitions.userNavigatesToOnTopOfMenu(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The title should contain \"Contacts - Customers\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefinitions.theTitleShouldContain(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});