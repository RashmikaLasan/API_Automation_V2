package steps.HotelBookFlow;

import actions.HotelFlow.UpdatePassengerAction3;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PassengerUpdate3 {

    UpdatePassengerAction3 updatePassengerAction3 = new UpdatePassengerAction3();


    @When("I want to Create Update Passenger Body I Create Contact Details")
    public void iWantToCreateUpdatePassengerBodyICreateContactDetails() {

        updatePassengerAction3.createContactBody();
    }

    @When("I want to Create Update Passenger Body I Create Address Details")
    public void iWantToCreateUpdatePassengerBodyICreateAddressDetails() {

        updatePassengerAction3.createAddressBody();
    }

    @When("I want to Create Update Passenger Body I Create Profile Details")
    public void iWantToCreateUpdatePassengerBodyICreateProfileDetails() {

        updatePassengerAction3.createProfileBody();
    }

    @When("I want to Create Update Passenger Body I Create Reference Details")
    public void iWantToCreateUpdatePassengerBodyICreateReferenceDetails() {

        updatePassengerAction3.createReference();
    }

    @When("I want to Create Update Passenger Body I Create Payload Details of Passenger One")
    public void iWantToCreateUpdatePassengerBodyICreatePayloadDetailsOfPassengerOne() {

        updatePassengerAction3.createPayloadBodyOne();
    }

    @When("I want to Create Update Passenger Body I Create Payload Details of all the Passengers")
    public void iWantToCreateUpdatePassengerBodyICreatePayloadDetailsOfAllThePassengers() {

        updatePassengerAction3.createPayloadBodyTwo();
    }

    @Then("I Combined the Update Passenger details body")
    public void iCombinedTheUpdatePassengerDetailsBody() {

        updatePassengerAction3.payloadFullBody();
    }


    @When("I create Update Passenger Body to Update Passenger Details")
    public void iCreateUpdatePassengerBodyToUpdatePassengerDetails() {

        updatePassengerAction3.updatePassengerFullBody();

    }

    @Then("I click send request for Update Passenger Request")
    public void iClickSendRequestForUpdatePassengerRequest() {

        updatePassengerAction3.updatePassengerRequestSend();

    }


}
