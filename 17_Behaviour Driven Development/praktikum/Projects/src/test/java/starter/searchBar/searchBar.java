package starter.searchBar;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class searchBar {
    @Step("I am on the Home Page for Search User")
    public void onTheHomePage(){
        System.out.println("I am on the Home Page");
    }
    @Step("I enter my keyword")
    public void enterKeyword(){
        System.out.println("I enter my keyword");
    }
    @Step("I click on search button")
    public void clickSearchButton(){
        System.out.printf("I click on search button");
    }
    @Step("I find the user I search for")
    public void findUser(){
        System.out.println("I find the user I search for");
    }
}
