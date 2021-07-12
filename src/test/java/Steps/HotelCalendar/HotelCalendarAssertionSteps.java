package Steps.HotelCalendar;

import Actions.HotelCalendar.HotelCalendarAssertions;
import cucumber.api.java.en.*;

public class HotelCalendarAssertionSteps {

    HotelCalendarAssertions hotelCalendarAssertions = new HotelCalendarAssertions();

    @Then("^I should get a successful response with status code (\\d+) for HTL Calendar Response$")
    public void iShouldGetASuccessfulResponseWithStatusCodeForHTLCalendarResponse(int statusCode){

        hotelCalendarAssertions.HotelCalendarStatusCode(statusCode);

    }


}
