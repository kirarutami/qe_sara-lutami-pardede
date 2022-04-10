package strater.BookStore;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {

    protected static String url = "https://demoqa.com/BookStore/v1/";
    @Step("I set GET api endpoints")
    public String setGetApiEndPoints(){
        return url+ "Book?ISBN=9781449325862";
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequest(){
        SerenityRest.given().get(setGetApiEndPoints());
    }

    @Step("I receive valid HTTP response code 200")
    public void setReceiveValidHttpResponse(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail book")
    public void receiveValidDataForDetailBook(){
    }
}
