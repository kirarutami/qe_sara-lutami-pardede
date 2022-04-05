package starter.makePost;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class makePost {
    @Step("I am on the Home Page")
    public void onTheHomePage(){
        System.out.println("I am on the Home Page");
    }
    @Step("I click on the 'Start a post' section")
    public void clickStartAPostSection(){
        System.out.println("I click on the 'Start a post' section");
    }
    @Step("I enter my paragraph")
    public void enterMyParagraph(){
        System.out.printf("I enter my paragraph");
    }
    @Step("My paragraph will be posted")
    public void paragraphPosted(){
        System.out.println("I will post a post");
    }
}
