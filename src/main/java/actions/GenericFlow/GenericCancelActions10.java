package actions.GenericFlow;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import utilities.Log;

import static actions.GenericFlow.GenericConfirmCartActions8.genBookingId;
import static actions.GenericFlow.GenericConfirmCartActions8.genBookingReference;
import static constants.EndPoints.BaseEnvironmet;
import static constants.EndPoints.PromoPara1;
import static io.restassured.RestAssured.given;

public class GenericCancelActions10 {

    public static RequestSpecification genCancellationRequest;
    public static Response genCancellationResponse;
    final Logger logger = Log.getLogData(Log.class.getName());

    public void genCancelRequest(String confirmReq, int reason, int cause, int userId, String bkgSource, String tbxOnly, String cnxEmptyBkg) {

        genCancellationRequest = given().queryParam("confirm", confirmReq).
                queryParam("reason", reason).
                queryParam("cause", cause).
                queryParam("userId", userId).
                queryParam("bkgSource", bkgSource).
                queryParam("tbxOnly", tbxOnly).
                queryParam("cnxEmptyBkg", cnxEmptyBkg).
                header("bkng-tkn", genBookingReference);

    }

    //Send Gen Cancellation Request
    public void sendGenCancelRequest() {

        genCancellationResponse = genCancellationRequest.when().delete(BaseEnvironmet + PromoPara1 + genBookingId);
    }

    //Generic Gen Cancellation Status Code Validation
    public void genCancellationStatusCode(int statusCode) {

        genCancellationResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Generic Cancellation Response");

    }

    //Generic Gen Calculate CNX charge Value
    public void genCnxChargeValue() {

        String genCancellationMsg = genCancellationResponse.jsonPath().getString("status.message");
        logger.info("Cancellation Message in Response is: " + genCancellationMsg);

    }
}
