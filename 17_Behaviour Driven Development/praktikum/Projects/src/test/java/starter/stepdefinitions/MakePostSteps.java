package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.makePost.makePost;

public class MakePostSteps {
    @Steps
    starter.makePost.makePost makePost;
    @Given("I am on the Home Page")
    public void onTheHomePage(){
        makePost.onTheHomePage();
    }

    @When("I click on the 'Start a post' section")
    public void clickStartAPostSection(){
        makePost.clickStartAPostSection();
    }

    @And("I enter my paragraph")
    public void enterMyParagraph(){
        makePost.enterMyParagraph();
    }

    @Then("My paragraph will be posted")
    public void paragraphPosted(){
        makePost.paragraphPosted();
    }


}
