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

    @Then("check the Product Name is correct in Generic Create Cart Response")
    public void checkTheProductNameIsCorrectInGenericCreateCartResponse() {

        genericCreateCartAction2.createCartGenProductNameAssertion();
    }

    @Then("check the Product Code is correct in Generic Create Cart Response")
    public void checkTheProductCodeIsCorrectInGenericCreateCartResponse() {
        genericCreateCartAction2.createCartGenProductCodeAssertion();
    }

    @Then("check the Generic Service Start Date is correct in Generic Create Cart Response")
    public void checkTheGenericServiceStartDateIsCorrectInGenericCreateCartResponse() {

        genericCreateCartAction2.createCartGenStartDateAssertion();
    }

    @Then("check the Generic Service End Date is correct in Generic Create Cart Response")
    public void checkTheGenericServiceEndDateIsCorrectInGenericCreateCartResponse() {

        genericCreateCartAction2.createCartGenEndDateAssertion();
    }

//    @Then("check the Duration of the Tour is correct in Generic Create Cart Response")
//    public void checkTheDurationOfTheTourIsCorrectInGenericCreateCartResponse() {
//
//        genericCreateCartAction2.createCartGenDurationAssertion();
//    }

    @Then("check the Price of the Product is correct in Generic Create Cart Response")
    public void checkThePriceOfTheProductIsCorrectInGenericCreateCartResponse() {

        genericCreateCartAction2.createCartGenPriceAssertion();
    }

    @Then("check the Category Code is correct in Create Cart Response")
    public void checkTheCategoryCodeIsCorrectInCreateCartResponse() {

        genericCreateCartAction2.createCartGenCategoryCodeAssertion();
    }

    @Then("check the Category Name is correct in Create Cart Response")
    public void checkTheCategoryNameIsCorrectInCreateCartResponse() {

        genericCreateCartAction2.createCartGenCategoryNameAssertion();
    }

    @Then("check the Pax Combination is correct in Generic Create Cart Response")
    public void checkThePaxCombinationIsCorrectInGenericCreateCartResponse() {
    }
}
