package starter.followCompany;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class followCompany {
    @Step("I am on the Home Page for Follow a Company")
    public void onTheHomePage(){
        System.out.println("I am on the Home Page for Follow a Company");
    }
    @Step("I search for a company")
    public void searchCompany(){
        System.out.println("I search for a company");
    }
    @Step("I click on follow button")
    public void clickFollowButton(){
        System.out.printf("I click on follow button");
    }
    @Step("The Company will be followed by Me")
    public void followedCompany(){
        System.out.println("The Company will be followed by Me");
    }
}
