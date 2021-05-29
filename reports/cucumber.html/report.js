$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myAPIExample.feature");
formatter.feature({
  "line": 2,
  "name": "Todo API",
  "description": "",
  "id": "todo-api",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@API"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Creating a todo",
  "description": "",
  "id": "todo-api;creating-a-todo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the user makes an example API call",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the API responds successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "the response body contains the expected data",
  "keyword": "And "
});
formatter.match({
  "location": "myAPIExampleSteps.theUserMakesAnExampleApiCall()"
});
formatter.result({
  "duration": 1260548408,
  "status": "passed"
});
formatter.match({
  "location": "myAPIExampleSteps.theApiRespondsSuccessfully()"
});
formatter.result({
  "duration": 92916,
  "status": "passed"
});
formatter.match({
  "location": "myAPIExampleSteps.theResponseBodyContainsTheExpectedData()"
});
formatter.result({
  "duration": 212564237,
  "status": "passed"
});
formatter.uri("todos.feature");
formatter.feature({
  "line": 2,
  "name": "Todo Lists",
  "description": "",
  "id": "todo-lists",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@UI"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "am I on the todo page",
  "keyword": "Given "
});
formatter.match({
  "location": "TodoSteps.am_I_on_the_todo_page()"
});
formatter.result({
  "duration": 794879286,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Creating a todo",
  "description": "",
  "id": "todo-lists;creating-a-todo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I type the todo \"Do Things!\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "todo list item 1 has text \"Do Things!\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Do Things!",
      "offset": 17
    }
  ],
  "location": "TodoSteps.i_type_the_todo(String)"
});
formatter.result({
  "duration": 82188721,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 15
    },
    {
      "val": "Do Things!",
      "offset": 27
    }
  ],
  "location": "TodoSteps.todo_list_item_has_text(int,String)"
});
formatter.result({
  "duration": 24686808,
  "status": "passed"
});
formatter.after({
  "duration": 70123860,
  "status": "passed"
});
});