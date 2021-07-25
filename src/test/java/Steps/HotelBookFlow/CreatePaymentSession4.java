package Steps.HotelBookFlow;

import Actions.HotelFlow.CreatePaymentSessionActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreatePaymentSession4 {

    CreatePaymentSessionActions createPaymentSessionActions = new CreatePaymentSessionActions();


    @When("I want to create Payment Session with Payment Currency as \"([^\"]*)\"")
    public void iWantToCreatePaymentSessionWithPaymentCurrencyAs(String currency) {

        createPaymentSessionActions.createPaymentSessionBody(currency);
    }

    @When("I click send request for Create Payment Session Request")
    public void iClickSendRequestForCreatePaymentSessionRequest() {

        createPaymentSessionActions.sendCreatePaymentSessionRequest();
    }


}
