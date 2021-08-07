package actions.HotelCalendar;

import utilities.Log;
import io.restassured.response.ValidatableResponse;
import org.apache.log4j.Logger;

public class HotelCalendarAssertionAction {

    public static ValidatableResponse validatableResponse;
    final Logger logger = Log.getLogData(Log.class.getName());


    //Hotel Calendar Response Status Code Assertion
    public void HotelCalendarStatusCode(int statusCode) {

        validatableResponse = HotelCalendarActions.response.then().statusCode(statusCode);
        logger.info("Status Code 200 and its success for HTL Calendar Response");

    }
}
