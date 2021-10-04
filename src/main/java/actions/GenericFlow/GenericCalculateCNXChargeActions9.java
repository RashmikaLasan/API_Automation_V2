package actions.GenericFlow;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import utilities.Log;

import static actions.GenericFlow.GenericConfirmCartActions8.genBookingId;
import static constants.EndPoints.*;
import static io.restassured.RestAssured.given;


public class GenericCalculateCNXChargeActions9 {

    public static RequestSpecification genCnxChargeRequest;
    public static Response genCalculateCnxChargeResponse;
    final Logger logger = Log.getLogData(Log.class.getName());


    public void genCnxChargeCalculation() {

        genCnxChargeRequest = given().queryParam("chargeType", "CNX").
                queryParam("reason", "2").
                queryParam("cause", "499").
                queryParam("excludeInsurance", "false");

    }

    //Send Gen Calculate CNX charge Request
    public void sendGenCalculateCnxCharge() {

        genCalculateCnxChargeResponse = genCnxChargeRequest.when().get(BaseEnvironmet + CancellationPara1 + genBookingId + CancellationPara2);
        genCalculateCnxChargeResponse.prettyPrint();

    }

    //Generic Gen Calculate CNX charge Status Code Validation
    public void genCnxChargeCalculationStatusCode(int statusCode) {

        genCalculateCnxChargeResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Generic Calculate CNX charge Response");

    }

}
