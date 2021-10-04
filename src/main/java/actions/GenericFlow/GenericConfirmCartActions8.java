package actions.GenericFlow;

import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.response.Response;
import org.apache.log4j.Logger;
import utilities.Log;
import static actions.GenericFlow.GenericCreateCartAction2.genCartId;
import static actions.GenericFlow.GenericSearchAction1.genericKeyControls;
import static constants.EndPoints.*;
import static constants.EndPoints.ConfirmPara;
import static io.restassured.RestAssured.given;

public class GenericConfirmCartActions8 {


    public static JsonObject genConfirmCartBody;
    public static Response confirmGenCartResponse;
    public static String genBookingId;
    public static String genBookingReference;
    final Logger logger = Log.getLogData(Log.class.getName());


    public void createGenConfirmCartBody() {

        genConfirmCartBody = new JsonObject();
        genConfirmCartBody.add("keyControls", genericKeyControls);
    }

    //Send Generic Request to Confirm Cart
    public void sendGenConfirmCartRequest() {

        confirmGenCartResponse = given().
                header("Content-Type", "application/json").
                body(genConfirmCartBody.toString()).
                when().
                post(BaseEnvironmet + PromoPara1 + genCartId + ConfirmPara);

        logger.info(" Generic Confirm Cart Request URL is: " + BaseEnvironmet + PromoPara1 + genCartId + ConfirmPara);
//            logger.info(confirmGenCartResponse.prettyPrint().toString());
    }


    //Store Generic Booking ID
    public void storeGenBookingId() {

        genBookingId = confirmGenCartResponse.path("data[0].summary.id").toString();
        logger.info("Booking ID in Generic Confirm Cart Response is: " + genBookingId);
    }


    //Store Generic Booking Reference
    public void storeGenBookingReference() {

        genBookingReference = confirmGenCartResponse.path("data[0].summary.bookingProperties.bookingReference").toString();
        logger.info("Booking Reference is: " + genBookingReference + " in Generic Confirm Cart Response");
    }

    //Generic Confirm Cart Status Code Validation
    public void confirmGenCartStatusCode(int statusCode) {

        confirmGenCartResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Generic Confirm Cart Response");
    }

}
