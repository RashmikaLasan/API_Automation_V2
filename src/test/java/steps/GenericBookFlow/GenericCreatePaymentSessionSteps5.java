package steps.GenericBookFlow;

import actions.GenericFlow.GenericCreatePaymentSessionActions5;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenericCreatePaymentSessionSteps5 {

    GenericCreatePaymentSessionActions5 genericCreatePaymentSessionActions5 = new GenericCreatePaymentSessionActions5();

    @When("I want to create Generic Payment Session with Payment Currency as \"([^\"]*)\" Brand as \"([^\"]*)\" Batch Receipt as \"([^\"]*)\"")
    public void iWantToCreateGenericPaymentSessionWithPaymentCurrencyAsBrandAsBatchReceiptAs(String currency, String brand, String receipt) {

        genericCreatePaymentSessionActions5.createPaymentSessionBody(currency, brand, receipt);
    }

    @When("I click send request for Generic Create Payment Session Request")
    public void iClickSendRequestForGenericCreatePaymentSessionRequest() {

        genericCreatePaymentSessionActions5.sendCreatePaymentSessionRequest();
    }

    @Then("I should get a successful response as status code (\\d+) for Generic Create Payment Session")
    public void iShouldGetASuccessfulResponseAsStatusCodeForGenericCreatePaymentSession(int status) {

        genericCreatePaymentSessionActions5.createPaymentSessionStatusCodeValidation(status);
    }

    @Then("Store the Payment Reference in Generic Create Payment Session response")
    public void storeThePaymentReferenceInGenericCreatePaymentSessionResponse() {

        genericCreatePaymentSessionActions5.storePaymentReference();
    }

    @Then("check the payment Amount is correct in Generic Create Payment Session response")
    public void checkThePaymentAmountIsCorrectInGenericCreatePaymentSessionResponse() {

        genericCreatePaymentSessionActions5.createGenPaymentSessionPriceAssertion();
    }

    @Then("check the Transaction Identifier is equal to the Cart ID in Generic Create Payment Session response")
    public void checkTheTransactionIdentifierIsEqualToTheCartIDInGenericCreatePaymentSessionResponse() {

        genericCreatePaymentSessionActions5.createGenPaymentSessionCartIdAssertion();
    }

    @Then("check the Payment Currency is \"([^\"]*)\"")
    public void checkThePaymentCurrencyIs(String currency) {

        genericCreatePaymentSessionActions5.createGenPaymentSessionCurrencyAssertion(currency);
    }
}
