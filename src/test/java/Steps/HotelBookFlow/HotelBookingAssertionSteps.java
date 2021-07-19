package Steps.HotelBookFlow;

import Actions.HotelFlow.HotelBookingAssertionActions;
import cucumber.api.java.en.Then;


public class HotelBookingAssertionSteps {

    HotelBookingAssertionActions hotelBookingAssertionActions = new HotelBookingAssertionActions();

    @Then("I should get a successful response as status code {int} for Hotel Search")
    public void iShouldGetASuccessfulResponseAsStatusCodeForHotelSearch(int statusCode) {

        hotelBookingAssertionActions.HotelSearchStatusCode(statusCode);
    }
}
