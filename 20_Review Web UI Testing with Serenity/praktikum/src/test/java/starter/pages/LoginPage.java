package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By usernameFields(){
        return By.id("userName");
    }
    private By passwordFields(){
        return By.id("password");
    }

    private By loginButton(){
        return By.id("login");
    }

    @Step
    public void openPage(){
        open();
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        $(usernameFields()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordFields()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }
}
