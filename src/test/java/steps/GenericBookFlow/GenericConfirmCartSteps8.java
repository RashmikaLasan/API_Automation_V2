package steps.GenericBookFlow;

import actions.GenericFlow.GenericConfirmCartActions8;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GenericConfirmCartSteps8 {

    GenericConfirmCartActions8 genericConfirmCartActions8 = new GenericConfirmCartActions8();


    @Given("I want to Generic Confirm Booking by creating the Confirm Cart Body")
    public void iWantToGenericConfirmBookingByCreatingTheConfirmCartBody() {

        genericConfirmCartActions8.createGenConfirmCartBody();

    }


    @Then("I click send Generic request for Confirm Cart")
    public void iClickSendGenericRequestForConfirmCart() {

        genericConfirmCartActions8.sendGenConfirmCartRequest();

    }

    @Then("I should get a successful response as status code (\\d+) for Generic Confirm Cart Request")
    public void iShouldGetASuccessfulResponseAsStatusCodeForGenericConfirmCartRequest(int statusCode) {

        genericConfirmCartActions8.confirmGenCartStatusCode(statusCode);

    }

    @Then("Store the Generic Booking ID in Confirm Cart Response")
    public void storeTheGenericBookingIDInConfirmCartResponse() {

        genericConfirmCartActions8.storeGenBookingId();
    }

    @And("Store the Generic Booking Reference in Confirm Cart Response")
    public void storeTheGenericBookingReferenceInConfirmCartResponse() {

        genericConfirmCartActions8.storeGenBookingReference();
    }
}
