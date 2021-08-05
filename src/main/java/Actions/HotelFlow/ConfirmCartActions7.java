package Actions.HotelFlow;

import Utilities.Log;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.response.Response;
import org.apache.log4j.Logger;

import static Actions.HotelFlow.CreateCartActions2.cartId;
import static Constants.EndPoints.*;
import static io.restassured.RestAssured.*;

import static Actions.HotelFlow.SearchActions1.keyControls;

public class ConfirmCartActions7 {

    public static JsonObject ConfirmCartBody;
    public static Response confirmCartResponse;
    public String bookingId;
    public String bookingReference;
    final Logger logger = Log.getLogData(Log.class.getName());

    public void createConfirmCartBody() {

        ConfirmCartBody = new JsonObject();
        ConfirmCartBody.add("keyControls", keyControls);
    }

    public void sendConfirmCartRequest() {

        confirmCartResponse = given().
                header("Content-Type", "application/json").
                body(ConfirmCartBody.toString()).
                when().
                post(BaseEnvironmet + PromoPara1 + cartId + ConfirmPara);

        logger.info("Confirm Cart Request URL is: " + BaseEnvironmet + PromoPara1 + cartId + ConfirmPara);
    }

    //Store Booking ID
    public void storeBookingId() {

        bookingId = confirmCartResponse.path("data[0].summary.id").toString();
        logger.info("Booking ID in Confirm Cart Response is: " + bookingId);
    }

    //Store Booking Reference
    public void storeBookingReference() {

        bookingReference = confirmCartResponse.path("data[0].summary.bookingProperties.bookingReference").toString();
        logger.info("Booking Reference is: " + bookingReference + " in Confirm Cart Response");
    }
}
