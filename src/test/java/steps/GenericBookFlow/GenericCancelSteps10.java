package steps.GenericBookFlow;

import actions.GenericFlow.GenericCancelActions10;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenericCancelSteps10 {

    GenericCancelActions10 genericCancelActions10 = new GenericCancelActions10();

    @Then("I create the Cancellation Request confirm as \"([^\"]*)\" reason as (\\d+) cause as (\\d+) userID as (\\d+) bkgSource as \"([^\"]*)\" tbxOnly as \"([^\"]*)\" cnxEmptyBkg as \"([^\"]*)\"")
    public void iCreateTheCancellationRequestConfirmAsReasonAsCauseAsUserIDAsBkgSourceAsTbxOnlyAsCnxEmptyBkgAs(String confirmReq, int reason, int cause, int userId, String bkgSource, String tbxOnly, String cnxEmptyBkg) {

        genericCancelActions10.genCancelRequest(confirmReq, reason, cause, userId, bkgSource, tbxOnly, cnxEmptyBkg);
    }

    @When("I send the Generic Cancellation Request")
    public void iSendTheGenericCancellationRequest() {

        genericCancelActions10.sendGenCancelRequest();
    }

    @Then("I should get a successful response with status code (\\d+) for Booking Cancellation")
    public void iShouldGetASuccessfulResponseWithStatusCodeForBookingCancellation(int statusCode) {

        genericCancelActions10.genCancellationStatusCode(statusCode);
    }


    @And("display the message of response of Cancellation Response")
    public void displayTheMessageOfResponseOfCancellationResponse() {

        genericCancelActions10.genCnxChargeValue();
    }
}
