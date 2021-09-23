package steps.HotelBookFlow;

import actions.HotelFlow.ConfirmCartActions7;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ConfirmCartSteps7 {

    ConfirmCartActions7 confirmCartActions7 = new ConfirmCartActions7();

    @Given("I want to Confirm Booking by creating the Confirm Cart Body")
    public void iWantToConfirmBookingByCreatingTheConfirmCartBody() {

        confirmCartActions7.createConfirmCartBody();
    }

    @Then("I click send request for Confirm Cart Request")
    public void iClickSendRequestForConfirmCartRequest() {

        confirmCartActions7.sendConfirmCartRequest();
    }

    @Then("Store the Booking ID in Confirm Cart Response")
    public void storeTheBookingIDInConfirmCartResponse() {

        confirmCartActions7.storeBookingId();
    }

    @And("Store the Booking Reference in Confirm Cart Response")
    public void storeTheBookingReferenceInConfirmCartResponse() {

        confirmCartActions7.storeBookingReference();
    }


}
