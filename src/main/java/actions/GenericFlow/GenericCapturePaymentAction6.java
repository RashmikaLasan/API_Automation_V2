package actions.GenericFlow;

import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.response.Response;
import org.apache.log4j.Logger;
import utilities.Log;

import static actions.GenericFlow.GenericCreateCartAction2.genCartId;
import static actions.GenericFlow.GenericCreatePaymentSessionActions5.genericPaymentReference;
import static actions.GenericFlow.GenericSearchAction1.genericKeyControls;
import static actions.GenericFlow.GenericSearchAction1.genericTotalPrice;
import static actions.HotelFlow.CreateCartActions2.cartId;
import static actions.HotelFlow.CreatePaymentSessionActions4.paymentReference;
import static actions.HotelFlow.SearchActions1.keyControls;
import static actions.HotelFlow.SearchActions1.totalPrice;
import static constants.EndPoints.BaseEnvironmet;
import static constants.EndPoints.PaymentSessionURL;
import static io.restassured.RestAssured.given;

public class GenericCapturePaymentAction6 {

    public static Response captureGenericPaymentResponse;
    final Logger logger = Log.getLogData(Log.class.getName());
    public JsonObject genCapturePaymentBody;

    //Create Body of Capture Payment
    public void createGenericCapturePaymentBody(String cardType, String currency, String receipt, String brand) {

        JsonObject CapturePaymentPayload = new JsonObject();
        CapturePaymentPayload.addProperty("batchReceiptInfo", receipt);
        CapturePaymentPayload.addProperty("bookingType", "STD");
        CapturePaymentPayload.addProperty("brand", "CT");
        CapturePaymentPayload.addProperty("cardExpMonth", "11");
        CapturePaymentPayload.addProperty("cardExpYear", 2035);
        CapturePaymentPayload.addProperty("cardHolderName", "Lasan");
        CapturePaymentPayload.addProperty("cardNumber", "4242");
        CapturePaymentPayload.addProperty("cardType", cardType);
        CapturePaymentPayload.addProperty("company", brand);
        CapturePaymentPayload.addProperty("currency", currency);
        CapturePaymentPayload.addProperty("distributionChannel", "U");
        CapturePaymentPayload.addProperty("division", "CTDIV_LON");
        CapturePaymentPayload.addProperty("email", "test@test.test");
        CapturePaymentPayload.addProperty("isWeb", true);
        CapturePaymentPayload.addProperty("noOfDaysToDeparture", 10);
        CapturePaymentPayload.addProperty("paymentReference", genericPaymentReference);
        CapturePaymentPayload.addProperty("paymentStatus", "");
        CapturePaymentPayload.addProperty("redirectUrl", "");
        CapturePaymentPayload.addProperty("total", genericTotalPrice);
        CapturePaymentPayload.addProperty("transactionIdentifier", "");
        CapturePaymentPayload.addProperty("userId", 0);
        CapturePaymentPayload.addProperty("web", true);
        CapturePaymentPayload.addProperty("cartId", genCartId);

        genCapturePaymentBody = new JsonObject();
        genCapturePaymentBody.add("keyControls", genericKeyControls);
        genCapturePaymentBody.add("payload", CapturePaymentPayload);

    }

    //Send the Capture Payment Request
    public void sendGenericCapturePaymentRequest() {

        captureGenericPaymentResponse = given().
                header("Content-Type", "application/json").
                body(genCapturePaymentBody.toString()).
                when().
                put(BaseEnvironmet + PaymentSessionURL + "/" + genericPaymentReference);

        logger.info("URL for Capture Payment Request is: " + BaseEnvironmet + PaymentSessionURL + "/" + genericPaymentReference);
        captureGenericPaymentResponse.prettyPrint().toString();
    }

    //Capture Payment Request Status Code Validation
    public void genCapturePaymentRequestStatusCodeValidation(int statusCode) {

        captureGenericPaymentResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Generic Capture Payment Request");
    }


}
