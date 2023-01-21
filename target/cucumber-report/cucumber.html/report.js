$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("regiter.feature");
formatter.feature({
  "line": 2,
  "name": "virgingames",
  "description": "As user I want to click on any element on virgin games",
  "id": "virgingames",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 4468067600,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User verify Should click on casino button",
  "description": "",
  "id": "virgingames;user-verify-should-click-on-casino-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I click on accept cookies",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on casino button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on join now",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iClickOnAcceptCookies()"
});
formatter.result({
  "duration": 223366100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnCasinoButton()"
});
formatter.result({
  "duration": 154235800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnJoinNow()"
});
formatter.result({
  "duration": 893117300,
  "status": "passed"
});
formatter.after({
  "duration": 848070300,
  "status": "passed"
});
});