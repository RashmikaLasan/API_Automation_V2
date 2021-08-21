package steps.GenericBookFlow;

import actions.GenericFlow.GenericUpdatePassengerAction4;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenericPassengerUpdateSteps4 {

    GenericUpdatePassengerAction4 genericUpdatePassengerAction4 = new GenericUpdatePassengerAction4();

    @When("I want to Create Update Passenger Body I Create Gen Contact Details")
    public void iWantToCreateUpdatePassengerBodyICreateGenContactDetails() {
        genericUpdatePassengerAction4.createGenContactBody();

    }

    @When("I want to Create Update Passenger Body I Create Gen Address Details")
    public void iWantToCreateUpdatePassengerBodyICreateGenAddressDetails() {

        genericUpdatePassengerAction4.createGenAddressBody();
    }

    @When("I want to Create Update Passenger Body I Create Gen Profile Details")
    public void iWantToCreateUpdatePassengerBodyICreateGenProfileDetails() {

        genericUpdatePassengerAction4.createGenProfileBody();
    }

    @When("I want to Create Update Passenger Body I Create Gen Reference Details")
    public void iWantToCreateUpdatePassengerBodyICreateGenReferenceDetails() {

        genericUpdatePassengerAction4.createGenReference();
    }

    @When("I want to Create Update Passenger Body I Create Gen Payload Details of Passenger One")
    public void iWantToCreateUpdatePassengerBodyICreateGenPayloadDetailsOfPassengerOne() {

        genericUpdatePassengerAction4.createGenPayloadBodyOne();
    }

    @When("I want to Create Update Passenger Body I Create Gen Payload Details of all the Passengers")
    public void iWantToCreateUpdatePassengerBodyICreateGenPayloadDetailsOfAllThePassengers() {

        genericUpdatePassengerAction4.createGenPayloadBodyTwo();
    }

    @Then("I Combined the Gen Update Passenger details body")
    public void iCombinedTheGenUpdatePassengerDetailsBody() {

        genericUpdatePassengerAction4.payloadGenFullBody();
    }

    @When("I create Gen Update Passenger Body to Update Passenger Details")
    public void iCreateGenUpdatePassengerBodyToUpdatePassengerDetails() {

        genericUpdatePassengerAction4.updatePassengerGenFullBody();
    }

    @Then("I click send request for Gen Update Passenger Request")
    public void iClickSendRequestForGenUpdatePassengerRequest() {

        genericUpdatePassengerAction4.updatePassengerGenRequestSend();
    }

    @Then("I should get a successful response as status code (\\d+) Gen Update Passenger")
    public void iShouldGetASuccessfulResponseAsStatusCodeGenUpdatePassenger(int status) {

        genericUpdatePassengerAction4.genericSearchStatusCode(status);
    }

    @Then("check the Cart ID is correct in Generic Update Passenger Response")
    public void checkTheCartIDIsCorrectInGenericUpdatePassengerResponse() {

        genericUpdatePassengerAction4.updatePassengerGenCartIdAssertion();
    }

    @Then("check the Product Name is correct in Generic Update Passenger Response")
    public void checkTheProductNameIsCorrectInGenericUpdatePassengerResponse() {

        genericUpdatePassengerAction4.updatePassengerGenProductNameAssertion();
    }

    @Then("check the Product Code is correct in Generic Update Passenger Response")
    public void checkTheProductCodeIsCorrectInGenericUpdatePassengerResponse() {

        genericUpdatePassengerAction4.updatePassengerGenProductCodeAssertion();
    }

    @Then("check the Generic Service Start Date is correct in Generic Update Passenger Response")
    public void checkTheGenericServiceStartDateIsCorrectInGenericUpdatePassengerResponse() {
        genericUpdatePassengerAction4.updatePassengerGenStartDateAssertion();
    }

    @Then("check the Generic Service End Date is correct in Generic Update Passenger Response")
    public void checkTheGenericServiceEndDateIsCorrectInGenericUpdatePassengerResponse() {

        genericUpdatePassengerAction4.updatePassengerGenEndDateAssertion();
    }

    @Then("check the Price of the Product is correct in Generic Update Passenger Response")
    public void checkThePriceOfTheProductIsCorrectInGenericUpdatePassengerResponse() {

        genericUpdatePassengerAction4.updatePassengerGenPriceAssertion();
    }

    @Then("check the Category Code is correct in Generic Update Passenger Response")
    public void checkTheCategoryCodeIsCorrectInGenericUpdatePassengerResponse() {

        genericUpdatePassengerAction4.updatePassengerGenCategoryCodeAssertion();
    }

    @Then("check the Category Name is correct in Generic Update Passenger Response")
    public void checkTheCategoryNameIsCorrectInGenericUpdatePassengerResponse() {

        genericUpdatePassengerAction4.updatePassengerGenCategoryNameAssertion();
    }

    @Then("check the Pax Combination is correct in Generic Update Passenger Response")
    public void checkThePaxCombinationIsCorrectInGenericUpdatePassengerResponse() {

        genericUpdatePassengerAction4.updatePassengerGenPaxCombinationAssertion();
    }
}