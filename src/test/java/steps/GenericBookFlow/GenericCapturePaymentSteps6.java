package steps.GenericBookFlow;

import actions.GenericFlow.GenericCapturePaymentAction6;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GenericCapturePaymentSteps6 {

    GenericCapturePaymentAction6 genericCapturePaymentAction6 = new GenericCapturePaymentAction6();

    @Given("I want to send the Generic Capture Payment Request where Card Type as \"([^\"]*)\" and Currency as \"([^\"]*)\" Batch Receipt as \"([^\"]*)\" Brand as \"([^\"]*)\"")
    public void iWantToSendTheGenericCapturePaymentRequestWhereCardTypeAsAndCurrencyAsBatchReceiptAsBrandAs(String cardType, String currency, String receipt, String brand) {

        genericCapturePaymentAction6.createGenericCapturePaymentBody(cardType, currency, receipt, brand);
    }

    @Then("I click send request for Generic Capture Payment Request")
    public void iClickSendRequestForGenericCapturePaymentRequest() {
        genericCapturePaymentAction6.sendGenericCapturePaymentRequest();
    }

    @Then("I should get a successful response as status code (\\d+) for Generic Capture Payment Request")
    public void iShouldGetASuccessfulResponseAsStatusCodeForGenericCapturePaymentRequest(int statusCode) {

        genericCapturePaymentAction6.genCapturePaymentRequestStatusCodeValidation(statusCode);
    }

}
