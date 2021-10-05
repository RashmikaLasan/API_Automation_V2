package steps.GenericBookFlow;

import actions.GenericFlow.GenericCalculateCNXChargeActions9;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenericCalculateCnxChargeSteps9 {

    GenericCalculateCNXChargeActions9 genericCalculateCNXChargeActions9 = new GenericCalculateCNXChargeActions9();

    @When("I want to check the Cancellation Charge of the Booking")
    public void iWantToCheckTheCancellationChargeOfTheBooking() {

        genericCalculateCNXChargeActions9.genCnxChargeCalculation();
    }

    @Then("I click send Generic request for Calculate Cancellation Charge")
    public void iClickSendGenericRequestForCalculateCancellationCharge() {

        genericCalculateCNXChargeActions9.sendGenCalculateCnxCharge();

    }

    @Then("I should get a successful response with status code (\\d+) for Cancellation Charge Calculation")
    public void iShouldGetASuccessfulResponseWithStatusCodeForCancellationChargeCalculation(int statusCode) {

        genericCalculateCNXChargeActions9.genCnxChargeCalculationStatusCode(statusCode);
    }

    @And("display the Cancellation charge of the booking")
    public void displayTheCancellationChargeOfTheBooking() {

        genericCalculateCNXChargeActions9.genCnxChargeValue();
    }
}
