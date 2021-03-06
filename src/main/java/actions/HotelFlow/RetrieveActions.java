package actions.HotelFlow;

import utilities.Log;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import static actions.HotelFlow.ConfirmCartActions7.bookingId;
import static actions.HotelFlow.ConfirmCartActions7.bookingReference;
import static constants.EndPoints.BaseEnvironmet;
import static constants.EndPoints.PromoPara1;
import static io.restassured.RestAssured.given;

public class RetrieveActions {

    public static Response retrieveResponse;
    public static RequestSpecification retrieveRequestSpecification;
    final Logger logger = Log.getLogData(Log.class.getName());


    public void retrieveRequestCreate(String userId, String userName, String clientID, String expand) {

        retrieveRequestSpecification = given().
                queryParam("userId", userId).
                queryParam("username", userName).
                queryParam("cliId", clientID).
                queryParam("expand", expand).
                header("bkng-tkn", bookingReference);

    }

    //Send Retrieve Request
    public void sendRetrieveResponse() {

        retrieveResponse = retrieveRequestSpecification.
                when().get(BaseEnvironmet + PromoPara1 + bookingId);
        logger.info(retrieveResponse.prettyPrint());

    }
}
