package stepdefinitions;

import static org.junit.Assert.assertEquals;
import static utils.TodoUtil.addTodo;
import static utils.TodoUtil.todoAt;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.Browser;
import utils.TodoUtil;

public class TodoSteps {

	@Given("^am I on the todo page$")
	public void am_I_on_the_todo_page() {
		TodoUtil.driver = Browser.launch();
		TodoUtil.driver.get("http://testdouble.github.io/todos/");
	}

	@When("^I type the todo \"([^\"]*)\"$")
	public void i_type_the_todo(String todoText) {
		addTodo(todoText);
	}

	@Then("^todo list item (\\d+) has text \"([^\"]*)\"$")
	public void todo_list_item_has_text(int ordinal, String expected) {
		assertEquals(todoAt(ordinal - 1).getText(), expected);
	}

}
