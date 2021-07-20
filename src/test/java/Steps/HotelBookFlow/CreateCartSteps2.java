package Steps.HotelBookFlow;

import Actions.HotelFlow.CreateCartActions2;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CreateCartSteps2 {

    CreateCartActions2 createCartActions2 = new CreateCartActions2();

    @Then("I want to Create Cart")
    public void iWantToCreateCart() {

        createCartActions2.createCartBody();

    }

    @When("I click send request for Create Cart Request")
    public void iClickSendRequestForCreateCartRequest() {

        createCartActions2.sendCreateCartRequest();

    }

    @Then("Store the Cart ID")
    public void storeTheCartID() {

        createCartActions2.storeCartId();

    }

    @And("Store the TravellersKey of Passenger One")
    public void storeTheTravellersKeyOfPassengerOne() {

        createCartActions2.storeTravellersKeyOne();

    }

    @And("Store the TravellersKey of Passenger Two")
    public void storeTheTravellersKeyOfPassengerTwo() {

        createCartActions2.storeTravellersKeyTwo();

    }
}
