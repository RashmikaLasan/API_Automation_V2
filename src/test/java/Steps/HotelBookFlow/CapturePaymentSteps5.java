package Steps.HotelBookFlow;

import Actions.HotelFlow.CapturePaymentActions5;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CapturePaymentSteps5 {

    CapturePaymentActions5 capturePaymentActions5 = new CapturePaymentActions5();

    @Given("I want to send the Capture Payment Request where Card Type as \"([^\"]*)\" and Currency as \"([^\"]*)\"")
    public void iWantToSendTheCapturePaymentRequestWhereCardTypeAsAndCurrencyAs(String cardType, String currency) {

        capturePaymentActions5.createCapturePaymentBody(cardType, currency);

    }

    @Then("I click send request for Capture Payment Request")
    public void iClickSendRequestForCapturePaymentRequest() {

        capturePaymentActions5.sendCapturePaymentRequest();
    }


}
