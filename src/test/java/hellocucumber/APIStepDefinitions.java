package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TerryCanShowADisplayName")
public class APIStepDefinitions {

    private String api_url;
    private Response response;
    private JsonPath jsonPathEvaluator;

    @Given("Customer get API is provided")
    public void customer_get_api_is_provided() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User call customer get API")
    public void user_call_customer_get_api() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Specific customer info will be shown")
    public void specific_customer_info_will_be_shown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Customer list API is provided")
    public void customer_list_api_is_provided() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User call customer list API")
    public void user_call_customer_list_api() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Customer list will be shown")
    public void customer_list_will_be_shown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Login API is provided")
    public void login_api_is_provided() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User call login API")
    public void user_call_login_api() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("a token will be generated")
    public void a_token_will_be_generated() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User calls API")
    public void user_call_guru99_api() throws IOException, InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //RestAssured.given().when().get("https://api.coindesk.com/v1/bpi/currentprice.json").then().log().body();
        RestAssured.baseURI = api_url;
        RequestSpecification httpRequest = RestAssured.given();
        response = httpRequest.get();
    }

    @Test
    @Then("the USD price is available")
    public void a_respond_from_api_can_be_received() {
        // Write code here that turns the phrase above into concrete actions
        jsonPathEvaluator = response.jsonPath();
        String rate = jsonPathEvaluator.get("bpi.USD.rate").toString();
        assertFalse(rate.isEmpty(),"The USD rate is returned!");
        System.out.println("Tbe USD bit coin Rate is: " + rate);
    }

    @Given("a BitCoin public api {string} is provided")
    public void aBitCoinPublicApiIsProvided(String url) {
        api_url = url;
    }
}

