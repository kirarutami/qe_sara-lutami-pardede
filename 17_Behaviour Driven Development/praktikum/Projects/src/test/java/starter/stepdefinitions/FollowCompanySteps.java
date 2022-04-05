package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.followCompany.followCompany;

public class FollowCompanySteps {
    @Steps
    starter.followCompany.followCompany followCompany;
    @Given("I am on the Home Page for Follow a Company")
    public void onTheHomePage(){
        followCompany.onTheHomePage();
    }

    @When("I search for a company")
    public void searchCompany(){
        followCompany.searchCompany();
    }

    @And("I click on follow button")
    public void clickFollowButton(){
        followCompany.clickFollowButton();
    }

    @Then("The Company will be followed by Me")
    public void followedCompany(){
        followCompany.followedCompany();
    }


}
