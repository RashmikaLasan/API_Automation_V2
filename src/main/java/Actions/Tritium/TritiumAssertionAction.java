package Actions.Tritium;

import Utilities.Log;
import io.restassured.response.ValidatableResponse;
import org.apache.log4j.Logger;
import static org.hamcrest.CoreMatchers.equalTo;

public class TritiumAssertionAction {

    public static ValidatableResponse validatableResponse;
    final Logger logger = Log.getLogData(Log.class.getName());

    public void TritiumStatusCode(int statusCode){

        validatableResponse = TritiumRequestAction.response.then().statusCode(statusCode);
        logger.info("Status Code 200 and its success for Tritium Response");

    }

    public void VerifyHotelCode(String hotelID){

        validatableResponse.body("availability.hotels[0].code",equalTo(hotelID));
        logger.info("Hotel Code Assertion Success for Tritium Response");
    }
}
