package Steps.HotelBookFlow;

import Actions.HotelFlow.UpdatePassengerAction3;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PassengerUpdate3 {

    UpdatePassengerAction3 updatePassengerAction3 = new UpdatePassengerAction3();

    @When("I create Update Passenger Body to Update Passenger Details")
    public void iCreateUpdatePassengerBodyToUpdatePassengerDetails() {

        updatePassengerAction3.updatePassengerFullBody();

    }

    @Then("I click send request for Update Passenger Request")
    public void iClickSendRequestForUpdatePassengerRequest() {

        updatePassengerAction3.updatePassengerResponse();

    }

}
