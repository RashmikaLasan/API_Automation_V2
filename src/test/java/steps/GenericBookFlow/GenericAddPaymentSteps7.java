package steps.GenericBookFlow;

import actions.GenericFlow.GenericAddPaymentActions7;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GenericAddPaymentSteps7 {

    GenericAddPaymentActions7 genericAddPaymentActions7 = new GenericAddPaymentActions7();

    @Given("I want to create Unique ID in Generic Add Payment Body")
    public void iWantToCreateUniqueIDInGenericAddPaymentBody() {

        genericAddPaymentActions7.createUniqueId();
    }


    @Given("I want to create Payment Details in Generic Add Payment Body where Card Type as \"([^\"]*)\"")
    public void iWantToCreatePaymentDetailsInGenericAddPaymentBodyWhereCardTypeAs(String cardType) {

        genericAddPaymentActions7.createPaymentDetails(cardType);
    }

    @Given("I want to create Payment Info in Generic Add Payment Body where Currency as \"([^\"]*)\"")
    public void iWantToCreatePaymentInfoInGenericAddPaymentBodyWhereCurrencyAs(String currency) {

        genericAddPaymentActions7.createPaymentInfo(currency);
    }

    @Then("I want to Merge Full Body of Generic Add Payment Body")
    public void iWantToMergeFullBodyOfGenericAddPaymentBody() {

        genericAddPaymentActions7.createFullBody();
    }

    @Then("I click send request for Generic Add Payment Request")
    public void iClickSendRequestForGenericAddPaymentRequest() {

        genericAddPaymentActions7.sendGenericAddPaymentRequest();
    }

    @Then("I should get a successful response as status code (\\d+) for Generic Add Payment Request")
    public void iShouldGetASuccessfulResponseAsStatusCodeForGenericAddPaymentRequest(int statusCode) {

        genericAddPaymentActions7.genAddPaymentRequestStatusCodeValidation(statusCode);
    }


}
