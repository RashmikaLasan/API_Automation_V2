package actions.GenericFlow;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import utilities.Log;

import static actions.GenericFlow.GenericConfirmCartActions8.genBookingId;
import static actions.GenericFlow.GenericConfirmCartActions8.genBookingReference;
import static actions.HotelFlow.RetrieveActions.retrieveResponse;
import static constants.EndPoints.BaseEnvironmet;
import static constants.EndPoints.PromoPara1;
import static io.restassured.RestAssured.given;

public class GenericRetrieveActions8 {

    public static Response retrieveGenResponse;
    public static RequestSpecification retrieveGenRequestSpecification;
    final Logger logger = Log.getLogData(Log.class.getName());

    public void genRetrieveRequestCreate(String userId, String userName, String clientID, String expand) {

        retrieveGenRequestSpecification = given().
                queryParam("userId", userId).
                queryParam("username", userName).
                queryParam("cliId", clientID).
                queryParam("expand", expand).
                header("bkng-tkn", genBookingReference);

    }

    //Send Retrieve Request
    public void sendGenRetrieveResponse() {

        retrieveGenResponse = retrieveGenRequestSpecification.
                when().get(BaseEnvironmet + PromoPara1 + genBookingId);
//        logger.info(retrieveGenResponse.prettyPrint());

    }

    //Retrieve Status Code Validation
    public void retrieveStatusCode(int statusCode) {

        retrieveGenResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Generic Retrieve Response");
    }
}
