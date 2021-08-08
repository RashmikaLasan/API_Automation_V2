package steps.GenericBookFlow;

import actions.GenericFlow.GenericCreateCartAction2;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenericCreateCartSteps2 {

    GenericCreateCartAction2 genericCreateCartAction2 = new GenericCreateCartAction2();

    @Then("I want to Create Generic Cart")
    public void iWantToCreateGenericCart() {

        genericCreateCartAction2.createGenCartBody();
    }

    @When("I click send request for Generic Create Cart Request")
    public void iClickSendRequestForGenericCreateCartRequest() {

        genericCreateCartAction2.sendGenCreateCartRequest();
    }

    @Then("I should get a successful response as status code (\\d+) for Generic Create Cart")
    public void iShouldGetASuccessfulResponseAsStatusCodeForGenericCreateCart(int statusCode) {

        genericCreateCartAction2.hotelSearchStatusCode(statusCode);
    }

    @Then("Store the Generic Cart ID")
    public void storeTheGenericCartID() {

        genericCreateCartAction2.storeGenCartId();
    }

    @And("Store the Generic TravellersKey of Passenger One")
    public void storeTheGenericTravellersKeyOfPassengerOne() {

        genericCreateCartAction2.storeGenTravellersKeyOne();
    }

    @And("Store the Generic TravellersKey of Passenger Two")
    public void storeTheGenericTravellersKeyOfPassengerTwo() {

        genericCreateCartAction2.storeGenTravellersKeyTwo();
    }

}
