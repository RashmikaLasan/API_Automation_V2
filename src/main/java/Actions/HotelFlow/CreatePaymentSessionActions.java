package Actions.HotelFlow;

import Utilities.Log;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.response.*;
import org.apache.log4j.Logger;
import static Actions.HotelFlow.CreateCartActions2.cartId;
import static Actions.HotelFlow.SearchActions1.keyControls;
import static Actions.HotelFlow.SearchActions1.totalPrice;
import static Constants.EndPoints.BaseEnvironmet;
import static Constants.EndPoints.PaymentSessionURL;
import static io.restassured.RestAssured.given;

public class CreatePaymentSessionActions {

    public static Response createPaymentSessionResponse;
    final Logger logger = Log.getLogData(Log.class.getName());
    public JsonObject CreatePaymentSessionBody;
    public String paymentReference;

    //Create Body of Payment Session
    public void createPaymentSessionBody(String currency) {

        JsonObject PaymentSessionPayload = new JsonObject();
        PaymentSessionPayload.addProperty("batchReceiptInfo", "pm_card_amex_threeDSecureNotSupported");
        PaymentSessionPayload.addProperty("bookingType", "STD");
        PaymentSessionPayload.addProperty("brand", "CT");
        PaymentSessionPayload.addProperty("cardExpMonth", "");
        PaymentSessionPayload.addProperty("cardExpYear", "");
        PaymentSessionPayload.addProperty("cardHolderName", "");
        PaymentSessionPayload.addProperty("cardNumber", "");
        PaymentSessionPayload.addProperty("cardType", "");
        PaymentSessionPayload.addProperty("company", "CT");
        PaymentSessionPayload.addProperty("currency", currency);
        PaymentSessionPayload.addProperty("distributionChannel", "U");
        PaymentSessionPayload.addProperty("division", "CTDIV_LON");
        PaymentSessionPayload.addProperty("email", "test@test.test");
        PaymentSessionPayload.addProperty("isWeb", true);
        PaymentSessionPayload.addProperty("noOfDaysToDeparture", 10);
        PaymentSessionPayload.addProperty("paymentReference", "");
        PaymentSessionPayload.addProperty("paymentStatus", "");
        PaymentSessionPayload.addProperty("redirectUrl", "");
        PaymentSessionPayload.addProperty("total", totalPrice);
        PaymentSessionPayload.addProperty("transactionIdentifier", "");
        PaymentSessionPayload.addProperty("userId", 0);
        PaymentSessionPayload.addProperty("web", true);
        PaymentSessionPayload.addProperty("cartId", cartId);

        //Enter the Key Controls and create Full  Body
        CreatePaymentSessionBody = new JsonObject();
        CreatePaymentSessionBody.add("keyControls", keyControls);
        CreatePaymentSessionBody.add("payload", PaymentSessionPayload);

    }

    //Send the Request
    public void sendCreatePaymentSessionRequest() {

        createPaymentSessionResponse = given().
                header("Content-Type", "application/json").
                body(CreatePaymentSessionBody.toString()).
                when().
                post(BaseEnvironmet + PaymentSessionURL);
        createPaymentSessionResponse.prettyPrint().toString();
    }

    //Store the Payment Reference
    public void storePaymentReference() {

        paymentReference = createPaymentSessionResponse.path("data[0].paymentReference").toString();
        logger.info("Payment Reference is: " + paymentReference + " in Create Payment Session Response");

    }
}