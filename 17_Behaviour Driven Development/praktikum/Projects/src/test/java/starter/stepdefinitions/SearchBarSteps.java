package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.searchBar.searchBar;

public class SearchBarSteps {
    @Steps
    starter.searchBar.searchBar searchBar;
    @Given("I am on the Home Page for Search User")
    public void onTheHomePage(){
        searchBar.onTheHomePage();
    }

    @When("I enter my keyword")
    public void enterKeyword(){
        searchBar.enterKeyword();
    }

    @And("I click on search button")
    public void clickSearchButton(){
        searchBar.clickSearchButton();
    }

    @Then("I find the user I search for")
    public void findUser(){
        searchBar.findUser();
    }


}
