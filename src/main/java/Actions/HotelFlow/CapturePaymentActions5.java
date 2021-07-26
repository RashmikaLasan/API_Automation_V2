package Actions.HotelFlow;

import Utilities.Log;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;

import static Actions.HotelFlow.CreateCartActions2.cartId;
import static Actions.HotelFlow.CreatePaymentSessionActions4.paymentReference;
import static Actions.HotelFlow.SearchActions1.keyControls;
import static Actions.HotelFlow.SearchActions1.totalPrice;
import static Constants.EndPoints.BaseEnvironmet;
import static Constants.EndPoints.PaymentSessionURL;
import static io.restassured.RestAssured.given;

public class CapturePaymentActions5 {

    public static Response capturePaymentResponse;
    final Logger logger = Log.getLogData(Log.class.getName());
    public JsonObject CapturePaymentBody;

    //Create Body of Capture Payment
    public void createCapturePaymentBody(String cardType, String currency) {

        JsonObject CapturePaymentPayload = new JsonObject();
        CapturePaymentPayload.addProperty("batchReceiptInfo", "pm_card_amex_threeDSecureNotSupported");
        CapturePaymentPayload.addProperty("bookingType", "STD");
        CapturePaymentPayload.addProperty("brand", "CT");
        CapturePaymentPayload.addProperty("cardExpMonth", "11");
        CapturePaymentPayload.addProperty("cardExpYear", 2035);
        CapturePaymentPayload.addProperty("cardHolderName", "Lasan");
        CapturePaymentPayload.addProperty("cardNumber", "4242");
        CapturePaymentPayload.addProperty("cardType", cardType);
        CapturePaymentPayload.addProperty("company", "CT");
        CapturePaymentPayload.addProperty("currency", currency);
        CapturePaymentPayload.addProperty("distributionChannel", "U");
        CapturePaymentPayload.addProperty("division", "CTDIV_LON");
        CapturePaymentPayload.addProperty("email", "test@test.test");
        CapturePaymentPayload.addProperty("isWeb", true);
        CapturePaymentPayload.addProperty("noOfDaysToDeparture", 10);
        CapturePaymentPayload.addProperty("paymentReference", paymentReference);
        CapturePaymentPayload.addProperty("paymentStatus", "");
        CapturePaymentPayload.addProperty("redirectUrl", "");
        CapturePaymentPayload.addProperty("total", totalPrice);
        CapturePaymentPayload.addProperty("transactionIdentifier", "");
        CapturePaymentPayload.addProperty("userId", 0);
        CapturePaymentPayload.addProperty("web", true);
        CapturePaymentPayload.addProperty("cartId", cartId);

        CapturePaymentBody = new JsonObject();
        CapturePaymentBody.add("keyControls", keyControls);
        CapturePaymentBody.add("payload", CapturePaymentPayload);

    }

    //Send the Capture Payment Request
    public void sendCapturePaymentRequest() {

        capturePaymentResponse = given().
                header("Content-Type", "application/json").
                body(CapturePaymentBody.toString()).
                when().
                put(BaseEnvironmet + PaymentSessionURL + "/" + paymentReference);

        logger.info("URL for Capture Payment Request is: " + BaseEnvironmet + PaymentSessionURL + "/" + paymentReference);
        capturePaymentResponse.prettyPrint().toString();
    }


}
