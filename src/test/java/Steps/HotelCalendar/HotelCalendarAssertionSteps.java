package Steps.HotelCalendar;

import Actions.HotelCalendar.HotelCalendarAssertionAction;
import cucumber.api.java.en.*;

public class HotelCalendarAssertionSteps {

    HotelCalendarAssertionAction HotelCalendarAssertionAction = new HotelCalendarAssertionAction();

    @Then("^I should get a successful response with status code (\\d+) for HTL Calendar Response$")
    public void iShouldGetASuccessfulResponseWithStatusCodeForHTLCalendarResponse(int statusCode){

        HotelCalendarAssertionAction.HotelCalendarStatusCode(statusCode);

    }


}
