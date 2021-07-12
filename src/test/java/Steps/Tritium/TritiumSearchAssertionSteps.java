package Steps.Tritium;

import Actions.Tritium.TritiumAssertionAction;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class TritiumSearchAssertionSteps {

    TritiumAssertionAction tritiumAssertionAction = new TritiumAssertionAction();

    @Then("^I should get a successful response with status code (\\d+) for Tritium Response$")
    public void iShouldGetASuccessfulResponseWithStatusCodeForTritiumResponse(int statusCode) {

        tritiumAssertionAction.TritiumStatusCode(statusCode);

    }

    @And("^HotelID \"([^\"]*)\" should be matched in response$")
    public void hotelidShouldBeMatchedInResponse(String hotelID)  {

        tritiumAssertionAction.VerifyHotelCode(hotelID);

    }
}
