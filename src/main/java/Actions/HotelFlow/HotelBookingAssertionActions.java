package Actions.HotelFlow;

import Utilities.Log;
import io.restassured.response.ValidatableResponse;
import org.apache.log4j.Logger;

public class HotelBookingAssertionActions {

    public static ValidatableResponse validatableResponse;
    final Logger logger = Log.getLogData(Log.class.getName());


    //Hotel Search Status Code Validation
    public void HotelSearchStatusCode(int statusCode) {

        validatableResponse = SearchActions1.response.then().statusCode(statusCode);
        logger.info("Status Code 200 and its success for Hotel Search Response");

    }
}
