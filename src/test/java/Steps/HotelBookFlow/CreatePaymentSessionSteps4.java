package Steps.HotelBookFlow;

import Actions.HotelFlow.CreatePaymentSessionActions4;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreatePaymentSessionSteps4 {

    CreatePaymentSessionActions4 createPaymentSessionActions4 = new CreatePaymentSessionActions4();


    @When("I want to create Payment Session with Payment Currency as \"([^\"]*)\"")
    public void iWantToCreatePaymentSessionWithPaymentCurrencyAs(String currency) {

        createPaymentSessionActions4.createPaymentSessionBody(currency);
    }

    @When("I click send request for Create Payment Session Request")
    public void iClickSendRequestForCreatePaymentSessionRequest() {

        createPaymentSessionActions4.sendCreatePaymentSessionRequest();
    }

    @Then("Store the Payment Reference in Create Payment Session response")
    public void storeThePaymentReferenceInCreatePaymentSessionResponse() {

        createPaymentSessionActions4.storePaymentReference();
    }

}
