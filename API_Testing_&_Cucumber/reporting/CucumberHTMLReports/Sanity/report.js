$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/newFeatures/APITesting.feature");
formatter.feature({
  "name": "Search functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validity valid Search Functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I hit API",
  "keyword": "Given "
});
formatter.match({
  "location": "newStepDefinition.newSearchProduct.i_hit_API()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});