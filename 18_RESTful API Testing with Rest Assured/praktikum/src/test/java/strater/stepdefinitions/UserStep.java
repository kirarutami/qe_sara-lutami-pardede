package strater.stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import strater.BookStore.Delete;
import strater.BookStore.Get;

public class UserStep {
    @Steps
    Get get;

    @Steps
    Delete delete;

    @Given("I set GET api endpoints")
    public void setGetApiEndPoints(){
        get.setGetApiEndPoints();
    }

    @When("I send GET HTTP request")
    public void sendGetHttpRequest(){
        get.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void setReceiveValidHttpResponse(){
        get.setReceiveValidHttpResponse();
    }

    @And("I receive valid data for detail book")
    public void receiveValidDataForDetailBook(){
        get.receiveValidDataForDetailBook();
    }

    @Given("I set DELETE api endpoints")
    public void setDeleteApiEndpoints(){
        delete.setDeleteApiEndpoints();
    }
    @When("I send DELETE HTTP request")
    public void sendDeleteApiRequest(){
        delete.sendDeleteApiRequest();
    }
    @Then("I receive valid HTTP response code 401")
    public void validateHttpResponseCode401(){
        delete.validateHttpResponseCode401();
    }

}
