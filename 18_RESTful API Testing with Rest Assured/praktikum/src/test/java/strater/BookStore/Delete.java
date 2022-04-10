package strater.BookStore;


import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    protected static String url = "https://demoqa.com/BookStore/v1/";
    @Step("I set DELETE apis endpoints")
    public String setDeleteApiEndpoints(){
        return url + "Books?UserId=string";
    }
    @Step("I send DELETE HTTP request")
    public void sendDeleteApiRequest(){
        SerenityRest.given().delete(setDeleteApiEndpoints());
    }
    @Step("I receive valid HTTP response code 401")
    public void validateHttpResponseCode401(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
