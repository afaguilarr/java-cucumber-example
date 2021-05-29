package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import plainoldjavaobjects.MyExampleAPI;

import static io.restassured.RestAssured.get;
import static org.junit.Assert.assertEquals;

public class myAPIExampleSteps {

	Response response;

	@When("^the user makes an example API call$")
	public void theUserMakesAnExampleApiCall() {
		response = get("https://jsonplaceholder.typicode.com/todos/1");
	}

	@Then("^the API responds successfully$")
	public void theApiRespondsSuccessfully() {
		assertEquals(response.getStatusCode(), 200);
	}

	@Then("^the response body contains the expected data$")
	public void theResponseBodyContainsTheExpectedData() {
		MyExampleAPI parsedResponse = response.as(MyExampleAPI.class);
		assertEquals(parsedResponse.getId(), 1);
		assertEquals(parsedResponse.getUserId(), 1);
		assertEquals("The title is not the expected one: ", parsedResponse.getTitle(), "delectus aut autem");
		assertEquals(parsedResponse.getCompleted(), false);
	}

}
